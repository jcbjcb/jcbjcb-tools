package com.jcbjcb.generator.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("School")
@Table(name = "tab_school")
public class TabSchool {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("ID")
    private Integer id;

    /**
     * 父项ID[父项ID]
     */
    @ApiModelProperty("父项ID[父项ID]")
    private Integer pid;

    /**
     * 学校名称[学校名称]
     */
    @ApiModelProperty("学校名称[学校名称]")
    private String title;

    /**
     * 简称，别名[简称，别名]
     */
    @Column(name = "title_short")
    @ApiModelProperty("简称，别名[简称，别名]")
    private String titleShort;

    /**
     * 办学方式[办学方式]
     */
    @Column(name = "school_run_id")
    @ApiModelProperty("办学方式[办学方式]")
    private Integer schoolRunId;

    /**
     * 学校类别[学校类别]
     */
    @Column(name = "school_type_id")
    @ApiModelProperty("学校类别[学校类别]")
    private Integer schoolTypeId;

    /**
     * 学校Logo[学校Logo]
     */
    @ApiModelProperty("学校Logo[学校Logo]")
    private String logo;

    /**
     * 学校大图[学校大图]
     */
    @ApiModelProperty("学校大图[学校大图]")
    private String img;

    /**
     * 排名[排名]
     */
    @ApiModelProperty("排名[排名]")
    private Integer rank;

    /**
     * 学校名称首字母[学校名称首字母]
     */
    @ApiModelProperty("学校名称首字母[学校名称首字母]")
    private String letter;

    /**
     * 学校编码[学校编码]
     */
    @Column(name = "school_code")
    @ApiModelProperty("学校编码[学校编码]")
    private String schoolCode;

    /**
     * 省份[省份]
     */
    @Column(name = "province_id")
    @ApiModelProperty("省份[省份]")
    private Integer provinceId;

    /**
     * 城市ID[城市ID]
     */
    @Column(name = "city_id")
    @ApiModelProperty("城市ID[城市ID]")
    private Integer cityId;

    /**
     * 区域ID[区域ID]
     */
    @Column(name = "district_id")
    @ApiModelProperty("区域ID[区域ID]")
    private Integer districtId;

    /**
     * 地址[地址]
     */
    @ApiModelProperty("地址[地址]")
    private String address;

    /**
     * 招生电话[招生电话]
     */
    @ApiModelProperty("招生电话[招生电话]")
    private String phone;

    /**
     * 官网[官网]
     */
    @Column(name = "web_url")
    @ApiModelProperty("官网[官网]")
    private String webUrl;

    /**
     * 关注人数[关注人数]
     */
    @Column(name = "collect_num")
    @ApiModelProperty("关注人数[关注人数]")
    private Integer collectNum;

    /**
     * 人工设置关注数[人工设置关注数]
     */
    @Column(name = "manual_collect_num")
    @ApiModelProperty("人工设置关注数[人工设置关注数]")
    private Integer manualCollectNum;

    /**
     * 显示标记  0=不显示，1=显示[显示标记  0=不显示，1=显示]
     */
    @Column(name = "show_flag")
    @ApiModelProperty("显示标记  0=不显示，1=显示[显示标记  0=不显示，1=显示]")
    private Byte showFlag;

    /**
     * 删除标记 0=未删除，1=删除[删除标记 0=未删除，1=删除]
     */
    @Column(name = "del_flag")
    @ApiModelProperty("删除标记 0=未删除，1=删除[删除标记 0=未删除，1=删除]")
    private Byte delFlag;

    /**
     * 生成时间[生成时间]
     */
    @Column(name = "create_time")
    @ApiModelProperty("生成时间[生成时间]")
    private Date createTime;

    /**
     * 修改时间[修改时间]
     */
    @Column(name = "update_time")
    @ApiModelProperty("修改时间[修改时间]")
    private Date updateTime;

    /**
     * 备注[备注]
     */
    @ApiModelProperty("备注[备注]")
    private String remark;

    /**
     * 经度[经度]
     */
    @ApiModelProperty("经度[经度]")
    private String lon;

    /**
     * 纬度[纬度]
     */
    @ApiModelProperty("纬度[纬度]")
    private String lat;

    /**
     * 审核标注 0=未审核，1=已审核[审核标注 0=未审核，1=已审核]
     */
    @Column(name = "audit_flag")
    @ApiModelProperty("审核标注 0=未审核，1=已审核[审核标注 0=未审核，1=已审核]")
    private Byte auditFlag;

    /**
     * 操作员[操作员]
     */
    @Column(name = "operator_id")
    @ApiModelProperty("操作员[操作员]")
    private Integer operatorId;

    /**
     * 创建者[创建者]
     */
    @Column(name = "creator_id")
    @ApiModelProperty("创建者[创建者]")
    private Integer creatorId;

    /**
     * 审核员ID[审核员ID]
     */
    @Column(name = "auditor_id")
    @ApiModelProperty("审核员ID[审核员ID]")
    private Integer auditorId;

    /**
     * 办学层次
     */
    @Column(name = "school_way")
    @ApiModelProperty("办学层次")
    private Integer schoolWay;

    /**
     * 0=非艺考，1=艺考，2=混合(包含艺考与非艺考)
     */
    @Column(name = "art_flag")
    @ApiModelProperty("0=非艺考，1=艺考，2=混合(包含艺考与非艺考)")
    private Integer artFlag;

    /**
     * 男女比例，对应字典表
     */
    @Column(name = "sex_ratio_id")
    @ApiModelProperty("男女比例，对应字典表")
    private Integer sexRatioId;

    /**
     * 考研率
     */
    @Column(name = "research_rate")
    @ApiModelProperty("考研率")
    private Double researchRate;

    /**
     * 留学率
     */
    @Column(name = "study_rate")
    @ApiModelProperty("留学率")
    private Double studyRate;

    /**
     * 研究生录取率
     */
    @Column(name = "research_admission_rate")
    @ApiModelProperty("研究生录取率")
    private Double researchAdmissionRate;

    /**
     * 学校录取率
     */
    @Column(name = "admission_rate")
    @ApiModelProperty("学校录取率")
    private Double admissionRate;

    /**
     * 学校介绍[学校介绍]
     */
    @ApiModelProperty("学校介绍[学校介绍]")
    private String content;

    /**
     * 师资介绍[师资介绍]
     */
    @Column(name = "teacher_introduce")
    @ApiModelProperty("师资介绍[师资介绍]")
    private String teacherIntroduce;

    /**
     * 艺术类学校介绍
     */
    @Column(name = "content_arts")
    @ApiModelProperty("艺术类学校介绍")
    private String contentArts;
}