package com.risesin.service.modules.pay.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.pay.ProjectExpenseOrderDao;
import com.risesin.service_api.modules.pay.entity.ProjectExpenseOrder;
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
 * ProjectExpenseOrder服务层
 * 
 * @author Darling
 *
 */
@Service
public class ProjectExpenseOrderServiceImpl extends SingletonParent implements BaseInterface<ProjectExpenseOrder> {

	@Autowired
	private ProjectExpenseOrderDao projectExpenseOrderDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<ProjectExpenseOrder> findAll() {
		return projectExpenseOrderDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<ProjectExpenseOrder> findSearch(Map whereMap, int page, int size) {
		Specification<ProjectExpenseOrder> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return projectExpenseOrderDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<ProjectExpenseOrder> findSearch(Map whereMap) {
		Specification<ProjectExpenseOrder> specification = createSpecification(whereMap);
		return projectExpenseOrderDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkExpOrdId
	 * @return
	 */
	public ProjectExpenseOrder findById(Long pkExpOrdId) {
		return projectExpenseOrderDao.findById(pkExpOrdId).get();
	}

	/**
	 * 增加
	 * @param projectExpenseOrder
	 */
	public void add(ProjectExpenseOrder projectExpenseOrder) {
		projectExpenseOrderDao.save(projectExpenseOrder);
	}

	/**
	 * 修改
	 * @param expenseOrder
	 */
	public void update(ProjectExpenseOrder expenseOrder) {
		projectExpenseOrderDao.save(expenseOrder);
	}

	/**
	 * 删除
	 * @param pkExpOrdId
	 */
	public void deleteById(Long pkExpOrdId) {
		projectExpenseOrderDao.deleteById(pkExpOrdId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<ProjectExpenseOrder> createSpecification(Map searchMap) {

		return new Specification<ProjectExpenseOrder>() {

			@Override
			public Predicate toPredicate(Root<ProjectExpenseOrder> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("expOrdCode")!=null && !"".equals(searchMap.get("expOrdCode"))) {
                	predicateList.add(cb.like(root.get("expOrdCode").as(String.class), "%"+(String)searchMap.get("expOrdCode")+"%"));
                }
                // 用户名称
                if (searchMap.get("comUsername")!=null && !"".equals(searchMap.get("comUsername"))) {
                	predicateList.add(cb.like(root.get("comUsername").as(String.class), "%"+(String)searchMap.get("comUsername")+"%"));
                }
                // 商品名称
                if (searchMap.get("commodityName")!=null && !"".equals(searchMap.get("commodityName"))) {
                	predicateList.add(cb.like(root.get("commodityName").as(String.class), "%"+(String)searchMap.get("commodityName")+"%"));
                }
                // 商品链接
                if (searchMap.get("commodityUrl")!=null && !"".equals(searchMap.get("commodityUrl"))) {
                	predicateList.add(cb.like(root.get("commodityUrl").as(String.class), "%"+(String)searchMap.get("commodityUrl")+"%"));
                }
                // 备注
                if (searchMap.get("expOrdRemark")!=null && !"".equals(searchMap.get("expOrdRemark"))) {
                	predicateList.add(cb.like(root.get("expOrdRemark").as(String.class), "%"+(String)searchMap.get("expOrdRemark")+"%"));
                }
                // 服务包code
                if (searchMap.get("serPackageCode")!=null && !"".equals(searchMap.get("serPackageCode"))) {
                	predicateList.add(cb.like(root.get("serPackageCode").as(String.class), "%"+(String)searchMap.get("serPackageCode")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
