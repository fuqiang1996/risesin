package com.risesin.service.modules.comment.serviceImpl;

import com.risesin.service.baseService.BaseInterface;
import com.risesin.service.baseService.SingletonParent;
import com.risesin.service_api.dao.comment.UserConsultationCommentDao;
import com.risesin.service_api.modules.comment.entity.UserConsultationComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserConsultationCommentImpl extends SingletonParent implements BaseInterface<UserConsultationComment> {

    @Autowired
    private UserConsultationCommentDao consultationCommentDao;

    @Override
    public List<UserConsultationComment> findAll() {
        return consultationCommentDao.findAll();
    }

    @Override
    public Page<UserConsultationComment> findSearch(Map whereMap, int page, int size) {
        return null;
    }

    @Override
    public List<UserConsultationComment> findSearch(Map whereMap) {
        return null;
    }

    @Override
    public UserConsultationComment findById(Long id) {
        return consultationCommentDao.findById(id).get();
    }

    @Override
    public void add(UserConsultationComment userConsultationComment) {
        consultationCommentDao.save(userConsultationComment);
    }

    @Override
    public void update(UserConsultationComment userConsultationComment) {
        consultationCommentDao.save(userConsultationComment);
    }

    @Override
    public void deleteById(Long id) {
        consultationCommentDao.deleteById(id);

    }
}
