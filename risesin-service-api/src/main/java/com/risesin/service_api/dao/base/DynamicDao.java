package com.risesin.service_api.dao.base;

import com.risesin.service_api.modules.base.entity.CommentType;
import com.risesin.service_api.modules.base.entity.Dynamic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Dynamic数据访问接口
 *
 * @author Darling
 */
public interface DynamicDao extends JpaRepository<Dynamic, Long>, JpaSpecificationExecutor<Dynamic> {

//    /**
//     * 软删除
//     *
//     * @param id
//     */
//    @Transactional
//    @Modifying
//    @Query(value = "update Dynamic  e set e.delFlag=-1  where e.id = :id")
//    @Override
//    void deleteById(@Param("id") Long id);


    @Query("from Dynamic e  where e.id=:id")
    @Override
    Optional<Dynamic> findById(@Param("id") Long id);
}
