package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.actionPlan.entity.Template;
import com.risesin.service_api.modules.aritle.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Article的Dao接口
 *
 * @author honey
 */
public interface ArticleDao extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {
    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update Article  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from Article e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<Article> findById(@Param("id") Long id);
}