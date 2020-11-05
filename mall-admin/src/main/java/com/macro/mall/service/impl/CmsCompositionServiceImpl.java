package com.macro.mall.service.impl;

import java.util.List;

import com.macro.mall.dto.CmsCompositionParam;
import com.macro.mall.dto.CmsCompositionQueryParam;
import com.macro.mall.mapper.CmsCompositionMapper;
import com.macro.mall.model.CmsComposition;
import com.macro.mall.service.CmsCompositionService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsCompositionServiceImpl implements CmsCompositionService {

    @Autowired
    private CmsCompositionMapper compositionMapper;

    @Override
    public List<CmsComposition> listAllCompositions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CmsComposition> listCompositions(CmsCompositionQueryParam queryParam, Integer pageNum,
            Integer pageSize) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int createComposition(CmsCompositionParam compositcionParam) {

        CmsComposition composition=new CmsComposition();
        composition.setReadCount(0);
        BeanUtils.copyProperties(compositcionParam, composition);
        
        int count= compositionMapper.insertSelective(composition);

        return count;
    }

    @Override
    public int update(Long id, CmsCompositionParam compositcionParam) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public CmsComposition getComposition(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}