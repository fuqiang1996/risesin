package com.risesin.service_api.dao.dict;

import com.risesin.service_api.modules.dict.RisesinDict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

/**
 * RisesinDict的Dao接口
 *
 * @author
 */
public interface RisesinDictDao extends JpaRepository<RisesinDict, Long>, JpaSpecificationExecutor<RisesinDict> {

    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update RisesinDict  a set a.delFlag=-1 where a.id = :id")
    @Override
    void deleteById(@Param("id") Long id);

}