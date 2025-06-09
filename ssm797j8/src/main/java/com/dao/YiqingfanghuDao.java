package com.dao;

import com.entity.YiqingfanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingfanghuVO;
import com.entity.view.YiqingfanghuView;


/**
 * 疫情防护
 * 
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface YiqingfanghuDao extends BaseMapper<YiqingfanghuEntity> {
	
	List<YiqingfanghuVO> selectListVO(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
	
	YiqingfanghuVO selectVO(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
	
	List<YiqingfanghuView> selectListView(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);

	List<YiqingfanghuView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
	
	YiqingfanghuView selectView(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
	
}
