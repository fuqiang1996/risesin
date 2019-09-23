package com.risesin.service.modules.base.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.base.FinancingTypeDao;
import com.risesin.service_api.modules.base.entity.FinancingType;
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
 * FinancingType服务层
 * 
 * @author Administrator
 *
 */
@Service
public class FinancingTypeServiceImpl extends SingletonParent implements BaseInterface<FinancingType> {

	@Autowired
	private FinancingTypeDao typeDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<FinancingType> findAll() {
		return typeDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<FinancingType> findSearch(Map whereMap, int page, int size) {
		Specification<FinancingType> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return typeDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<FinancingType> findSearch(Map whereMap) {
		Specification<FinancingType> specification = createSpecification(whereMap);
		return typeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinTypeId
	 * @return
	 */
	public FinancingType findById(Long pkFinTypeId) {
		return typeDao.findById(pkFinTypeId).get();
	}

	/**
	 * 增加
	 * @param financingType
	 */
	public void add(FinancingType financingType) {
		typeDao.save(financingType);
	}

	/**
	 * 修改
	 * @param financingType
	 */
	public void update(FinancingType financingType) {
		typeDao.save(financingType);
	}

	/**
	 * 删除
	 * @param pkFinTypeId
	 */
	public void deleteById(Long pkFinTypeId) {
		typeDao.deleteById(pkFinTypeId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<FinancingType> createSpecification(Map searchMap) {

		return new Specification<FinancingType>() {

			@Override
			public Predicate toPredicate(Root<FinancingType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 主键
                if (searchMap.get("pkFinTypeId")!=null && !"".equals(searchMap.get("pkFinTypeId"))) {
                	predicateList.add(cb.like(root.get("pkFinTypeId").as(String.class), "%"+(String)searchMap.get("pkFinTypeId")+"%"));
                }
                // 名称
                if (searchMap.get("finTypeName")!=null && !"".equals(searchMap.get("finTypeName"))) {
                	predicateList.add(cb.like(root.get("finTypeName").as(String.class), "%"+(String)searchMap.get("finTypeName")+"%"));
                }
                // 父id
                if (searchMap.get("finTypeParent")!=null && !"".equals(searchMap.get("finTypeParent"))) {
                	predicateList.add(cb.like(root.get("finTypeParent").as(String.class), "%"+(String)searchMap.get("finTypeParent")+"%"));
                }
                // 节点url
                if (searchMap.get("finTypeUrl")!=null && !"".equals(searchMap.get("finTypeUrl"))) {
                	predicateList.add(cb.like(root.get("finTypeUrl").as(String.class), "%"+(String)searchMap.get("finTypeUrl")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
