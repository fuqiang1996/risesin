package com.risesin.service.modules.base.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.base.CommentTypeDao;
import com.risesin.service_api.modules.base.entity.CommentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;



/**
 * CommentType服务层
 * 
 * @author Darling
 *
 */
@Service
public class CommentTypeServiceImpl implements TopInterface<CommentType> {

	@Autowired
	private CommentTypeDao typeDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<CommentType> findAll() {
		return typeDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<CommentType> findSearch(Map whereMap, int page, int size) {
		Specification<CommentType> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return typeDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<CommentType> findSearch(Map whereMap) {
		Specification<CommentType> specification = createSpecification(whereMap);
		return typeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkComtTypId
	 * @return
	 */
	public CommentType findById(Long pkComtTypId) {
		return typeDao.findById(pkComtTypId).get();
	}

	/**
	 * 增加
	 * @param type
	 */
	public void add(CommentType type) {
		// type.setPkComtTypId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		typeDao.save(type);
	}

	/**
	 * 修改
	 * @param type
	 */
	public void update(CommentType type) {
		typeDao.save(type);
	}

	/**
	 * 删除
	 * @param pkComtTypId
	 */
	public void deleteById(Long pkComtTypId) {
		typeDao.deleteById(pkComtTypId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<CommentType> createSpecification(Map searchMap) {

		return new Specification<CommentType>() {

			@Override
			public Predicate toPredicate(Root<CommentType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 评价类型
                if (searchMap.get("comtTypeName")!=null && !"".equals(searchMap.get("comtTypeName"))) {
                	predicateList.add(cb.like(root.get("comtTypeName").as(String.class), "%"+(String)searchMap.get("comtTypeName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
