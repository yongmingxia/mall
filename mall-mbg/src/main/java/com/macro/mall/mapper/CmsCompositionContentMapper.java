package com.macro.mall.mapper;

import com.macro.mall.model.CmsCompositionContent;
import com.macro.mall.model.CmsCompositionContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCompositionContentMapper {
    long countByExample(CmsCompositionContentExample example);

    int deleteByExample(CmsCompositionContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsCompositionContent record);

    int insertSelective(CmsCompositionContent record);

    List<CmsCompositionContent> selectByExample(CmsCompositionContentExample example);

    CmsCompositionContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsCompositionContent record, @Param("example") CmsCompositionContentExample example);

    int updateByExample(@Param("record") CmsCompositionContent record, @Param("example") CmsCompositionContentExample example);

    int updateByPrimaryKeySelective(CmsCompositionContent record);

    int updateByPrimaryKey(CmsCompositionContent record);
}