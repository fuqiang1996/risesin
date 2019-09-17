package com.risesin.service.modules.system.serviceImpl;

import com.risesin.service_api.dao.sysuser.SysRoleDao;
import com.risesin.service_api.modules.system.entity.SysRole;
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
 * role服务层
 * 
 * @author Administrator
 *
 */
@Service
public class RoleServiceImpl {

	@Autowired
	private SysRoleDao sysRoleDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<SysRole> findAll() {
		return sysRoleDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<SysRole> findSearch(Map whereMap, int page, int size) {
		Specification<SysRole> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return sysRoleDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<SysRole> findSearch(Map whereMap) {
		Specification<SysRole> specification = createSpecification(whereMap);
		return sysRoleDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkRoleId
	 * @return
	 */
	public SysRole findById(Long pkRoleId) {
		return sysRoleDao.findById(pkRoleId).get();
	}

	/**
	 * 增加
	 * @param sysRole
	 */
	public void add(SysRole sysRole) {
		// sysRole.setPkRoleId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		sysRoleDao.save(sysRole);
	}

	/**
	 * 修改
	 * @param sysRole
	 */
	public void update(SysRole sysRole) {
		sysRoleDao.save(sysRole);
	}

	/**
	 * 删除
	 * @param pkRoleId
	 */
	public void deleteById(Long pkRoleId) {
		sysRoleDao.deleteById(pkRoleId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<SysRole> createSpecification(Map searchMap) {

		return new Specification<SysRole>() {

			@Override
			public Predicate toPredicate(Root<SysRole> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 角色名称
                if (searchMap.get("roleName")!=null && !"".equals(searchMap.get("roleName"))) {
                	predicateList.add(cb.like(root.get("roleName").as(String.class), "%"+(String)searchMap.get("roleName")+"%"));
                }
                // 角色标识
                if (searchMap.get("roleSign")!=null && !"".equals(searchMap.get("roleSign"))) {
                	predicateList.add(cb.like(root.get("roleSign").as(String.class), "%"+(String)searchMap.get("roleSign")+"%"));
                }
                // 排序
                if (searchMap.get("roleOrderNum")!=null && !"".equals(searchMap.get("roleOrderNum"))) {
                	predicateList.add(cb.like(root.get("roleOrderNum").as(String.class), "%"+(String)searchMap.get("roleOrderNum")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
