package com.risesin.service_api.dao.comment;

import com.risesin.service_api.modules.comment.entity.LoanAgencyComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * LoanAgencyComment数据访问接口
 * @author Darling
 *
 */
public interface LoanAgencyCommentDao extends JpaRepository<LoanAgencyComment,Long>,JpaSpecificationExecutor<LoanAgencyComment>{
	
}
