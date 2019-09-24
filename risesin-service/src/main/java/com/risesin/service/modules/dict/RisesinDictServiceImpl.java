package com.risesin.service.modules.dict;

import java.util.List;
import java.util.Map;

import com.risesin.service.baseService.BaseInterface;
import com.risesin.service.baseService.SingletonParent;
import com.risesin.service_api.dao.dict.RisesinDictDao;
import com.risesin.service_api.modules.dict.RisesinDict;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * RisesinDict的服务接口的实现类
 *
 * @author
 */
@Service
public class RisesinDictServiceImpl extends SingletonParent implements BaseInterface<RisesinDict> {
    private final Logger LOG = LogManager.getLogger(this.getClass());

    @Autowired
    private RisesinDictDao risesinDictDao;

    @Override
    public List<RisesinDict> findAll() {
        return risesinDictDao.findAll();
    }

    @Override
    public Page<RisesinDict> findSearch(Map whereMap, int page, int size) {
        return null;
    }

    @Override
    public List<RisesinDict> findSearch(Map whereMap) {
        return null;
    }

    @Override
    public RisesinDict findById(Long id) {
        return risesinDictDao.findById(id).get();
    }

    @Override
    public void add(RisesinDict risesinDict) {
        risesinDictDao.save(risesinDict);
    }

    @Override
    public void update(RisesinDict risesinDict) {
        risesinDictDao.save(risesinDict);
    }

    @Override
    public void deleteById(Long id) {
        risesinDictDao.deleteById(id);

    }
}