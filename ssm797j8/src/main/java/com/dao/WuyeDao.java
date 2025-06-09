package com.dao;

import com.entity.WuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeVO;
import com.entity.view.WuyeView;


/**
 * 物业
 * 
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface WuyeDao extends BaseMapper<WuyeEntity> {
	
	List<WuyeVO> selectListVO(@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	WuyeVO selectVO(@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	List<WuyeView> selectListView(@Param("ew") Wrapper<WuyeEntity> wrapper);

	List<WuyeView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	WuyeView selectView(@Param("ew") Wrapper<WuyeEntity> wrapper);
	
}
