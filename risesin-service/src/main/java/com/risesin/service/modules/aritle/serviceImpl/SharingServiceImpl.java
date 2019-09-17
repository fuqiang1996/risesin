package com.risesin.service.modules.aritle.serviceImpl;

import com.risesin.service_api.dao.aritle.SharingDao;
import com.risesin.service_api.modules.aritle.entity.Sharing;
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
 * sharing服务层
 * 
 * @author Administrator
 *
 */
@Service
public class SharingServiceImpl {

	@Autowired
	private SharingDao sharingDao;


	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Sharing> findAll() {
		return sharingDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Sharing> findSearch(Map whereMap, int page, int size) {
		Specification<Sharing> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return sharingDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Sharing> findSearch(Map whereMap) {
		Specification<Sharing> specification = createSpecification(whereMap);
		return sharingDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param pkId
	 * @return
	 */
	public Sharing findById(Long pkId) {
		return sharingDao.findById(pkId).get();
	}

	/**
	 * 增加
	 * @param sharing
	 */
	public void add(Sharing sharing) {
		// sharing.setPkId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		sharingDao.save(sharing);
	}

	/**
	 * 修改
	 * @param sharing
	 */
	public void update(Sharing sharing) {
		sharingDao.save(sharing);
	}

	/**
	 * 删除
	 * @param pkId
	 */
	public void deleteById(Long pkId) {
		sharingDao.deleteById(pkId);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Sharing> createSpecification(Map searchMap) {

		return new Specification<Sharing>() {

			@Override
			public Predicate toPredicate(Root<Sharing> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 分享链接
                if (searchMap.get("shaLink")!=null && !"".equals(searchMap.get("shaLink"))) {
                	predicateList.add(cb.like(root.get("shaLink").as(String.class), "%"+(String)searchMap.get("shaLink")+"%"));
                }
                // 分享方式
                if (searchMap.get("shaMethod")!=null && !"".equals(searchMap.get("shaMethod"))) {
                	predicateList.add(cb.like(root.get("shaMethod").as(String.class), "%"+(String)searchMap.get("shaMethod")+"%"));
                }
                // 停止分享
                if (searchMap.get("shaStopsharing")!=null && !"".equals(searchMap.get("shaStopsharing"))) {
                	predicateList.add(cb.like(root.get("shaStopsharing").as(String.class), "%"+(String)searchMap.get("shaStopsharing")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
