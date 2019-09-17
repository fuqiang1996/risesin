package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.core.FinancingPlanDao;
import com.risesin.service_api.modules.core.entity.FinancingPlan;
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
 * FinancingPlan服务层
 * 
 * @author Darling
 *
 */
@Service
public class FinancingPlanServiceImpl implements TopInterface<FinancingPlan> {

	@Autowired
	private FinancingPlanDao planDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<FinancingPlan> findAll() {
		return planDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<FinancingPlan> findSearch(Map whereMap, int page, int size) {
		Specification<FinancingPlan> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return planDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<FinancingPlan> findSearch(Map whereMap) {
		Specification<FinancingPlan> specification = createSpecification(whereMap);
		return planDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinPlaId
	 * @return
	 */
	public FinancingPlan findById(Long pkFinPlaId) {
		return planDao.findById(pkFinPlaId).get();
	}

	/**
	 * 增加
	 * @param plan
	 */
	public void add(FinancingPlan plan) {
		// plan.setPkFinPlaId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		planDao.save(plan);
	}

	/**
	 * 修改
	 * @param plan
	 */
	public void update(FinancingPlan plan) {
		planDao.save(plan);
	}

	/**
	 * 删除
	 * @param pkFinPlaId
	 */
	public void deleteById(Long pkFinPlaId) {
		planDao.deleteById(pkFinPlaId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<FinancingPlan> createSpecification(Map searchMap) {

		return new Specification<FinancingPlan>() {

			@Override
			public Predicate toPredicate(Root<FinancingPlan> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 申请人
                if (searchMap.get("finPlaApplicant")!=null && !"".equals(searchMap.get("finPlaApplicant"))) {
                	predicateList.add(cb.like(root.get("finPlaApplicant").as(String.class), "%"+(String)searchMap.get("finPlaApplicant")+"%"));
                }
                // 申请人邮箱
                if (searchMap.get("finPlaApplicantemail")!=null && !"".equals(searchMap.get("finPlaApplicantemail"))) {
                	predicateList.add(cb.like(root.get("finPlaApplicantemail").as(String.class), "%"+(String)searchMap.get("finPlaApplicantemail")+"%"));
                }
                // 申请人电话
                if (searchMap.get("finPlaApplicanttel")!=null && !"".equals(searchMap.get("finPlaApplicanttel"))) {
                	predicateList.add(cb.like(root.get("finPlaApplicanttel").as(String.class), "%"+(String)searchMap.get("finPlaApplicanttel")+"%"));
                }
                // 编号
                if (searchMap.get("finPlaCode")!=null && !"".equals(searchMap.get("finPlaCode"))) {
                	predicateList.add(cb.like(root.get("finPlaCode").as(String.class), "%"+(String)searchMap.get("finPlaCode")+"%"));
                }
                // 担保方式
                if (searchMap.get("finPlaGuaranteemode")!=null && !"".equals(searchMap.get("finPlaGuaranteemode"))) {
                	predicateList.add(cb.like(root.get("finPlaGuaranteemode").as(String.class), "%"+(String)searchMap.get("finPlaGuaranteemode")+"%"));
                }
                // 还款来源
                if (searchMap.get("finPlaPayment")!=null && !"".equals(searchMap.get("finPlaPayment"))) {
                	predicateList.add(cb.like(root.get("finPlaPayment").as(String.class), "%"+(String)searchMap.get("finPlaPayment")+"%"));
                }
                // 用途
                if (searchMap.get("finPlaUseness")!=null && !"".equals(searchMap.get("finPlaUseness"))) {
                	predicateList.add(cb.like(root.get("finPlaUseness").as(String.class), "%"+(String)searchMap.get("finPlaUseness")+"%"));
                }
                // 预案状态
                if (searchMap.get("finPlaStatus")!=null && !"".equals(searchMap.get("finPlaStatus"))) {
                	predicateList.add(cb.like(root.get("finPlaStatus").as(String.class), "%"+(String)searchMap.get("finPlaStatus")+"%"));
                }
                // 预案阶段
                if (searchMap.get("finPlaStage")!=null && !"".equals(searchMap.get("finPlaStage"))) {
                	predicateList.add(cb.like(root.get("finPlaStage").as(String.class), "%"+(String)searchMap.get("finPlaStage")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
