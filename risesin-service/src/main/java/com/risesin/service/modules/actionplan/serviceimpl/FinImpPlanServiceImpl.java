package com.risesin.service.modules.actionplan.serviceimpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.actionPlan.FinImpPlanDao;
import com.risesin.service_api.modules.actionPlan.entity.FinImpPlan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * FinImpPlan的服务接口的实现类
 *
 * @author honey
 */
@Service
public class FinImpPlanServiceImpl extends SingletonParent implements BaseInterface<FinImpPlan> {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private FinImpPlanDao finImpPlanDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<FinImpPlan> findAll() {
        return finImpPlanDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<FinImpPlan> findSearch(Map whereMap, int page, int size) {
        Specification<FinImpPlan> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return finImpPlanDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<FinImpPlan> findSearch(Map whereMap) {
        Specification<FinImpPlan> specification = createSpecification(whereMap);
        return finImpPlanDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public FinImpPlan findById(Long id) {
        return finImpPlanDao.findById(id).get();
    }

    /**
     * 增加
     *
     * @param value
     */
    public void add(FinImpPlan value) {
        finImpPlanDao.save(value);
    }

    /**
     * 修改
     *
     * @param value
     */
    public void update(FinImpPlan value) {
        finImpPlanDao.save(value);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Long id) {
        finImpPlanDao.deleteById(id);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<FinImpPlan> createSpecification(Map searchMap) {

        return new Specification<FinImpPlan>() {

            @Override
            public Predicate toPredicate(Root<FinImpPlan> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List
                        <Predicate> predicateList = new ArrayList
                        <Predicate>();
//                Predicate predicateExamDelFlag = cb.ge(root.get("delFlag").as(Integer.class), 0);
//                Predicate predicateExamAll  = cb.and(predicateExamDelFlag);
                // proName
                if (searchMap.get("proName") != null && !"".equals(searchMap.get("proName"))) {
                    predicateList.add(cb.like(root.get("proName").as(String.class),
                            "%" + (String) searchMap.get("proName") + "%"));
                }
                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };
    }
}