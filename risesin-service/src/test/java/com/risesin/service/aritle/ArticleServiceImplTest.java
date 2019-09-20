package com.risesin.service.aritle;

import com.risesin.service.actionplan.ActPlanFinProServiceImplTest;
import com.risesin.service.modules.aritle.serviceImpl.ArticleServiceImpl;
import com.risesin.service_api.modules.aritle.entity.Article;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ArticleServiceImplTest {

    @Autowired
    private ArticleServiceImpl articleService;

    private Article article;


    @Before
    public void setUp() throws Exception {
        article = new Article();
    }

    @Test
    public void testFindAll() {
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void testFindById() {
        Article byId = articleService.findById(16L);
        System.out.println(byId);
    }

    @Test
    public void testAdd() {
        article.setTitle("title1111111111111111111");
        article.setSubhead("title");
        article.setKeywords("title");
        article.setIsElite(1L);
        article.setIntro("title");
        article.setRemark("123111111");
        articleService.add(article);
    }

    @Test
    public void testUpdate() {
        article.setTitle("title");
        article.setSubhead("title");
        article.setKeywords("title");
        article.setIsElite(1L);
        article.setIntro("title");
        article.setRemark("123");
        article.setId(17L);
        articleService.add(article);
    }

    @Test
    public void testDeleteById() {
        articleService.deleteById(17L);

    }
}
