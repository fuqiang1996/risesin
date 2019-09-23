package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.core.FinancingEnterpriseDao;
import com.risesin.service_api.modules.core.entity.FinancingEnterprise;
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
 * FinancingEnterprise服务层
 * 
 * @author Darling
 *
 */
@Service
public class FinancingEnterpriseServiceImpl extends SingletonParent implements BaseInterface<FinancingEnterprise> {

	@Autowired
	private FinancingEnterpriseDao enterpriseDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<FinancingEnterprise> findAll() {
		return enterpriseDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<FinancingEnterprise> findSearch(Map whereMap, int page, int size) {
		Specification<FinancingEnterprise> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return enterpriseDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<FinancingEnterprise> findSearch(Map whereMap) {
		Specification<FinancingEnterprise> specification = createSpecification(whereMap);
		return enterpriseDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinEntId
	 * @return
	 */
	public FinancingEnterprise findById(Long pkFinEntId) {
		return enterpriseDao.findById(pkFinEntId).get();
	}

	/**
	 * 增加
	 * @param enterprise
	 */
	public void add(FinancingEnterprise enterprise) {
		// enterprise.setPkFinEntId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		enterpriseDao.save(enterprise);
	}

	/**
	 * 修改
	 * @param enterprise
	 */
	public void update(FinancingEnterprise enterprise) {
		enterpriseDao.save(enterprise);
	}

	/**
	 * 删除
	 * @param pkFinEntId
	 */
	public void deleteById(Long pkFinEntId) {
		enterpriseDao.deleteById(pkFinEntId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<FinancingEnterprise> createSpecification(Map searchMap) {

		return new Specification<FinancingEnterprise>() {

			@Override
			public Predicate toPredicate(Root<FinancingEnterprise> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finEntCode")!=null && !"".equals(searchMap.get("finEntCode"))) {
                	predicateList.add(cb.like(root.get("finEntCode").as(String.class), "%"+(String)searchMap.get("finEntCode")+"%"));
                }
                // 企业名称
                if (searchMap.get("finEntName")!=null && !"".equals(searchMap.get("finEntName"))) {
                	predicateList.add(cb.like(root.get("finEntName").as(String.class), "%"+(String)searchMap.get("finEntName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
