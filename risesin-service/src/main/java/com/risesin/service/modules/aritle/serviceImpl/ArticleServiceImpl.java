package com.risesin.service.modules.aritle.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.modules.TopInterface;
import com.risesin.service_api.dao.aritle.ArticleDao;
import com.risesin.service_api.modules.aritle.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


/**
 * article服务层
 *
 * @author Administrator
 */
@Service
public class ArticleServiceImpl extends SingletonParent implements TopInterface<Article> {

    @Autowired
    private ArticleDao articleDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<Article> findAll() {
        return articleDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<Article> findSearch(Map whereMap, int page, int size) {
        Specification<Article> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return articleDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<Article> findSearch(Map whereMap) {
        Specification<Article> specification = createSpecification(whereMap);
        return articleDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param pkId
     * @return
     */
    public Article findById(Long pkId) {
        return articleDao.findById(pkId).get();
    }


    /**
     * 增加
     *
     * @param article
     */
    public void add(Article article) {
        // article.setPkId( idWorker.nextId()+"" ); 雪花分布式ID生成器
        articleDao.save(article);
    }

    /**
     * 修改
     *
     * @param article
     */
    public void update(Article article) {
        articleDao.save(article);
    }

    /**
     * 删除
     *
     * @param pkId
     */
    public void deleteById(Long pkId) {
        articleDao.deleteById(pkId);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<Article> createSpecification(Map searchMap) {

        return new Specification<Article>() {

            @Override
            public Predicate toPredicate(Root<Article> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicateList = new ArrayList<Predicate>();
                // 文章标题
                if (searchMap.get("artTitle") != null && !"".equals(searchMap.get("artTitle"))) {
                    predicateList.add(cb.like(root.get("artTitle").as(String.class), "%" + (String) searchMap.get("artTitle") + "%"));
                }
                // 副标题
                if (searchMap.get("artSubhead") != null && !"".equals(searchMap.get("artSubhead"))) {
                    predicateList.add(cb.like(root.get("artSubhead").as(String.class), "%" + (String) searchMap.get("artSubhead") + "%"));
                }
                // 自定义备注
                if (searchMap.get("artRemark") != null && !"".equals(searchMap.get("artRemark"))) {
                    predicateList.add(cb.like(root.get("artRemark").as(String.class), "%" + (String) searchMap.get("artRemark") + "%"));
                }
                // 关键字
                if (searchMap.get("artKeywords") != null && !"".equals(searchMap.get("artKeywords"))) {
                    predicateList.add(cb.like(root.get("artKeywords").as(String.class), "%" + (String) searchMap.get("artKeywords") + "%"));
                }
                // 简介
                if (searchMap.get("artIntro") != null && !"".equals(searchMap.get("artIntro"))) {
                    predicateList.add(cb.like(root.get("artIntro").as(String.class), "%" + (String) searchMap.get("artIntro") + "%"));
                }
                // 图片正文URL
                if (searchMap.get("artImg") != null && !"".equals(searchMap.get("artImg"))) {
                    predicateList.add(cb.like(root.get("artImg").as(String.class), "%" + (String) searchMap.get("artImg") + "%"));
                }
                // 文章来源
                if (searchMap.get("artCopyfrom") != null && !"".equals(searchMap.get("artCopyfrom"))) {
                    predicateList.add(cb.like(root.get("artCopyfrom").as(String.class), "%" + (String) searchMap.get("artCopyfrom") + "%"));
                }
                // 正文
                if (searchMap.get("artContent") != null && !"".equals(searchMap.get("artContent"))) {
                    predicateList.add(cb.like(root.get("artContent").as(String.class), "%" + (String) searchMap.get("artContent") + "%"));
                }
                // 作者
                if (searchMap.get("artAuthor") != null && !"".equals(searchMap.get("artAuthor"))) {
                    predicateList.add(cb.like(root.get("artAuthor").as(String.class), "%" + (String) searchMap.get("artAuthor") + "%"));
                }

                return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));

            }
        };

    }

}
