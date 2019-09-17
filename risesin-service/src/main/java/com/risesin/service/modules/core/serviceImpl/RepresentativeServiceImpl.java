package com.risesin.service.modules.core.serviceImpl;

import com.risesin.service_api.dao.core.LegalRepresentativeDao;
import com.risesin.service_api.modules.core.entity.LegalRepresentative;
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
 * representative服务层
 *
 * @author Administrator
 *
 */
@Service
public class RepresentativeServiceImpl {

	@Autowired
	private LegalRepresentativeDao legalRepresentativeDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<LegalRepresentative> findAll() {
		return legalRepresentativeDao.findAll();
	}


	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<LegalRepresentative> findSearch(Map whereMap, int page, int size) {
		Specification<LegalRepresentative> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return legalRepresentativeDao.findAll(specification, pageRequest);
	}


	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<LegalRepresentative> findSearch(Map whereMap) {
		Specification<LegalRepresentative> specification = createSpecification(whereMap);
		return legalRepresentativeDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinLegrepId
	 * @return
	 */
	public LegalRepresentative findById(Long pkFinLegrepId) {
		return legalRepresentativeDao.findById(pkFinLegrepId).get();
	}

	/**
	 * 增加
	 * @param legalRepresentative
	 */
	public void add(LegalRepresentative legalRepresentative) {
		legalRepresentativeDao.save(legalRepresentative);
	}

	/**
	 * 修改
	 * @param legalRepresentative
	 */
	public void update(LegalRepresentative legalRepresentative) {
		legalRepresentativeDao.save(legalRepresentative);
	}

	/**
	 * 删除
	 * @param pkFinLegrepId
	 */
	public void deleteById(Long pkFinLegrepId) {
		legalRepresentativeDao.deleteById(pkFinLegrepId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<LegalRepresentative> createSpecification(Map searchMap) {

		return new Specification<LegalRepresentative>() {

			@Override
			public Predicate toPredicate(Root<LegalRepresentative> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finLegrepCode")!=null && !"".equals(searchMap.get("finLegrepCode"))) {
                	predicateList.add(cb.like(root.get("finLegrepCode").as(String.class), "%"+(String)searchMap.get("finLegrepCode")+"%"));
                }
                // 征信状况
                if (searchMap.get("finLegrepCreditstatus")!=null && !"".equals(searchMap.get("finLegrepCreditstatus"))) {
                	predicateList.add(cb.like(root.get("finLegrepCreditstatus").as(String.class), "%"+(String)searchMap.get("finLegrepCreditstatus")+"%"));
                }
                // 姓名
                if (searchMap.get("finLegrepName")!=null && !"".equals(searchMap.get("finLegrepName"))) {
                	predicateList.add(cb.like(root.get("finLegrepName").as(String.class), "%"+(String)searchMap.get("finLegrepName")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
