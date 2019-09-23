package com.risesin.service.baseService;

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
 * @DESCRIPTION 顶级接口, 作为每个service的实现父级接口
 * @since 1.0.0
 */
public interface BaseInterface<T> {

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



}
