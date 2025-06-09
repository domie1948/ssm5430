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


import com.dao.YiqingfanghuDao;
import com.entity.YiqingfanghuEntity;
import com.service.YiqingfanghuService;
import com.entity.vo.YiqingfanghuVO;
import com.entity.view.YiqingfanghuView;

@Service("yiqingfanghuService")
public class YiqingfanghuServiceImpl extends ServiceImpl<YiqingfanghuDao, YiqingfanghuEntity> implements YiqingfanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingfanghuEntity> page = this.selectPage(
                new Query<YiqingfanghuEntity>(params).getPage(),
                new EntityWrapper<YiqingfanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingfanghuEntity> wrapper) {
		  Page<YiqingfanghuView> page =new Query<YiqingfanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingfanghuVO> selectListVO(Wrapper<YiqingfanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingfanghuVO selectVO(Wrapper<YiqingfanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingfanghuView> selectListView(Wrapper<YiqingfanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingfanghuView selectView(Wrapper<YiqingfanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
