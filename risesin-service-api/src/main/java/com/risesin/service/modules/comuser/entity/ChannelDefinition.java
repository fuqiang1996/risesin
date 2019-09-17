package com.risesin.service.modules.comuser.entity;

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
 * 渠道定义实体
 *
 * @Description
 * @Author Baby
 * @Date 2019-09-16
 */

@Setter
@Getter
@ToString
@Entity
@Table(name = "channel_definition")
public class ChannelDefinition implements Serializable {

    private static final long serialVersionUID = 1022628185871828200L;

    /**
     * 主键ID
     */
    @Column(name = "pk_cha_def_id")
    @Id
    private Long id;

    /**
     * 渠道来源
     */
    @Column(name = "cha_def_name")
    private String chaDefName;

    /**
     * 渠道编号
     */
    @Column(name = "cha_def_code")
    private String chaDefCode;

    /**
     * 创建时间
     */
    @Column(name = "cha_def_addtime")
    private Date chaDefAddtime;

}
