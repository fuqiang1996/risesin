package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.ExtEnterpriseAtomicityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * ExtEnterpriseAtomicityInfo的Dao接口
 *
 * @author honey
 */
public interface ExtEnterpriseAtomicityInfoDao extends JpaRepository<ExtEnterpriseAtomicityInfo, Long>, JpaSpecificationExecutor<ExtEnterpriseAtomicityInfo> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update ExtEnterpriseAtomicityInfo  e set e.delFlag=-1  where e.id = :id")
    void softDeleteById(@Param("id") Long id);


    @Query("from ExtEnterpriseAtomicityInfo e  where e.id=:id and e.delFlag=0")
    ExtEnterpriseAtomicityInfo getById(@Param("id") Long id);


}