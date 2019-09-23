package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.core.TodotaskDao;
import com.risesin.service_api.modules.core.entity.Todotask;
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
 * Todotask服务层
 * 
 * @author Darling
 *
 */
@Service
public class TodotaskServiceImpl extends SingletonParent implements BaseInterface<Todotask> {

	@Autowired
	private TodotaskDao todotaskDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Todotask> findAll() {
		return todotaskDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Todotask> findSearch(Map whereMap, int page, int size) {
		Specification<Todotask> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return todotaskDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Todotask> findSearch(Map whereMap) {
		Specification<Todotask> specification = createSpecification(whereMap);
		return todotaskDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinTasId
	 * @return
	 */
	public Todotask findById(Long pkFinTasId) {
		return todotaskDao.findById(pkFinTasId).get();
	}

	/**
	 * 增加
	 * @param todotask
	 */
	public void add(Todotask todotask) {
		// todotask.setPkFinTasId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		todotaskDao.save(todotask);
	}

	/**
	 * 修改
	 * @param todotask
	 */
	public void update(Todotask todotask) {
		todotaskDao.save(todotask);
	}

	/**
	 * 删除
	 * @param pkFinTasId
	 */
	public void deleteById(Long pkFinTasId) {
		todotaskDao.deleteById(pkFinTasId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Todotask> createSpecification(Map searchMap) {

		return new Specification<Todotask>() {

			@Override
			public Predicate toPredicate(Root<Todotask> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finTasCode")!=null && !"".equals(searchMap.get("finTasCode"))) {
                	predicateList.add(cb.like(root.get("finTasCode").as(String.class), "%"+(String)searchMap.get("finTasCode")+"%"));
                }
                // 待办事项描述信息
                if (searchMap.get("finTasDescription")!=null && !"".equals(searchMap.get("finTasDescription"))) {
                	predicateList.add(cb.like(root.get("finTasDescription").as(String.class), "%"+(String)searchMap.get("finTasDescription")+"%"));
                }
                // 待办事项名称
                if (searchMap.get("finTasName")!=null && !"".equals(searchMap.get("finTasName"))) {
                	predicateList.add(cb.like(root.get("finTasName").as(String.class), "%"+(String)searchMap.get("finTasName")+"%"));
                }
                // 任务的状态：待办；关闭
                if (searchMap.get("finTasState")!=null && !"".equals(searchMap.get("finTasState"))) {
                	predicateList.add(cb.like(root.get("finTasState").as(String.class), "%"+(String)searchMap.get("finTasState")+"%"));
                }
                // 指派用户code（企业或助贷机构）
                if (searchMap.get("fkAssCode")!=null && !"".equals(searchMap.get("fkAssCode"))) {
                	predicateList.add(cb.like(root.get("fkAssCode").as(String.class), "%"+(String)searchMap.get("fkAssCode")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
