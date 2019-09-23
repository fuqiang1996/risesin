package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.EnterpriseInfoType;
import com.risesin.service_api.modules.base.entity.ExpensesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * ExpensesType的Dao接口
 *
 * @author honey
 */
public interface ExpensesTypeDao extends JpaRepository<ExpensesType, Long>, JpaSpecificationExecutor<ExpensesType> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update ExpensesType  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);


    @Query("from ExpensesType e  where e.id=:id and e.delFlag=0")
    @Override
    Optional<ExpensesType> findById(@Param("id") Long id);
}