package com.macro.mall.mapper;

import com.macro.mall.model.CmsComposition;
import com.macro.mall.model.CmsCompositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCompositionMapper {
    long countByExample(CmsCompositionExample example);

    int deleteByExample(CmsCompositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsComposition record);

    int insertSelective(CmsComposition record);

    List<CmsComposition> selectByExample(CmsCompositionExample example);

    CmsComposition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsComposition record, @Param("example") CmsCompositionExample example);

    int updateByExample(@Param("record") CmsComposition record, @Param("example") CmsCompositionExample example);

    int updateByPrimaryKeySelective(CmsComposition record);

    int updateByPrimaryKey(CmsComposition record);
}