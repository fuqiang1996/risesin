package com.risesin.service_api.dao.sysuser;

import com.risesin.service_api.modules.system.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * SysUser的Dao接口
 *
 * @author honey
 */
public interface SysUserDao extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {

    @Override
    @Modifying
    @Query("update SysUser u set u.delFlag = -1 where u.id = :id")
    void deleteById(@Param("id") Long id);


    @Modifying
    @Query(value = "update SysUser u set u.delFlag=-1 where u.id in (:ids) ")
    int deleteByIds(@Param("ids") List<Long> ids);

    /**
     * 查询单条
     *
     * @param id
     * @return
     */
    @Query(value = "select * from sys_user u where u.sys_del_flag=0 and u.pk_id=?1", nativeQuery = true)
    SysUser getById(@Param("id") Long id);


    @Query("from SysUser u where u.account=:account and u.password=:password")
    SysUser findByAccountAndPassword(String account, String password);


    List<String> findByIdIn(List<String> roleIds);


    /**
     * 设置菜单权限
     *
     * @param userIds
     * @param roleIds
     * @return
     */
    @Query("")
    boolean grant(String userIds, String roleIds);
}