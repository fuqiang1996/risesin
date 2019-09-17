package com.risesin.service.modules.base.serviceImpl;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.base.DynamicDao;
import com.risesin.service_api.modules.base.entity.Dynamic;
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
 * Dynamic服务层
 * 
 * @author Darling
 *
 */
@Service
public class DynamicServiceImpl implements TopInterface<Dynamic> {

	@Autowired
	private DynamicDao dynamicDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Dynamic> findAll() {
		return dynamicDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Dynamic> findSearch(Map whereMap, int page, int size) {
		Specification<Dynamic> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return dynamicDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Dynamic> findSearch(Map whereMap) {
		Specification<Dynamic> specification = createSpecification(whereMap);
		return dynamicDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkDynId
	 * @return
	 */
	public Dynamic findById(Long pkDynId) {
		return dynamicDao.findById(pkDynId).get();
	}

	/**
	 * 增加
	 * @param dynamic
	 */
	public void add(Dynamic dynamic) {
		// dynamic.setPkDynId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		dynamicDao.save(dynamic);
	}

	/**
	 * 修改
	 * @param dynamic
	 */
	public void update(Dynamic dynamic) {
		dynamicDao.save(dynamic);
	}

	/**
	 * 删除
	 * @param pkDynId
	 */
	public void deleteById(Long pkDynId) {
		dynamicDao.deleteById(pkDynId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Dynamic> createSpecification(Map searchMap) {

		return new Specification<Dynamic>() {

			@Override
			public Predicate toPredicate(Root<Dynamic> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 业务内容
                if (searchMap.get("dynContent")!=null && !"".equals(searchMap.get("dynContent"))) {
                	predicateList.add(cb.like(root.get("dynContent").as(String.class), "%"+(String)searchMap.get("dynContent")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
