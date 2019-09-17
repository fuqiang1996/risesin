package com.risesin.service_api.dao.product;

import com.risesin.service.modules.product.entity.ProductAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * ProductAuth数据访问接口
 * @author Darling
 *
 */
public interface ProductAuthDao extends JpaRepository<ProductAuth,Long>,JpaSpecificationExecutor<ProductAuth>{
	
}
