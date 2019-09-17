package com.risesin.service.dao.comuser;

import com.risesin.service.modules.comuser.entity.ChannelDefinition;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ChannelDefinition的Dao接口
 *
 * @author honey
 */
public interface ChannelDefinitionDao extends Repository<ChannelDefinition, Long>, JpaSpecificationExecutor<ChannelDefinition> {

}