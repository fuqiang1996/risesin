package com.risesin.service.dao.actionPlan;

import com.risesin.service.modules.actionPlan.entity.Template;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Template的Dao接口
 *
 * @author honey
 */
public interface TemplateDao extends Repository<Template, Long>, JpaSpecificationExecutor<Template> {

}