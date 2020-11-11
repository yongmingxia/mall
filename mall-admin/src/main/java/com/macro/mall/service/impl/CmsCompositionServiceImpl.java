package com.macro.mall.service.impl;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dto.CmsCompositionParam;
import com.macro.mall.dto.CmsCompositionQueryParam;
import com.macro.mall.mapper.CmsCompositionMapper;
import com.macro.mall.model.CmsComposition;
import com.macro.mall.model.CmsCompositionExample;
import com.macro.mall.service.CmsCompositionService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    public List<CmsComposition> listCompositions(final CmsCompositionQueryParam queryParam, final Integer pageNum,
            final Integer pageSize) {
                PageHelper.startPage(pageNum, pageSize);
                final CmsCompositionExample compositionExample = new CmsCompositionExample();
                final CmsCompositionExample.Criteria criteria = compositionExample.createCriteria();
                if(!StringUtils.isEmpty(queryParam.getTitle()))
                {
                    criteria.andTitleLike("%"+queryParam.getTitle()+"%");
                }
                if(queryParam.getStatus()!=null)
                {
                    criteria.andStatusEqualTo(queryParam.getStatus());
                }
                if(!StringUtils.isEmpty(queryParam.getAuthor()))
                {
                    criteria.andTitleLike("%"+queryParam.getAuthor()+"%");
                }
                if(!StringUtils.isEmpty(queryParam.getReviewer()))
                {
                    criteria.andTitleLike("%"+queryParam.getReviewer()+"%");
                }
                return    compositionMapper.selectByExample(compositionExample);
         
            }

    @Override
    public int createComposition(final CmsCompositionParam compositcionParam) {

        final CmsComposition composition=new CmsComposition();
        composition.setReadCount(0);
        BeanUtils.copyProperties(compositcionParam, composition);
        
        final int count= compositionMapper.insertSelective(composition);

        return count;
    }

    @Override
    public int update(final Long id, final CmsCompositionParam compositcionParam) {
        final CmsComposition composition=new CmsComposition();
        composition.setReadCount(0);
        BeanUtils.copyProperties(compositcionParam, composition);
        final CmsCompositionExample example = new CmsCompositionExample();
        example.createCriteria().andIdEqualTo(id);
        return compositionMapper.updateByExampleSelective(composition, example);
    }

    @Override
    public CmsComposition getComposition(final Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}