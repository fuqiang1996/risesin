package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * 通用用户菜单
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */
@Accessors(chain = true) // 可将对象转换成链式设置值(流的形式)
@DynamicInsert // 插入或者修改时 字符串为 ''
@DynamicUpdate
@Setter
@Getter
@ToString
@Entity
@Table(name = "com_menu")
public class ComMenu implements Serializable {

    private static final long serialVersionUID = 1669074002190782326L;

    /**
     * 主键ID：自动增长
     */
    @Id
    @Column(name = "pk_menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 父菜单ID，一级菜单为0
     */
    @Column(name = "menu_parent_id")
    private Long parentId;

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
    private Long isOpen;

    /**
     * 菜单图标
     */
    @Column(name = "menu_icon")
    private String icon;

    /**
     * 创建时间
     */
    @Column(name = "menu_addtime")
    private LocalDateTime addTime;

    /**
     * 修改时间
     */
    @Column(name = "menu_lastmodified")
    private LocalDateTime lastModified;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "menu_delflag")
    private Long delFlag;

    /**
     * 排序
     */
    @Column(name = "menu_order_num")
    private Long orderNum;

}
