package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.core.DispatchDao;
import com.risesin.service_api.modules.core.entity.Dispatch;
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
 * Dispatch服务层
 * 
 * @author Darling
 *
 */
@Service
public class DispatchServiceImpl implements TopInterface<Dispatch> {

	@Autowired
	private DispatchDao dispatchDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Dispatch> findAll() {
		return dispatchDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Dispatch> findSearch(Map whereMap, int page, int size) {
		Specification<Dispatch> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return dispatchDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Dispatch> findSearch(Map whereMap) {
		Specification<Dispatch> specification = createSpecification(whereMap);
		return dispatchDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinDispaId
	 * @return
	 */
	public Dispatch findById(Long pkFinDispaId) {
		return dispatchDao.findById(pkFinDispaId).get();
	}

	/**
	 * 增加
	 * @param dispatch
	 */
	public void add(Dispatch dispatch) {
		// dispatch.setPkFinDispaId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		dispatchDao.save(dispatch);
	}

	/**
	 * 修改
	 * @param dispatch
	 */
	public void update(Dispatch dispatch) {
		dispatchDao.save(dispatch);
	}

	/**
	 * 删除
	 * @param pkFinDispaId
	 */
	public void deleteById(Long pkFinDispaId) {
		dispatchDao.deleteById(pkFinDispaId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Dispatch> createSpecification(Map searchMap) {

		return new Specification<Dispatch>() {

			@Override
			public Predicate toPredicate(Root<Dispatch> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finDispaCode")!=null && !"".equals(searchMap.get("finDispaCode"))) {
                	predicateList.add(cb.like(root.get("finDispaCode").as(String.class), "%"+(String)searchMap.get("finDispaCode")+"%"));
                }
                // 描述信息
                if (searchMap.get("finDispaDesc")!=null && !"".equals(searchMap.get("finDispaDesc"))) {
                	predicateList.add(cb.like(root.get("finDispaDesc").as(String.class), "%"+(String)searchMap.get("finDispaDesc")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
