package com.risesin.service_api.dao.core;

import com.risesin.service_api.modules.core.entity.EntDebtHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * debtHistory数据访问接口
 * @author Darling
 *
 */
public interface EntDebtHistoryDao extends JpaRepository<EntDebtHistory,Long>,JpaSpecificationExecutor<EntDebtHistory>{
    @Override
    @Query("update EntDebtHistory t set t.delFlag = -1 where t.id = :id")
    @Modifying
    void deleteById(@Param("id") Long id);
}
