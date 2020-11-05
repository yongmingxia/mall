package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CmsCompositionQueryParam {
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "评审人")
    private String reviewer;
    @ApiModelProperty(value = "状态：0，正常；1，下线")
    private Integer status;
}