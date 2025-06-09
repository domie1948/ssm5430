package com.dao;

import com.entity.YezhushangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhushangbaoVO;
import com.entity.view.YezhushangbaoView;


/**
 * 业主上报
 * 
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface YezhushangbaoDao extends BaseMapper<YezhushangbaoEntity> {
	
	List<YezhushangbaoVO> selectListVO(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
	
	YezhushangbaoVO selectVO(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
	
	List<YezhushangbaoView> selectListView(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);

	List<YezhushangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
	
	YezhushangbaoView selectView(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
	
}
