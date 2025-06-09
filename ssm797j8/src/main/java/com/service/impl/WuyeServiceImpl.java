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


import com.dao.WuyeDao;
import com.entity.WuyeEntity;
import com.service.WuyeService;
import com.entity.vo.WuyeVO;
import com.entity.view.WuyeView;

@Service("wuyeService")
public class WuyeServiceImpl extends ServiceImpl<WuyeDao, WuyeEntity> implements WuyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyeEntity> page = this.selectPage(
                new Query<WuyeEntity>(params).getPage(),
                new EntityWrapper<WuyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyeEntity> wrapper) {
		  Page<WuyeView> page =new Query<WuyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyeVO> selectListVO(Wrapper<WuyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyeVO selectVO(Wrapper<WuyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyeView> selectListView(Wrapper<WuyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyeView selectView(Wrapper<WuyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
