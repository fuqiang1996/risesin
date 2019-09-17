package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.aritle.entity.Sharing;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Sharing的Dao接口
 *
 * @author honey
 */
public interface SharingDao extends Repository<Sharing, Long>, JpaSpecificationExecutor<Sharing> {

}