package com.risesin.service_api.modules.comuser.entity;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

/**
 * 渠道定义实体
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
    private LocalDateTime chaDefAddtime;

}
