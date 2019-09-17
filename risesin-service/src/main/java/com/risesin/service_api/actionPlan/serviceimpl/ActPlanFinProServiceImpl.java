package com.risesin.service_api.actionPlan.serviceimpl;

import java.util.List;

import com.risesin.service_api.actionPlan.service.ActPlanFinProService;
import com.risesin.service_api.dao.actionPlan.ActPlanFinProDao;
import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ActPlanFinPro的服务接口的实现类
 *
 * @author
 */
@Service
public class ActPlanFinProServiceImpl implements ActPlanFinProService {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private ActPlanFinProDao actPlanFinProDao;


    @Override
    public String find(ActPlanFinPro value) {
        return null;
    }

    @Override
    public String findOne(Integer id) {
        return null;
    }

    @Override
    public String saveNotNull(ActPlanFinPro value) {
        return null;
    }

    @Override
    public String updateNotNullById(ActPlanFinPro enti) {
        return null;
    }

    @Override
    public String deleteById(Integer id) {
        return null;
    }
}