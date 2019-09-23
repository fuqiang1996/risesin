package com.risesin.service.modules.base.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.base.EnterpriseInfoTypeDao;
import com.risesin.service_api.modules.base.entity.EnterpriseInfoType;
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
 * EnterpriseInfoType服务层
 * 
 * @author Darling
 *
 */
@Service
public class EnterpriseInfoTypeServiceImpl extends SingletonParent implements TopInterface<EnterpriseInfoType> {

	@Autowired
	private EnterpriseInfoTypeDao enterpriseInfoTypeDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<EnterpriseInfoType> findAll() {
		return enterpriseInfoTypeDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<EnterpriseInfoType> findSearch(Map whereMap, int page, int size) {
		Specification<EnterpriseInfoType> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return enterpriseInfoTypeDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<EnterpriseInfoType> findSearch(Map whereMap) {
		Specification<EnterpriseInfoType> specification = createSpecification(whereMap);
		return enterpriseInfoTypeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinEntinfotypeId
	 * @return
	 */
	public EnterpriseInfoType findById(Long pkFinEntinfotypeId) {
		return enterpriseInfoTypeDao.findById(pkFinEntinfotypeId).get();
	}

	/**
	 * 增加
	 * @param infoType
	 */
	public void add(EnterpriseInfoType infoType) {
		// infoType.setPkFinEntinfotypeId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		enterpriseInfoTypeDao.save(infoType);
	}

	/**
	 * 修改
	 * @param infoType
	 */
	public void update(EnterpriseInfoType infoType) {
		enterpriseInfoTypeDao.save(infoType);
	}

	/**
	 * 删除
	 * @param pkFinEntinfotypeId
	 */
	public void deleteById(Long pkFinEntinfotypeId) {
		enterpriseInfoTypeDao.deleteById(pkFinEntinfotypeId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<EnterpriseInfoType> createSpecification(Map searchMap) {

		return new Specification<EnterpriseInfoType>() {

			@Override
			public Predicate toPredicate(Root<EnterpriseInfoType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finEntinfotypeCode")!=null && !"".equals(searchMap.get("finEntinfotypeCode"))) {
                	predicateList.add(cb.like(root.get("finEntinfotypeCode").as(String.class), "%"+(String)searchMap.get("finEntinfotypeCode")+"%"));
                }
                // 类型名称
                if (searchMap.get("finEntinfotypeName")!=null && !"".equals(searchMap.get("finEntinfotypeName"))) {
                	predicateList.add(cb.like(root.get("finEntinfotypeName").as(String.class), "%"+(String)searchMap.get("finEntinfotypeName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
