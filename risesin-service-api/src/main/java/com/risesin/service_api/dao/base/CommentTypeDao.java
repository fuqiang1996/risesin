package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.CommentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * CommentType数据访问接口
 *
 * @author Darling
 */
public interface CommentTypeDao extends JpaRepository<CommentType, Long>, JpaSpecificationExecutor<CommentType> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update CommentType  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from CommentType e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<CommentType> findById(@Param("id") Long id);
}
