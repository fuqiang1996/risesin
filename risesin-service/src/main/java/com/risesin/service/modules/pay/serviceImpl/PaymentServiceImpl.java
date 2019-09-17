package com.risesin.service.modules.pay.serviceImpl;

import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.pay.PaymentDao;
import com.risesin.service_api.modules.pay.entity.Payment;
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
 * Payment服务层
 * 
 * @author Darling
 *
 */
@Service
public class PaymentServiceImpl implements TopInterface<Payment> {

	@Autowired
	private PaymentDao paymentDao;
	

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Payment> findAll() {
		return paymentDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Payment> findSearch(Map whereMap, int page, int size) {
		Specification<Payment> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return paymentDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Payment> findSearch(Map whereMap) {
		Specification<Payment> specification = createSpecification(whereMap);
		return paymentDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkPayId
	 * @return
	 */
	public Payment findById(Long pkPayId) {
		return paymentDao.findById(pkPayId).get();
	}

	/**
	 * 增加
	 * @param payment
	 */
	public void add(Payment payment) {
		// payment.setPkPayId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		paymentDao.save(payment);
	}

	/**
	 * 修改
	 * @param payment
	 */
	public void update(Payment payment) {
		paymentDao.save(payment);
	}

	/**
	 * 删除
	 * @param pkPayId
	 */
	public void deleteById(Long pkPayId) {
		paymentDao.deleteById(pkPayId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Payment> createSpecification(Map searchMap) {

		return new Specification<Payment>() {

			@Override
			public Predicate toPredicate(Root<Payment> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("payCode")!=null && !"".equals(searchMap.get("payCode"))) {
                	predicateList.add(cb.like(root.get("payCode").as(String.class), "%"+(String)searchMap.get("payCode")+"%"));
                }
                // 支付方式
                if (searchMap.get("payMethod")!=null && !"".equals(searchMap.get("payMethod"))) {
                	predicateList.add(cb.like(root.get("payMethod").as(String.class), "%"+(String)searchMap.get("payMethod")+"%"));
                }
                // 支付状态
                if (searchMap.get("payStatus")!=null && !"".equals(searchMap.get("payStatus"))) {
                	predicateList.add(cb.like(root.get("payStatus").as(String.class), "%"+(String)searchMap.get("payStatus")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
