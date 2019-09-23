package com.risesin.service.modules.comment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.comment.LoanAgencyCommentDao;
import com.risesin.service_api.modules.comment.entity.LoanAgencyComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


/**
 * LoanagencyComment服务层
 *
 * @author Darling
 */
@Service
public class LoanagencyCommentServiceImpl extends SingletonParent implements TopInterface<LoanAgencyComment> {

    @Autowired
    private LoanAgencyCommentDao commentDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<LoanAgencyComment> findAll() {
        return commentDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<LoanAgencyComment> findSearch(Map whereMap, int page, int size) {
        Specification<LoanAgencyComment> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return commentDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<LoanAgencyComment> findSearch(Map whereMap) {
        Specification<LoanAgencyComment> specification = createSpecification(whereMap);
        return commentDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param pkCommentId
     * @return
     */
    public LoanAgencyComment findById(Long pkCommentId) {
        return commentDao.findById(pkCommentId).get();
    }

    /**
     * 增加
     *
     * @param comment
     */
    public void add(LoanAgencyComment comment) {
        commentDao.save(comment);
    }

    /**
     * 修改
     *
     * @param comment
     */
    public void update(LoanAgencyComment comment) {
        commentDao.save(comment);
    }

    /**
     * 删除
     *
     * @param pkCommentId
     */
    public void deleteById(Long pkCommentId) {
        commentDao.deleteById(pkCommentId);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<LoanAgencyComment> createSpecification(Map searchMap) {

        return new Specification<LoanAgencyComment>() {

            @Override
            public Predicate toPredicate(Root<LoanAgencyComment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicateList = new ArrayList<Predicate>();
                // 评价描述
                if (searchMap.get("commentDescription") != null && !"".equals(searchMap.get("commentDescription"))) {
                    predicateList.add(cb.like(root.get("commentDescription").as(String.class), "%" + (String) searchMap.get("commentDescription") + "%"));
                }

                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };

    }

}
