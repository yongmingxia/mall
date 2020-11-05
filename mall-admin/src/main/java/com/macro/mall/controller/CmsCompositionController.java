package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.CmsCompositionParam;
import com.macro.mall.service.CmsCompositionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags = "CmsCompositionController", description = "作文管理")
@RequestMapping("/composition")
public class CmsCompositionController {

    @Autowired
    private CmsCompositionService cmsCompositionService;
    @ApiOperation("添加作文")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody CmsCompositionParam cmsCompositionParam) {
        
        int count = cmsCompositionService.createComposition(cmsCompositionParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}