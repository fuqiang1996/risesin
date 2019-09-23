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
import com.risesin.service_api.dao.base.ExpensesTypeDao;
import com.risesin.service_api.modules.base.entity.ExpensesType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;



/**
 * ExpensesType服务层
 * 
 * @author Darling
 *
 */
@Service
public class ExpensesTypeServiceImpl extends SingletonParent implements BaseInterface<ExpensesType> {

	@Autowired
	private ExpensesTypeDao expensesTypeDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<ExpensesType> findAll() {
		return expensesTypeDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<ExpensesType> findSearch(Map whereMap, int page, int size) {
		Specification<ExpensesType> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return expensesTypeDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<ExpensesType> findSearch(Map whereMap) {
		Specification<ExpensesType> specification = createSpecification(whereMap);
		return expensesTypeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkExpTypId
	 * @return
	 */
	public ExpensesType findById(Long pkExpTypId) {
		return expensesTypeDao.findById(pkExpTypId).get();
	}

	/**
	 * 增加
	 * @param type
	 */
	public void add(ExpensesType type) {
		expensesTypeDao.save(type);
	}

	/**
	 * 修改
	 * @param type
	 */
	public void update(ExpensesType type) {
		expensesTypeDao.save(type);
	}

	/**
	 * 删除
	 * @param pkExpTypId
	 */
	public void deleteById(Long pkExpTypId) {
		expensesTypeDao.deleteById(pkExpTypId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<ExpensesType> createSpecification(Map searchMap) {

		return new Specification<ExpensesType>() {

			@Override
			public Predicate toPredicate(Root<ExpensesType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // exp_typ_code
                if (searchMap.get("expTypCode")!=null && !"".equals(searchMap.get("expTypCode"))) {
                	predicateList.add(cb.like(root.get("expTypCode").as(String.class), "%"+(String)searchMap.get("expTypCode")+"%"));
                }
                // exp_typ_name
                if (searchMap.get("expTypName")!=null && !"".equals(searchMap.get("expTypName"))) {
                	predicateList.add(cb.like(root.get("expTypName").as(String.class), "%"+(String)searchMap.get("expTypName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
