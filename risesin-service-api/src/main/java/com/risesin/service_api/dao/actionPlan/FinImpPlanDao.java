package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.FinImpPlan;
import com.risesin.service_api.modules.actionPlan.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * FinImpPlan的Dao接口
 *
 * @author honey
 */
public interface FinImpPlanDao extends JpaRepository<FinImpPlan, Long>, JpaSpecificationExecutor<FinImpPlan> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update FinImpPlan  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from FinImpPlan e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<FinImpPlan> findById(@Param("id") Long id);


    @Query("from FinImpPlan e  where e.delFlag=0")
    @Override
    List<FinImpPlan> findAll();
}