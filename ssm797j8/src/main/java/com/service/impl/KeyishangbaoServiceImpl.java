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


import com.dao.KeyishangbaoDao;
import com.entity.KeyishangbaoEntity;
import com.service.KeyishangbaoService;
import com.entity.vo.KeyishangbaoVO;
import com.entity.view.KeyishangbaoView;

@Service("keyishangbaoService")
public class KeyishangbaoServiceImpl extends ServiceImpl<KeyishangbaoDao, KeyishangbaoEntity> implements KeyishangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyishangbaoEntity> page = this.selectPage(
                new Query<KeyishangbaoEntity>(params).getPage(),
                new EntityWrapper<KeyishangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyishangbaoEntity> wrapper) {
		  Page<KeyishangbaoView> page =new Query<KeyishangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyishangbaoVO> selectListVO(Wrapper<KeyishangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyishangbaoVO selectVO(Wrapper<KeyishangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyishangbaoView> selectListView(Wrapper<KeyishangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyishangbaoView selectView(Wrapper<KeyishangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
