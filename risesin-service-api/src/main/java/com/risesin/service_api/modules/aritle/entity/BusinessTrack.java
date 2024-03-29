package com.risesin.service_api.modules.aritle.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


/**
 * 业务追踪
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "business_track")
public class BusinessTrack implements Serializable {

    private static final long serialVersionUID = 5029769743399276632L;

    /**
     * 主键ID
     */
    @Id
    @Column(name = "pk_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文章ID
     */
    @Column(name = "fk_art_id")
    private Long artId;

    /**
     * 访客用户是否注册
     */
    @Column(name = "bus_tra_userid")
    private Long userId;

    /**
     * 用户IP
     */
    @Column(name = "bus_tra_tempuser_ip")
    private String tempUserIp;

    /**
     * 用户来源（文章定制链接）
     */
    @Column(name = "bus_tra_link")
    private String link;

    /**
     * 执行的操作
     */
    @Column(name = "bus_tra_action")
    private String action;

    /**
     * 离开时间
     */
    @Column(name = "bus_departure_time")
    private LocalDateTime departureTime;

    /**
     * 访问时间
     */
    @Column(name = "bus_accesstime")
    private LocalDateTime accessTime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @Column(name = "bus_delflag")
    private Long delFlag;

}
