package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.LegalRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* LegalRepresentative的Dao接口
*
* @author honey
*
*/
public interface LegalRepresentativeDao extends JpaRepository<LegalRepresentative, Long>, JpaSpecificationExecutor<LegalRepresentative> {

}