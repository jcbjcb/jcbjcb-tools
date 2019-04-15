package com.jcbjcb.generator.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tab_school")
public class TabSchool {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父项ID[父项ID]
     */
    private Integer pid;

    /**
     * 学校名称[学校名称]
     */
    private String title;

    /**
     * 简称，别名[简称，别名]
     */
    @Column(name = "title_short")
    private String titleShort;

    /**
     * 办学方式[办学方式]
     */
    @Column(name = "school_run_id")
    private Integer schoolRunId;

    /**
     * 学校类别[学校类别]
     */
    @Column(name = "school_type_id")
    private Integer schoolTypeId;

    /**
     * 学校Logo[学校Logo]
     */
    private String logo;

    /**
     * 学校大图[学校大图]
     */
    private String img;

    /**
     * 排名[排名]
     */
    private Integer rank;

    /**
     * 学校名称首字母[学校名称首字母]
     */
    private String letter;

    /**
     * 学校编码[学校编码]
     */
    @Column(name = "school_code")
    private String schoolCode;

    /**
     * 省份[省份]
     */
    @Column(name = "province_id")
    private Integer provinceId;

    /**
     * 城市ID[城市ID]
     */
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 区域ID[区域ID]
     */
    @Column(name = "district_id")
    private Integer districtId;

    /**
     * 地址[地址]
     */
    private String address;

    /**
     * 招生电话[招生电话]
     */
    private String phone;

    /**
     * 官网[官网]
     */
    @Column(name = "web_url")
    private String webUrl;

    /**
     * 关注人数[关注人数]
     */
    @Column(name = "collect_num")
    private Integer collectNum;

    /**
     * 人工设置关注数[人工设置关注数]
     */
    @Column(name = "manual_collect_num")
    private Integer manualCollectNum;

    /**
     * 显示标记  0=不显示，1=显示[显示标记  0=不显示，1=显示]
     */
    @Column(name = "show_flag")
    private Byte showFlag;

    /**
     * 删除标记 0=未删除，1=删除[删除标记 0=未删除，1=删除]
     */
    @Column(name = "del_flag")
    private Byte delFlag;

    /**
     * 生成时间[生成时间]
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间[修改时间]
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注[备注]
     */
    private String remark;

    /**
     * 经度[经度]
     */
    private String lon;

    /**
     * 纬度[纬度]
     */
    private String lat;

    /**
     * 审核标注 0=未审核，1=已审核[审核标注 0=未审核，1=已审核]
     */
    @Column(name = "audit_flag")
    private Byte auditFlag;

    /**
     * 操作员[操作员]
     */
    @Column(name = "operator_id")
    private Integer operatorId;

    /**
     * 创建者[创建者]
     */
    @Column(name = "creator_id")
    private Integer creatorId;

    /**
     * 审核员ID[审核员ID]
     */
    @Column(name = "auditor_id")
    private Integer auditorId;

    /**
     * 办学层次
     */
    @Column(name = "school_way")
    private Integer schoolWay;

    /**
     * 0=非艺考，1=艺考，2=混合(包含艺考与非艺考)
     */
    @Column(name = "art_flag")
    private Integer artFlag;

    /**
     * 男女比例，对应字典表
     */
    @Column(name = "sex_ratio_id")
    private Integer sexRatioId;

    /**
     * 考研率
     */
    @Column(name = "research_rate")
    private Double researchRate;

    /**
     * 留学率
     */
    @Column(name = "study_rate")
    private Double studyRate;

    /**
     * 研究生录取率
     */
    @Column(name = "research_admission_rate")
    private Double researchAdmissionRate;

    /**
     * 学校录取率
     */
    @Column(name = "admission_rate")
    private Double admissionRate;

    /**
     * 学校介绍[学校介绍]
     */
    private String content;

    /**
     * 师资介绍[师资介绍]
     */
    @Column(name = "teacher_introduce")
    private String teacherIntroduce;

    /**
     * 艺术类学校介绍
     */
    @Column(name = "content_arts")
    private String contentArts;
}