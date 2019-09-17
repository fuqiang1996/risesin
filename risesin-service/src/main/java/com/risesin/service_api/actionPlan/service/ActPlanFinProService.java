package com.risesin.service_api.actionPlan.service;

import com.risesin.service_api.modules.actionPlan.entity.ActPlanFinPro;

import java.util.List;


/**
 * ActPlanFinPro的服务接口
 *
 * @author
 */
public interface ActPlanFinProService {
    /**
     * 获得ActPlanFinPro数据集,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     *
     * @return
     */
    String find(ActPlanFinPro value);

    /**
     * 通过ActPlanFinPro的id获得ActPlanFinPro对象
     *
     * @param id
     * @return
     */
    String findOne(Integer id);

    /**
     * 将ActPlanFinPro中属性值不为null的数据到数据库
     *
     * @param value
     * @return
     */
    String saveNotNull(ActPlanFinPro value);

    /**
     * 通过ActPlanFinPro的id更新ActPlanFinPro中属性不为null的数据
     *
     * @param enti
     * @return
     */
    String updateNotNullById(ActPlanFinPro enti);

    /**
     * 通过ActPlanFinPro的id删除ActPlanFinPro
     *
     * @param id
     * @return
     */
    String deleteById(Integer id);
}
