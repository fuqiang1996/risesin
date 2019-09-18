package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.ChildcaseLinEntatoinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* ChildcaseLinEntatoinfo的Dao接口
*
* @author honey
*
*/
public interface ChildcaseLinEntatoinfoDao extends JpaRepository<ChildcaseLinEntatoinfo, Long>, JpaSpecificationExecutor<ChildcaseLinEntatoinfo>  {

}