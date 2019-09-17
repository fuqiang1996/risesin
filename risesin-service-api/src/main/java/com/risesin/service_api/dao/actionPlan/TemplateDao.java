package com.risesin.service_api.dao.actionPlan;

import com.risesin.service_api.modules.actionPlan.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Template的Dao接口
 *
 * @author honey
 */
public interface TemplateDao extends JpaRepository<Template, Long>, JpaSpecificationExecutor<Template> {

}