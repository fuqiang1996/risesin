package com.risesin.service_api.dao.comuser;

import com.risesin.service_api.modules.comuser.entity.ChannelDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ChannelDefinition的Dao接口
 *
 * @author honey
 */
public interface ChannelDefinitionDao extends JpaRepository<ChannelDefinition, Long>, JpaSpecificationExecutor<ChannelDefinition> {

}