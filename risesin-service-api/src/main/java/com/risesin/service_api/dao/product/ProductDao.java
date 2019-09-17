package com.risesin.service_api.dao.product;

import com.risesin.service_api.modules.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* Product的Dao接口
*
* @author honey
*
*/
public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}