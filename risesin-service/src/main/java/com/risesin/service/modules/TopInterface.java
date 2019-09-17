package com.risesin.service.modules;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/17
 * @DESCRIPTION 顶级接口, 作为每个service的父级接口
 * @since 1.0.0
 */
public interface TopInterface<T> {

    /**
     * 查找所有
     * @return
     */
    List<T> findAll();

    /**
     * 条件查询+分页
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    Page<T> findSearch(Map whereMap, int page, int size);

    /**
     * 条件查询
     * @param whereMap
     * @return
     */
    List<T> findSearch(Map whereMap) ;

    /**
     * 根据ID查询实体
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 增加
     */
    void add(T t) ;

    /**
     * 修改
     * @param t
     */
    void update(T t);

    /**
     * 删除
     * @param id
     */
    void deleteById(Long id);

    /**
     * 动态条件构建
     * @param searchMap
     * @return
     */
    default Specification<T> createSpecification(Map searchMap) {

        return new Specification<T>() {

            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicateList = new ArrayList<Predicate>();
                // 编号
                if (searchMap.get("finStoCode")!=null && !"".equals(searchMap.get("finStoCode"))) {
                    predicateList.add(cb.like(root.get("finStoCode").as(String.class), "%"+(String)searchMap.get("finStoCode")+"%"));
                }
                // 征信状况
                if (searchMap.get("finStoCreditstatus")!=null && !"".equals(searchMap.get("finStoCreditstatus"))) {
                    predicateList.add(cb.like(root.get("finStoCreditstatus").as(String.class), "%"+(String)searchMap.get("finStoCreditstatus")+"%"));
                }
                // 姓名
                if (searchMap.get("finStoName")!=null && !"".equals(searchMap.get("finStoName"))) {
                    predicateList.add(cb.like(root.get("finStoName").as(String.class), "%"+(String)searchMap.get("finStoName")+"%"));
                }

                return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };

    }


}
