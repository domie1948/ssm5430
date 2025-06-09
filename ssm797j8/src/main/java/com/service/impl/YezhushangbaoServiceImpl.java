package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YezhushangbaoDao;
import com.entity.YezhushangbaoEntity;
import com.service.YezhushangbaoService;
import com.entity.vo.YezhushangbaoVO;
import com.entity.view.YezhushangbaoView;

@Service("yezhushangbaoService")
public class YezhushangbaoServiceImpl extends ServiceImpl<YezhushangbaoDao, YezhushangbaoEntity> implements YezhushangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhushangbaoEntity> page = this.selectPage(
                new Query<YezhushangbaoEntity>(params).getPage(),
                new EntityWrapper<YezhushangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhushangbaoEntity> wrapper) {
		  Page<YezhushangbaoView> page =new Query<YezhushangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhushangbaoVO> selectListVO(Wrapper<YezhushangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhushangbaoVO selectVO(Wrapper<YezhushangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhushangbaoView> selectListView(Wrapper<YezhushangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhushangbaoView selectView(Wrapper<YezhushangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
