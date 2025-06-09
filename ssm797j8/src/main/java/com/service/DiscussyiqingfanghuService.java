package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiqingfanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiqingfanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiqingfanghuView;


/**
 * 疫情防护评论表
 *
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface DiscussyiqingfanghuService extends IService<DiscussyiqingfanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiqingfanghuVO> selectListVO(Wrapper<DiscussyiqingfanghuEntity> wrapper);
   	
   	DiscussyiqingfanghuVO selectVO(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
   	
   	List<DiscussyiqingfanghuView> selectListView(Wrapper<DiscussyiqingfanghuEntity> wrapper);
   	
   	DiscussyiqingfanghuView selectView(@Param("ew") Wrapper<DiscussyiqingfanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiqingfanghuEntity> wrapper);
   	
}

