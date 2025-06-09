package com.dao;

import com.entity.KeyishangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyishangbaoVO;
import com.entity.view.KeyishangbaoView;


/**
 * 可疑上报
 * 
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface KeyishangbaoDao extends BaseMapper<KeyishangbaoEntity> {
	
	List<KeyishangbaoVO> selectListVO(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
	
	KeyishangbaoVO selectVO(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
	
	List<KeyishangbaoView> selectListView(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);

	List<KeyishangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
	
	KeyishangbaoView selectView(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
	
}
