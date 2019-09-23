package com.risesin.service.modules.actionplan.serviceimpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.actionPlan.TemplateDao;
import com.risesin.service_api.modules.actionPlan.entity.Template;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Template的服务接口的实现类
 *
 * @author honey
 */
@Service
public class TemplateServiceImpl extends SingletonParent implements TopInterface<Template> {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private TemplateDao templateDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<Template> findAll() {
        return templateDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<Template> findSearch(Map whereMap, int page, int size) {
        Specification<Template> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return templateDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<Template> findSearch(Map whereMap) {
        Specification<Template> specification = createSpecification(whereMap);
        return templateDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public Template findById(Long id) {
        return templateDao.findById(id).get();
    }


    /**
     * 增加
     *
     * @param value
     */
    public void add(Template value) {
        templateDao.save(value);
    }

    /**
     * 修改
     *
     * @param value
     */
    public void update(Template value) {
        templateDao.save(value);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Long id) {
        templateDao.deleteById(id);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<Template> createSpecification(Map searchMap) {

        return new Specification<Template>() {

            @Override
            public Predicate toPredicate(Root<Template> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List
                        <Predicate> predicateList = new ArrayList
                        <>();
                // 方案名称
                if (searchMap.get("proName") != null && !"".equals(searchMap.get("proName"))) {
                    predicateList.add(cb.like(root.get("proName").as(String.class),
                            "%" + (String) searchMap.get("proName") + "%"));
                }

                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };
    }
}