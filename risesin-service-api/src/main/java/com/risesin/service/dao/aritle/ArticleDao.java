package com.risesin.service.dao.aritle;

import com.risesin.service.modules.aritle.entity.Article;
import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Article的Dao接口
 *
 * @author honey
 */
public interface ArticleDao extends Repository<Article, Long>, JpaSpecificationExecutor<Article> {

}