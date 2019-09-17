package com.risesin.service_api.dao.base;

import com.risesin.service.modules.base.entity.ExpensesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ExpensesType的Dao接口
*
* @author honey
*
*/
public interface ExpensesTypeDao extends JpaRepository<ExpensesType, Long>, JpaSpecificationExecutor<ExpensesType> {

}