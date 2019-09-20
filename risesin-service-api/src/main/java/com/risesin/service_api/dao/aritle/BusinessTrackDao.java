package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.actionPlan.entity.Template;
import com.risesin.service_api.modules.aritle.entity.BusinessTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * BusinessTrack的Dao接口
 *
 * @author honey
 */
public interface BusinessTrackDao extends JpaRepository<BusinessTrack, Long>, JpaSpecificationExecutor<BusinessTrack> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update BusinessTrack  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from BusinessTrack e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<BusinessTrack> findById(@Param("id") Long id);
}