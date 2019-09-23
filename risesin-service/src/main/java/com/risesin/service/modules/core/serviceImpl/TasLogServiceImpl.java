package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.core.TasLogDao;
import com.risesin.service_api.modules.core.entity.TasLog;
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
 * TasLog服务层
 * 
 * @author Darling
 *
 */
@Service
public class TasLogServiceImpl extends SingletonParent implements TopInterface<TasLog> {

	@Autowired
	private TasLogDao tasLogDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<TasLog> findAll() {
		return tasLogDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<TasLog> findSearch(Map whereMap, int page, int size) {
		Specification<TasLog> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return tasLogDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<TasLog> findSearch(Map whereMap) {
		Specification<TasLog> specification = createSpecification(whereMap);
		return tasLogDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkTasLogId
	 * @return
	 */
	public TasLog findById(Long pkTasLogId) {
		return tasLogDao.findById(pkTasLogId).get();
	}

	/**
	 * 增加
	 * @param tasLog
	 */
	public void add(TasLog tasLog) {
		tasLogDao.save(tasLog);
	}

	/**
	 * 修改
	 * @param tasLog
	 */
	public void update(TasLog tasLog) {
		tasLogDao.save(tasLog);
	}

	/**
	 * 删除
	 * @param pkTasLogId
	 */
	public void deleteById(Long pkTasLogId) {
		tasLogDao.deleteById(pkTasLogId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<TasLog> createSpecification(Map searchMap) {

		return new Specification<TasLog>() {

			@Override
			public Predicate toPredicate(Root<TasLog> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("tasLogCode")!=null && !"".equals(searchMap.get("tasLogCode"))) {
                	predicateList.add(cb.like(root.get("tasLogCode").as(String.class), "%"+(String)searchMap.get("tasLogCode")+"%"));
                }
                // 操作记录
                if (searchMap.get("tasLogOperation")!=null && !"".equals(searchMap.get("tasLogOperation"))) {
                	predicateList.add(cb.like(root.get("tasLogOperation").as(String.class), "%"+(String)searchMap.get("tasLogOperation")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
