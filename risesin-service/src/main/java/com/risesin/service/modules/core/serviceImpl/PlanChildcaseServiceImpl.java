package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.core.PlanChildcaseDao;
import com.risesin.service_api.modules.core.entity.PlanChildcase;
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
 * PlanChildcase服务层
 * 
 * @author Administrator
 *
 */
@Service
public class PlanChildcaseServiceImpl extends SingletonParent implements TopInterface<PlanChildcase> {

	@Autowired
	private PlanChildcaseDao childcaseDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<PlanChildcase> findAll() {
		return childcaseDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<PlanChildcase> findSearch(Map whereMap, int page, int size) {
		Specification<PlanChildcase> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return childcaseDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<PlanChildcase> findSearch(Map whereMap) {
		Specification<PlanChildcase> specification = createSpecification(whereMap);
		return childcaseDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinCasId
	 * @return
	 */
	public PlanChildcase findById(Long pkFinCasId) {
		return childcaseDao.findById(pkFinCasId).get();
	}

	/**
	 * 增加
	 * @param childcase
	 */
	public void add(PlanChildcase childcase) {
		// childcase.setPkFinCasId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		childcaseDao.save(childcase);
	}

	/**
	 * 修改
	 * @param childcase
	 */
	public void update(PlanChildcase childcase) {
		childcaseDao.save(childcase);
	}

	/**
	 * 删除
	 * @param pkFinCasId
	 */
	public void deleteById(Long pkFinCasId) {
		childcaseDao.deleteById(pkFinCasId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<PlanChildcase> createSpecification(Map searchMap) {

		return new Specification<PlanChildcase>() {

			@Override
			public Predicate toPredicate(Root<PlanChildcase> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
