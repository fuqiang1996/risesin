package com.risesin.service.comment;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.comment.serviceImpl.UserConsultationCommentImpl;
import com.risesin.service_api.modules.comment.entity.UserConsultationComment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserConsultationCommentImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private UserConsultationCommentImpl userConsultationComment;

    private UserConsultationComment consultationComment;

    @Before
    public void setUp() {
        consultationComment = new UserConsultationComment();
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void findById() {
        UserConsultationComment byId = userConsultationComment.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        consultationComment.setAddTion("123");
        consultationComment.setScore("100");
        userConsultationComment.add(consultationComment);
        UserConsultationComment byId = userConsultationComment.findById(1L);
        Assert.assertTrue("error", byId.getId() == 1);
    }

    @Test
    public void update() {
        consultationComment.setAddTion("12311");
        consultationComment.setScore("10011");
        consultationComment.setId(1L);
        userConsultationComment.add(consultationComment);
//        userConsultationComment.add(consultationComment);
//        UserConsultationComment byId = userConsultationComment.findById(1L);
    }

    @Test
    public void deleteById() {
    }
}