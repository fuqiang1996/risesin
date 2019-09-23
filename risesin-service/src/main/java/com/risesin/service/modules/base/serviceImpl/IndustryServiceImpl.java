package com.risesin.service.modules.base.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.base.IndustryDao;
import com.risesin.service_api.modules.base.entity.Industry;
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
 * Industry服务层
 * 
 * @author Administrator
 *
 */
@Service
public class IndustryServiceImpl extends SingletonParent implements BaseInterface<Industry> {

	@Autowired
	private IndustryDao industryDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Industry> findAll() {
		return industryDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Industry> findSearch(Map whereMap, int page, int size) {
		Specification<Industry> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return industryDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Industry> findSearch(Map whereMap) {
		Specification<Industry> specification = createSpecification(whereMap);
		return industryDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkIndId
	 * @return
	 */
	public Industry findById(Long pkIndId) {
		return industryDao.findById(pkIndId).get();
	}

	/**
	 * 增加
	 * @param industry
	 */
	public void add(Industry industry) {
		industryDao.save(industry);
	}

	/**
	 * 修改
	 * @param industry
	 */
	public void update(Industry industry) {
		industryDao.save(industry);
	}

	/**
	 * 删除
	 * @param pkIndId
	 */
	public void deleteById(Long pkIndId) {
		industryDao.deleteById(pkIndId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Industry> createSpecification(Map searchMap) {

		return new Specification<Industry>() {

			@Override
			public Predicate toPredicate(Root<Industry> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // ind_code
                if (searchMap.get("indCode")!=null && !"".equals(searchMap.get("indCode"))) {
                	predicateList.add(cb.like(root.get("indCode").as(String.class), "%"+(String)searchMap.get("indCode")+"%"));
                }
                // ind_name
                if (searchMap.get("indName")!=null && !"".equals(searchMap.get("indName"))) {
                	predicateList.add(cb.like(root.get("indName").as(String.class), "%"+(String)searchMap.get("indName")+"%"));
                }

				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
