package com.risesin.service_api.modules.base.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;


/**
 * @Description Industry行业类
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@DynamicUpdate
@DynamicInsert
@Entity
@Table(name = "industry")
public class Industry implements Serializable {

    private static final long serialVersionUID = 674579360544372711L;

    /**
     * 编号
     */
    @Column(name = "pk_ind_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编号
     */
    @Column(name = "ind_code")
    private String industryCode;

    /**
     * 名称
     */
    @Column(name = "ind_name")
    private String industryName;

    /**
     * 删除标记
     */
    @Column(name = "ind_delflag")
    private Long delFlag;

    /**
     * 父id
     */
    @Column(name = "ind_parent")
    private Long industryPid;

    /**
     * 创建时间
     */
    @Column(name = "ind_addtime")
    private LocalDateTime addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "ind_lastmodify")
    private LocalDateTime lastModify;;

}
