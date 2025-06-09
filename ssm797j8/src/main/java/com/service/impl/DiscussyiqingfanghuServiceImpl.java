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


import com.dao.DiscussyiqingfanghuDao;
import com.entity.DiscussyiqingfanghuEntity;
import com.service.DiscussyiqingfanghuService;
import com.entity.vo.DiscussyiqingfanghuVO;
import com.entity.view.DiscussyiqingfanghuView;

@Service("discussyiqingfanghuService")
public class DiscussyiqingfanghuServiceImpl extends ServiceImpl<DiscussyiqingfanghuDao, DiscussyiqingfanghuEntity> implements DiscussyiqingfanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiqingfanghuEntity> page = this.selectPage(
                new Query<DiscussyiqingfanghuEntity>(params).getPage(),
                new EntityWrapper<DiscussyiqingfanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiqingfanghuEntity> wrapper) {
		  Page<DiscussyiqingfanghuView> page =new Query<DiscussyiqingfanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiqingfanghuVO> selectListVO(Wrapper<DiscussyiqingfanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiqingfanghuVO selectVO(Wrapper<DiscussyiqingfanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiqingfanghuView> selectListView(Wrapper<DiscussyiqingfanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiqingfanghuView selectView(Wrapper<DiscussyiqingfanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
