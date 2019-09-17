package com.risesin.service.modules.core.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import com.risesin.service_api.dao.core.StockholderDao;
import com.risesin.service_api.modules.core.entity.Stockholder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;



/**
 * stockholder服务层
 * 
 * @author Administrator
 *
 */
@Service
public class StockholderServiceImpl {

	@Autowired
	private StockholderDao stockholderDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Stockholder> findAll() {
		return stockholderDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Stockholder> findSearch(Map whereMap, int page, int size) {
		Specification<Stockholder> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return stockholderDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Stockholder> findSearch(Map whereMap) {
		Specification<Stockholder> specification = createSpecification(whereMap);
		return stockholderDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinStoId
	 * @return
	 */
	public Stockholder findById(Long pkFinStoId) {
		return stockholderDao.findById(pkFinStoId).get();
	}

	/**
	 * 增加
	 * @param stockholder
	 */
	public void add(Stockholder stockholder) {
		// stockholder.setPkFinStoId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		stockholderDao.save(stockholder);
	}

	/**
	 * 修改
	 * @param stockholder
	 */
	public void update(Stockholder stockholder) {
		stockholderDao.save(stockholder);
	}

	/**
	 * 删除
	 * @param pkFinStoId
	 */
	public void deleteById(Long pkFinStoId) {
		stockholderDao.deleteById(pkFinStoId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Stockholder> createSpecification(Map searchMap) {

		return new Specification<Stockholder>() {

			@Override
			public Predicate toPredicate(Root<Stockholder> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finStoCode")!=null && !"".equals(searchMap.get("finStoCode"))) {
                	predicateList.add(cb.like(root.get("finStoCode").as(String.class), "%"+(String)searchMap.get("finStoCode")+"%"));
                }
                // 征信状况
                if (searchMap.get("finStoCreditstatus")!=null && !"".equals(searchMap.get("finStoCreditstatus"))) {
                	predicateList.add(cb.like(root.get("finStoCreditstatus").as(String.class), "%"+(String)searchMap.get("finStoCreditstatus")+"%"));
                }
                // 姓名
                if (searchMap.get("finStoName")!=null && !"".equals(searchMap.get("finStoName"))) {
                	predicateList.add(cb.like(root.get("finStoName").as(String.class), "%"+(String)searchMap.get("finStoName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
