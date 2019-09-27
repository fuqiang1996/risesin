package com.risesin.service.commonuser;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.comment.serviceImpl.LoanagencyCommentServiceImpl;
import com.risesin.service_api.modules.comment.entity.LoanAgencyComment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class LoanagencyCommentServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private LoanagencyCommentServiceImpl loanagencyCommentService;

    private LoanAgencyComment loanAgencyComment;

    @Before
    public void setUp() {
        loanAgencyComment = new LoanAgencyComment();
    }

    @Test
    public void findAll() {
        List<LoanAgencyComment> all = loanagencyCommentService.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void findById() {
        LoanAgencyComment byId = loanagencyCommentService.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        loanAgencyComment.setCommentScore(10);
        loanagencyCommentService.add(loanAgencyComment);
    }

    @Test
    public void update() {
        loanAgencyComment.setCommentScore(10);
        loanAgencyComment.setId(1L);
        loanagencyCommentService.add(loanAgencyComment);
    }

    @Test
    public void deleteById() {
        loanagencyCommentService.deleteById(1L);
    }
}