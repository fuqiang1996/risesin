package com.risesin.service_api.modules.comuser.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
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
    @Id
    @Column(name = "pk_cha_def_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
