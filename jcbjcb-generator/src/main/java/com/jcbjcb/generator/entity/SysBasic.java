package com.jcbjcb.generator.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@ApiModel("")
@Table(name = "`sys_basic`")
public class SysBasic {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("")
    private Long id;

    @Column(name = "`path`")
    @ApiModelProperty("")
    private String path;

    @Column(name = "`name`")
    @ApiModelProperty("")
    private String name;

    @Column(name = "`value`")
    @ApiModelProperty("")
    private String value;

    @Column(name = "`create_time`")
    @ApiModelProperty("")
    private Date createTime;

    @Column(name = "`parent_id`")
    @ApiModelProperty("")
    private Long parentId;

    @Column(name = "`stauts`")
    @ApiModelProperty("")
    private Integer stauts;
}