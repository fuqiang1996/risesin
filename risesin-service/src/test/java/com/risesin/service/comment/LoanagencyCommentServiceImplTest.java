package com.risesin.service.comment;


import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.comment.serviceImpl.LoanagencyCommentServiceImpl;
import com.risesin.service_api.modules.comment.entity.LoanAgencyComment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LoanagencyCommentServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private LoanagencyCommentServiceImpl loanagencyCommentService;

    @Test
    public void findAll() {

        List<LoanAgencyComment> all = loanagencyCommentService.findAll();
        Assert.assertTrue("查询信息为空", all.size() >= 0);
    }

    @Test
    public void findById() {
        LoanAgencyComment serviceById = loanagencyCommentService.findById(3L);
        Assert.assertTrue("根据id查询实体为空", serviceById.getId() == 3l);
    }

    @Test
    public void add() {
        LoanAgencyComment loanAgencyComment = new LoanAgencyComment();
        loanAgencyComment.setCommentDescription("123");
        loanAgencyComment.setCommentScore(1);

        loanagencyCommentService.add(loanAgencyComment);
        Assert.assertTrue("查询信息为空", loanagencyCommentService.findAll().size() >= 1);
    }


    @Test
    public void update() {
        LoanAgencyComment loanAgencyComment = new LoanAgencyComment();
        loanAgencyComment.setCommentDescription("123");
        loanAgencyComment.setCommentScore(1);
        loanAgencyComment.setId(1l);
        loanagencyCommentService.update(loanAgencyComment);
    }


    @Test
    public void deleteById() {
        loanagencyCommentService.deleteById(1L);
        List<LoanAgencyComment> channelDefinitionList = loanagencyCommentService.findAll();
        channelDefinitionList.forEach((LoanAgencyComment bean) -> {
            Assert.assertTrue("根据ID删除失败", bean.getId() == 1L);
        });
    }
}