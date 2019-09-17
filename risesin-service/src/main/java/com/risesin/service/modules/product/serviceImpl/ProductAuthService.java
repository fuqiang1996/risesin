package com.risesin.service.modules.product.serviceImpl;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.product.ProductAuthDao;
import com.risesin.service_api.modules.product.entity.ProductAuth;
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
 * ProductAuth服务层
 * 
 * @author Darling
 *
 */
@Service
public class ProductAuthService implements TopInterface<ProductAuth> {

	@Autowired
	private ProductAuthDao authDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<ProductAuth> findAll() {
		return authDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<ProductAuth> findSearch(Map whereMap, int page, int size) {
		Specification<ProductAuth> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return authDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<ProductAuth> findSearch(Map whereMap) {
		Specification<ProductAuth> specification = createSpecification(whereMap);
		return authDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinProAutId
	 * @return
	 */
	public ProductAuth findById(Long pkFinProAutId) {
		return authDao.findById(pkFinProAutId).get();
	}

	/**
	 * 增加
	 * @param auth
	 */
	public void add(ProductAuth auth) {
		// auth.setPkFinProAutId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		authDao.save(auth);
	}

	/**
	 * 修改
	 * @param auth
	 */
	public void update(ProductAuth auth) {
		authDao.save(auth);
	}

	/**
	 * 删除
	 * @param pkFinProAutId
	 */
	public void deleteById(Long pkFinProAutId) {
		authDao.deleteById(pkFinProAutId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<ProductAuth> createSpecification(Map searchMap) {

		return new Specification<ProductAuth>() {

			@Override
			public Predicate toPredicate(Root<ProductAuth> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finProAutCode")!=null && !"".equals(searchMap.get("finProAutCode"))) {
                	predicateList.add(cb.like(root.get("finProAutCode").as(String.class), "%"+(String)searchMap.get("finProAutCode")+"%"));
                }
                // 产品代理审核状态
                if (searchMap.get("finProAuthState")!=null && !"".equals(searchMap.get("finProAuthState"))) {
                	predicateList.add(cb.like(root.get("finProAuthState").as(String.class), "%"+(String)searchMap.get("finProAuthState")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
