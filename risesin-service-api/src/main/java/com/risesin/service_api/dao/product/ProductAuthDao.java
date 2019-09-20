package com.risesin.service_api.dao.product;

import com.risesin.service_api.modules.product.entity.ProductAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * ProductAuth数据访问接口
 * @author Darling
 *
 */
public interface ProductAuthDao extends JpaRepository<ProductAuth,Long>,JpaSpecificationExecutor<ProductAuth>{

    @Override
    @Modifying
    @Query("update ProductAuth p set p.delFlag = -1 where p.id = :id")
    void deleteById(@Param("id") Long id);
}
