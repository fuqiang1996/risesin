package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.FintypeLinkChildcase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* FintypeLinkChildcase的Dao接口
*
* @author honey
*
*/
public interface FintypeLinkChildcaseDao extends JpaRepository<FintypeLinkChildcase, Long>, JpaSpecificationExecutor<FintypeLinkChildcase>  {

}