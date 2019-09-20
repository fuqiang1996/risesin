package com.risesin.service_api.dao.product;

import com.risesin.service_api.modules.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
* Product的Dao接口
*
* @author honey
*
*/
public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    @Override
    @Modifying
    @Query("update Product p set p.delFlag = -1 where p.id = :id")
    void deleteById(@Param("id") Long id);
}