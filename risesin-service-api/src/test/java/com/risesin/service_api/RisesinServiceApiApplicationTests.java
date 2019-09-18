package com.risesin.service_api;

import com.risesin.service_api.dao.actionPlan.ActPlanFinProDao;
import com.risesin.service_api.dao.comment.LoanAgencyCommentDao;
import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import com.risesin.service_api.modules.comment.entity.LoanAgencyComment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RisesinServiceApiApplicationTests {

    @Autowired
    private ActPlanFinProDao actPlanFinProDao;

    @Autowired
    private LoanAgencyCommentDao loanAgencyCommentDao;

    @Test
    public void testDao_save(){

        ActPlanFinPro actPlanFinPro = new ActPlanFinPro();
        actPlanFinPro.setFinProId(123213213L);
        actPlanFinPro.setProId(12312321L);

        ActPlanFinPro save = actPlanFinProDao.save(actPlanFinPro);

        System.out.println(save);
    }

    @Test
    public void testDao_query(){

        ActPlanFinPro actPlanFinPro = actPlanFinProDao.queryActPlanFinProByFinProId(12312321L);
        System.out.println(actPlanFinPro);
    }

    @Test
    public void testDao_update(){
        actPlanFinProDao.updateActPlanFinProByFinProId(12312321L,1L);
    }

    @Test
    public void testDao_delete(){
        actPlanFinProDao.deleteById(1L);
    }

    @Test
    public void test01(){
        LoanAgencyComment loanAgencyComment = new LoanAgencyComment();
        loanAgencyComment.setCommentScore(5);
        loanAgencyCommentDao.save(loanAgencyComment);
    }

}
