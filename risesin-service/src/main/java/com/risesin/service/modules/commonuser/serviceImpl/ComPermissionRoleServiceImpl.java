package com.risesin.service.modules.commonuser.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.comuser.ComPermissionRoleDao;
import com.risesin.service_api.dao.sysuser.ExtSysUserDao;
import com.risesin.service_api.modules.comuser.entity.ComPermissionRole;
import com.risesin.service_api.modules.system.entity.ExtSysUser;
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

/**
 * ComPermissionRole的服务接口的实现类
 *
 * @author honey
 */
@Service
public class ComPermissionRoleServiceImpl extends SingletonParent implements TopInterface {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private ComPermissionRoleDao comPermissionRoleDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<ComPermissionRole> findAll() {
        return comPermissionRoleDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<ComPermissionRole> findSearch(Map whereMap, int page, int size) {
        Specification<ComPermissionRole> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return comPermissionRoleDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<ComPermissionRole> findSearch(Map whereMap) {
        Specification<ComPermissionRole> specification = createSpecification(whereMap);
        return comPermissionRoleDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public ComPermissionRole findById(Long id) {
        return comPermissionRoleDao.findById(id).get();
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    /**
     * 增加
     *
     * @param value
     */
    public void add(ComPermissionRole value) {
        comPermissionRoleDao.save(value);
    }

    /**
     * 修改
     *
     * @param value
     */
    public void update(ComPermissionRole value) {
        comPermissionRoleDao.save(value);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Long id) {
        comPermissionRoleDao.deleteById(id);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<ComPermissionRole> createSpecification(Map searchMap) {

        return new Specification<ComPermissionRole>() {

            @Override
            public Predicate toPredicate(Root<ComPermissionRole> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List
                        <Predicate> predicateList = new ArrayList
                        <Predicate>();
                // 公司网址
                if (searchMap.get("loanAgenWebsite") != null && !"".equals(searchMap.get("loanAgenWebsite"))) {
                    predicateList.add(cb.like(root.get("loanAgenWebsite").as(String.class),
                            "%" + (String) searchMap.get("loanAgenWebsite") + "%"));
                }
                // 公司名称
                if (searchMap.get("loanAgenName") != null && !"".equals(searchMap.get("loanAgenName"))) {
                    predicateList.add(cb.like(root.get("loanAgenName").as(String.class),
                            "%" + (String) searchMap.get("loanAgenName") + "%"));
                }
                // 办公地址
                if (searchMap.get("loanBusinessAddress") != null && !"".equals(searchMap.get("loanBusinessAddress"))) {
                    predicateList.add(cb.like(root.get("loanBusinessAddress").as(String.class),
                            "%" + (String) searchMap.get("loanBusinessAddress") + "%"));
                }
                // 英文名称
                if (searchMap.get("loanEnglishName") != null && !"".equals(searchMap.get("loanEnglishName"))) {
                    predicateList.add(cb.like(root.get("loanEnglishName").as(String.class),
                            "%" + (String) searchMap.get("loanEnglishName") + "%"));
                }
                // 所属行业
                if (searchMap.get("loanIndustryInvolved") != null && !"".equals(searchMap.get("loanIndustryInvolved"))) {
                    predicateList.add(cb.like(root.get("loanIndustryInvolved").as(String.class),
                            "%" + (String) searchMap.get("loanIndustryInvolved") + "%"));
                }
                // 电话
                if (searchMap.get("loanPhone") != null && !"".equals(searchMap.get("loanPhone"))) {
                    predicateList.add(cb.like(root.get("loanPhone").as(String.class), "%" + (String) searchMap.get("loanPhone") + "%"));
                }
                // 公司注册地址
                if (searchMap.get("loanRegAddress") != null && !"".equals(searchMap.get("loanRegAddress"))) {
                    predicateList.add(cb.like(root.get("loanRegAddress").as(String.class),
                            "%" + (String) searchMap.get("loanRegAddress") + "%"));
                }
                // 区域
                if (searchMap.get("loanAgenArea") != null && !"".equals(searchMap.get("loanAgenArea"))) {
                    predicateList.add(cb.like(root.get("loanAgenArea").as(String.class),
                            "%" + (String) searchMap.get("loanAgenArea") + "%"));
                }
                // 公司全称
                if (searchMap.get("loanAgenFullname") != null && !"".equals(searchMap.get("loanAgenFullname"))) {
                    predicateList.add(cb.like(root.get("loanAgenFullname").as(String.class),
                            "%" + (String) searchMap.get("loanAgenFullname") + "%"));
                }

                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };
    }
}