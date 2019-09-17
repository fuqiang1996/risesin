package com.risesin.service_api.dao.aritle;

import com.risesin.service_api.modules.aritle.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Article的Dao接口
 *
 * @author honey
 */
public interface ArticleDao extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {

}