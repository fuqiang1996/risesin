package com.risesin.service_api.modules.system.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜单对象
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 7849772831117016774L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pkMenuId;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 父菜单ID，一级菜单为0
     */
    @Column(name = "menu_parent_id")
    private Long menuParentId;

    /**
     * 类型   0：目录   1：菜单   2：按钮
     */
    @Column(name = "menu_type")
    private String menuType;

    /**
     * 菜单URL
     */
    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * 是否打开新页面
     */
    @Column(name = "menu_is_open")
    private Long menuIsOpen;

    /**
     * 菜单图标
     */
    @Column(name = "menu_icon")
    private String menuIcon;

    /**
     * 创建时间
     */
    @Column(name = "menu_addtime")
    private Date menuAddtime;

    /**
     * 修改时间
     */
    @Column(name = "menu_lastmodified")
    private Date menuLastmodified;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "menu_delflag")
    private Long menuDelflag;

    /**
     * 排序
     */
    @Column(name = "menu_order_num")
    private Long menuOrderNum;

}
