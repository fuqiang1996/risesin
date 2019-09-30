package com.risesin.service.modules.system.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.sysuser.SysUserDao;
import com.risesin.service_api.modules.system.entity.SysUser;
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
 * SysUser的服务接口的实现类
 *
 * @author honey
 */
@Service
public class SysUserServiceImpl extends SingletonParent implements BaseInterface<SysUser> {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private SysUserDao sysUserDao;

    public SysUser findByAccountAndPassword(String account, String password) {
        return sysUserDao.findByAccountAndPassword(account, password);
    }

    /**
     * 获取角色名
     *
     * @param roleIds
     * @return
    //     */
//    public List<String> getRoleName(String roleIds) {
////        String[] strings = Func.toStrArray(roleIds);
//        List<String> roles = Func.toStrList(roleIds);
//        return sysUserDao.findByIdIn(roles);
//    }

    /**
     * 获取部门名
     *
     * @param deptIds
     * @return
     */
    List<String> getDeptName(String deptIds) {
        return null;
    }


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<SysUser> findSearch(Map whereMap, int page, int size) {
        Specification<SysUser> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return sysUserDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<SysUser> findSearch(Map whereMap) {
        Specification<SysUser> specification = createSpecification(whereMap);
        return sysUserDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public SysUser findById(Long id) {
        return sysUserDao.getById(id);
    }


    /**
     * 增加
     *
     * @param user
     */
    public void add(SysUser user) {
        sysUserDao.save(user);
    }

    /**
     * 修改
     *
     * @param value
     */
    public void update(SysUser value) {
        sysUserDao.save(value);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Long id) {
        sysUserDao.deleteById(id);
    }

    public void deleteByIds(List<Long> ids) {
        sysUserDao.deleteByIds(ids);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<SysUser> createSpecification(Map searchMap) {

        return new Specification<SysUser>() {

            @Override
            public Predicate toPredicate(Root<SysUser> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List
                        <Predicate> predicateList = new ArrayList
                        <Predicate>();
                // 账户名
                if (searchMap.get("account") != null && !"".equals(searchMap.get("account"))) {
                    predicateList.add(cb.like(root.get("account").as(String.class),
                            "%" + (String) searchMap.get("account") + "%"));
                }
                // 姓名
                if (searchMap.get("userName") != null && !"".equals(searchMap.get("userName"))) {
                    predicateList.add(cb.like(root.get("userName").as(String.class),
                            "%" + (String) searchMap.get("userName") + "%"));
                }

                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };
    }
}