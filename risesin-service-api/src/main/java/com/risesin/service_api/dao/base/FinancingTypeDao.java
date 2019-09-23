package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.ExpensesType;
import com.risesin.service_api.modules.base.entity.FinancingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * FinancingType的Dao接口
 *
 * @author honey
 */
public interface FinancingTypeDao extends JpaRepository<FinancingType, Long>, JpaSpecificationExecutor<FinancingType> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update FinancingType  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from FinancingType e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<FinancingType> findById(@Param("id") Long id);
}