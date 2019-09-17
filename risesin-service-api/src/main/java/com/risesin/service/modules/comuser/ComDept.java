package com.risesin.service.modules.comuser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import java.util.Date;

/**
 * 通用用户（助贷机构）部门
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "com_dept")
public class ComDept implements Serializable {

    private static final long serialVersionUID = 5034985144321425176L;

    /**
     * 主键
     */
    @Column(name = "pk_dept_id")
    @Id
    private Long id;

    /**
     * 部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 上级部门ID，一级部门为0
     */
    @Column(name = "dept_parent_id")
    private String parentId;

    /**
     * 排序
     */
    @Column(name = "dept_order_num")
    private Long orderNum;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "dept_del_flag")
    private Long delFlag;

    /**
     * 公司ID
     */
    @Column(name = "fk_dept_bran_id")
    private String branId;

    /**
     * 创建时间
     */
    @Column(name = "dept_addtime")
    private Date addtime;

    /**
     * 修改时间
     */
    @Column(name = "dept_lastmodify")
    private Date lastmodify;

}
