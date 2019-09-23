package com.risesin.service_api.dao.comment;

import com.risesin.service_api.modules.comment.entity.UserConsultationComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserConsultationCommentDao extends JpaRepository<UserConsultationComment, Long>, JpaSpecificationExecutor<UserConsultationComment> {
}
