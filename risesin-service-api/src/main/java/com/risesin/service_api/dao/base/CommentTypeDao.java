package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.CommentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * CommentType数据访问接口
 * @author Darling
 *
 */
public interface CommentTypeDao extends JpaRepository<CommentType,Long>,JpaSpecificationExecutor<CommentType>{
	
}
