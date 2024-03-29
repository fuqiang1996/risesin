package com.risesin.service.modules.aritle.serviceImpl;

import com.risesin.service.baseService.SingletonParent;
import com.risesin.service.baseService.BaseInterface;
import com.risesin.service_api.dao.aritle.BusinessTrackDao;
import com.risesin.service_api.modules.aritle.entity.BusinessTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BusinessTrackingImpl extends SingletonParent implements BaseInterface<BusinessTrack> {


    @Autowired
    private BusinessTrackDao businessTrackDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<BusinessTrack> findAll() {
        return businessTrackDao.findAll();
    }

    @Override
    public Page findSearch(Map whereMap, int page, int size) {
        return null;
    }

    @Override
    public List findSearch(Map whereMap) {
        return null;
    }


    /**
     * 条件查询+分页
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
//    public Page<BusinessTrack> findSearch(Map whereMap, int page, int size) {
//        Specification<BusinessTrack> specification = createSpecification(whereMap);
//        PageRequest pageRequest =  PageRequest.of(page-1, size);
//        return businessTrackDao.findAll(specification, pageRequest);
//    }


//    /**
//     * 条件查询
//     * @param whereMap
//     * @return
//     */
//    public List<BusinessTrack> findSearch(Map whereMap) {
//        Specification<BusinessTrack> specification = createSpecification(whereMap);
//        return businessTrackDao.findAll(specification);
//    }

    /**
     * 根据ID查询实体
     *
     * @param pkId
     * @return
     */
    public BusinessTrack findById(Long pkId) {
        return businessTrackDao.findById(pkId).get();
    }


    /**
     * 增加
     *
     * @param BusinessTrack
     */
    public void add(BusinessTrack BusinessTrack) {
        // BusinessTrack.setPkId( idWorker.nextId()+"" ); 雪花分布式ID生成器
        businessTrackDao.save(BusinessTrack);
    }

    /**
     * 修改
     *
     * @param BusinessTrack
     */
    public void update(BusinessTrack BusinessTrack) {
        businessTrackDao.save(BusinessTrack);
    }

    /**
     * 删除
     *
     * @param pkId
     */
    public void deleteById(Long pkId) {
        businessTrackDao.deleteById(pkId);
    }
}
