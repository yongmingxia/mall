package com.macro.mall.dto;

import java.sql.Timestamp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CmsCompositionParam {   
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "作文类型：0，优秀作文；1，命题作文。。")
    private Integer compositionType;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "评审人")
    private String reviewer;
    @ApiModelProperty(value = "作文评审等级")
    private String level;
    @ApiModelProperty(value = "状态：0，正常；1，下线")
    private Integer status;
    @ApiModelProperty(value = "是否收费")
    private Boolean isFree;
    @ApiModelProperty(value = "描述")
    private String describe;
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间")
    private Timestamp updateTime;
    @ApiModelProperty(value = "阅读次数")
    private Integer readCount;
}