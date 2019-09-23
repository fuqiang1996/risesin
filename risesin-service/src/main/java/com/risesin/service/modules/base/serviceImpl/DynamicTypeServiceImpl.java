package com.risesin.service.modules.base.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.base.DynamicTypeDao;
import com.risesin.service_api.modules.base.entity.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * DynamicType服务层
 * 
 * @author Darling
 *
 */
@Service
public class DynamicTypeServiceImpl extends SingletonParent implements BaseInterface<DynamicType> {

	@Autowired
	private DynamicTypeDao dynamicTypeDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<DynamicType> findAll() {
		return dynamicTypeDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<DynamicType> findSearch(Map whereMap, int page, int size) {
		Specification<DynamicType> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return dynamicTypeDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<DynamicType> findSearch(Map whereMap) {
		Specification<DynamicType> specification = createSpecification(whereMap);
		return dynamicTypeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkDynTypId
	 * @return
	 */
	public DynamicType findById(Long pkDynTypId) {
		return dynamicTypeDao.findById(pkDynTypId).get();
	}

	/**
	 * 增加
	 * @param type
	 */
	public void add(DynamicType type) {
		dynamicTypeDao.save(type);
	}

	/**
	 * 修改
	 * @param type
	 */
	public void update(DynamicType type) {
		dynamicTypeDao.save(type);
	}

	/**
	 * 删除
	 * @param pkDynTypId
	 */
	public void deleteById(Long pkDynTypId) {
		dynamicTypeDao.deleteById(pkDynTypId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<DynamicType> createSpecification(Map searchMap) {

		return new Specification<DynamicType>() {

			@Override
			public Predicate toPredicate(Root<DynamicType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // dyn_typ_code
                if (searchMap.get("dynTypCode")!=null && !"".equals(searchMap.get("dynTypCode"))) {
                	predicateList.add(cb.like(root.get("dynTypCode").as(String.class), "%"+(String)searchMap.get("dynTypCode")+"%"));
                }
                // dyn_typ_name
                if (searchMap.get("dynTypName")!=null && !"".equals(searchMap.get("dynTypName"))) {
                	predicateList.add(cb.like(root.get("dynTypName").as(String.class), "%"+(String)searchMap.get("dynTypName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
