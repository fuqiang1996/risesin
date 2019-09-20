package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.Dynamic;
import com.risesin.service_api.modules.base.entity.DynamicType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * DynamicType的Dao接口
 *
 * @author honey
 */
public interface DynamicTypeDao extends JpaRepository<DynamicType, Long>, JpaSpecificationExecutor<DynamicType> {
    /**
     * 软删除
     *
     * @param id
     */
    @Transactional
    @Modifying
    @Query(value = "update DynamicType  e set e.delFlag=-1  where e.id = :id")
    @Override
    void deleteById(@Param("id") Long id);

    @Query("from DynamicType e  where e.id=:id")
    @Override
    Optional<DynamicType> findById(@Param("id") Long id);
}