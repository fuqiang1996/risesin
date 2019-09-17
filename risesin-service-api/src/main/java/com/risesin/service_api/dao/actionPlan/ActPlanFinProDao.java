package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * ActPlanFinPro的Dao接口
 *
 * @author honey
 */
public interface ActPlanFinProDao extends JpaRepository<ActPlanFinPro, Long>, JpaSpecificationExecutor<ActPlanFinPro> {

    @Query("select a from ActPlanFinPro a where a.proId = :proId ")
    ActPlanFinPro queryActPlanFinProByFinProId(@Param("proId") long proId);

    @Modifying
    @Transactional
    @Query("update ActPlanFinPro a set a.finProId = :finProId where a.proId = :proId")
    void updateActPlanFinProByFinProId(@Param("proId") long proId,@Param("finProId") long finProId);
}