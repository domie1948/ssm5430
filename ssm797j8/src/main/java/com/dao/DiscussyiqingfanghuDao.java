package com.dao;

import com.entity.DiscussyiqingfanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiqingfanghuVO;
import com.entity.view.DiscussyiqingfanghuView;


/**
 * 疫情防护评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface DiscussyiqingfanghuDao extends BaseMapper<DiscussyiqingfanghuEntity> {
	
	List<DiscussyiqingfanghuVO> selectListVO(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
	
	DiscussyiqingfanghuVO selectVO(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
	
	List<DiscussyiqingfanghuView> selectListView(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);

	List<DiscussyiqingfanghuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
	
	DiscussyiqingfanghuView selectView(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
	
}
