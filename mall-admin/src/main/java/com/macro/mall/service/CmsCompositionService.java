package com.macro.mall.service;

import java.util.List;

import com.macro.mall.dto.CmsCompositionParam;
import com.macro.mall.dto.CmsCompositionQueryParam;
import com.macro.mall.model.CmsComposition;

public interface CmsCompositionService {

    ///获取所以作文
    List<CmsComposition> listAllCompositions();

    ///分页查询
    List<CmsComposition> listCompositions(CmsCompositionQueryParam queryParam, Integer pageNum, Integer pageSize);

    //新增
    int createComposition(CmsCompositionParam compositcionParam);

    //更新
    int update(Long id, CmsCompositionParam compositcionParam);

    CmsComposition getComposition(Long id);
}