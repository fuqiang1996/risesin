package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * ActPlanFinPro的Dao接口
 *
 * @author honey
 */
public interface ActPlanFinProDao extends JpaRepository<ActPlanFinPro, Long>, JpaSpecificationExecutor<ActPlanFinPro> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update ActPlanFinPro  a set a.actProId=-1,a.finProId=-1 where a.id = :id")
    void deleteByIds(@Param("id") Long id);


}