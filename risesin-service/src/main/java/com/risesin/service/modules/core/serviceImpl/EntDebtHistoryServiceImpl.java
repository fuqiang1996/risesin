package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.core.EntDebtHistoryDao;
import com.risesin.service_api.modules.core.entity.EntDebtHistory;
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
 * EntDebtHistory服务层
 * 
 * @author Darling
 *
 */
@Service
public class EntDebtHistoryServiceImpl extends SingletonParent implements TopInterface<EntDebtHistory> {

	@Autowired
	private EntDebtHistoryDao debtHistoryDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<EntDebtHistory> findAll() {
		return debtHistoryDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<EntDebtHistory> findSearch(Map whereMap, int page, int size) {
		Specification<EntDebtHistory> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return debtHistoryDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<EntDebtHistory> findSearch(Map whereMap) {
		Specification<EntDebtHistory> specification = createSpecification(whereMap);
		return debtHistoryDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinDebhisId
	 * @return
	 */
	public EntDebtHistory findById(Long pkFinDebhisId) {
		return debtHistoryDao.findById(pkFinDebhisId).get();
	}

	/**
	 * 增加
	 * @param debtHistory
	 */
	public void add(EntDebtHistory debtHistory) {
		// debtHistory.setPkFinDebhisId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		debtHistoryDao.save(debtHistory);
	}

	/**
	 * 修改
	 * @param debtHistory
	 */
	public void update(EntDebtHistory debtHistory) {
		debtHistoryDao.save(debtHistory);
	}

	/**
	 * 删除
	 * @param pkFinDebhisId
	 */
	public void deleteById(Long pkFinDebhisId) {
		debtHistoryDao.deleteById(pkFinDebhisId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<EntDebtHistory> createSpecification(Map searchMap) {

		return new Specification<EntDebtHistory>() {

			@Override
			public Predicate toPredicate(Root<EntDebtHistory> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finDebhisCode")!=null && !"".equals(searchMap.get("finDebhisCode"))) {
                	predicateList.add(cb.like(root.get("finDebhisCode").as(String.class), "%"+(String)searchMap.get("finDebhisCode")+"%"));
                }
                // 负债类型
                if (searchMap.get("finDebhisLiabilitytype")!=null && !"".equals(searchMap.get("finDebhisLiabilitytype"))) {
                	predicateList.add(cb.like(root.get("finDebhisLiabilitytype").as(String.class), "%"+(String)searchMap.get("finDebhisLiabilitytype")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
