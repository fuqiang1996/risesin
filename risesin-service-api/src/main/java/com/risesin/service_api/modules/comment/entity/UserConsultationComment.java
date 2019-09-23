package com.risesin.service_api.modules.comment.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user_consultation_comment")
public class UserConsultationComment implements Serializable {
    /*
     * 主键
     */
    @Id
    @Column(name = "pk_cstt_comt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 评价附加
     */
    @Column(name = "cstt_comt_addtion")
    private String addTion;

    /**
     * 评价附加
     */
    @Column(name = "cstt_comt_addtime")
    private String addTime;

    /**
     * 评价人
     */
    @Column(name = "cstt_comt_voter_id")
    private String voterId;

    /**
     * 服务评分
     */
    @Column(name = "cstt_comt_score")
    private String score;

    /**
     * session
     */
    @Column(name = "cstt_comt_session_id")
    private String sessionId;

    /**
     * 评价类型
     */
    @Column(name = "fk_cstt_comt_type_id")
    private String typeId;

    /**
     * 服务提供者
     */
    @Column(name = "fk_cstt_comt_provider_id")
    private String providerId;
}
