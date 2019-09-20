package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.aritle.entity.Article;
import com.risesin.service_api.modules.aritle.entity.Sharing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Sharing的Dao接口
 *
 * @author honey
 */
public interface SharingDao extends JpaRepository<Sharing, Long>, JpaSpecificationExecutor<Sharing> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update Sharing  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from Sharing e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<Sharing> findById(@Param("id") Long id);
}