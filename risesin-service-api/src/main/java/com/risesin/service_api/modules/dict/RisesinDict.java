package com.risesin.service_api.modules.dict;

import javax.persistence.*;
import java.io.Serializable;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * risesin_dict实体类
 *
 * @author honey
 */
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "risesin_dict")
public class RisesinDict implements Serializable {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;
    /**
     * 父主键
     */
    @Column(name = "parent_id")
    private Long parentId;
    /**
     * 字典码
     */
    @Column(name = "code")
    private String code;
    /**
     * 字典值
     */
    @Column(name = "dict_key")
    private Long dictKey;
    /**
     * 字典名称
     */
    @Column(name = "dict_value")
    private String dictValue;
    /**
     * 排序
     */
    @Column(name = "sort")
    private Integer sort;
    /**
     * 字典备注
     */
    @Column(name = "remark")
    private String remark;
    /**
     * 是否已删除
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * 实例化
     */
    public RisesinDict() {
        super();
    }


}
