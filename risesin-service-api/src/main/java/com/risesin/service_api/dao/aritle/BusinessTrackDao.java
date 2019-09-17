package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.aritle.entity.BusinessTrack;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* BusinessTrack的Dao接口
*
* @author honey
*
*/
public interface BusinessTrackDao extends Repository<BusinessTrack, Long>, JpaSpecificationExecutor<BusinessTrack> {

}