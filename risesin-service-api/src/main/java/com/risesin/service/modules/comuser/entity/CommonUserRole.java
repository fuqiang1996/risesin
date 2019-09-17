package com.risesin.service.modules.comuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

/**
 * CommonUserRole 对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "common_user_role")
public class CommonUserRole implements Serializable {

    private static final long serialVersionUID = 1866795363456993123L;

    /**
     * 主键ID
     */
    @Column(name = "pk_id")
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "fk_common_user_id")
    private Long commonUserId;

    /**
     * 角色ID
     */
    @Column(name = "fk_role_id")
    private Long roleId;

}
