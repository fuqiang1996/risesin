package com.risesin.service.modules.product.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.product.ProductDao;
import com.risesin.service_api.modules.product.entity.Product;
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
 * Product服务层
 * 
 * @author Darling
 *
 */
@Service
public class ProductServiceImpl extends SingletonParent implements TopInterface<Product> {

	@Autowired
	private ProductDao productDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Product> findAll() {
		return productDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Product> findSearch(Map whereMap, int page, int size) {
		Specification<Product> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return productDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Product> findSearch(Map whereMap) {
		Specification<Product> specification = createSpecification(whereMap);
		return productDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkFinProId
	 * @return
	 */
	public Product findById(Long pkFinProId) {
		return productDao.findById(pkFinProId).get();
	}

	/**
	 * 增加
	 * @param product
	 */
	public void add(Product product) {
		// product.setPkFinProId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		productDao.save(product);
	}

	/**
	 * 修改
	 * @param product
	 */
	public void update(Product product) {
		productDao.save(product);
	}

	/**
	 * 删除
	 * @param pkFinProId
	 */
	public void deleteById(Long pkFinProId) {
		productDao.deleteById(pkFinProId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Product> createSpecification(Map searchMap) {

		return new Specification<Product>() {

			@Override
			public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 申请人
                if (searchMap.get("finProApplicant")!=null && !"".equals(searchMap.get("finProApplicant"))) {
                	predicateList.add(cb.like(root.get("finProApplicant").as(String.class), "%"+(String)searchMap.get("finProApplicant")+"%"));
                }
                // 编号
                if (searchMap.get("finProCode")!=null && !"".equals(searchMap.get("finProCode"))) {
                	predicateList.add(cb.like(root.get("finProCode").as(String.class), "%"+(String)searchMap.get("finProCode")+"%"));
                }
                // 产品描述信息（申请流程）
                if (searchMap.get("finProDescription")!=null && !"".equals(searchMap.get("finProDescription"))) {
                	predicateList.add(cb.like(root.get("finProDescription").as(String.class), "%"+(String)searchMap.get("finProDescription")+"%"));
                }
                // 担保人
                if (searchMap.get("finProGuarantor")!=null && !"".equals(searchMap.get("finProGuarantor"))) {
                	predicateList.add(cb.like(root.get("finProGuarantor").as(String.class), "%"+(String)searchMap.get("finProGuarantor")+"%"));
                }
                // 产品名称
                if (searchMap.get("finProName")!=null && !"".equals(searchMap.get("finProName"))) {
                	predicateList.add(cb.like(root.get("finProName").as(String.class), "%"+(String)searchMap.get("finProName")+"%"));
                }
                // 产品审核状态
                if (searchMap.get("finProState")!=null && !"".equals(searchMap.get("finProState"))) {
                	predicateList.add(cb.like(root.get("finProState").as(String.class), "%"+(String)searchMap.get("finProState")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
