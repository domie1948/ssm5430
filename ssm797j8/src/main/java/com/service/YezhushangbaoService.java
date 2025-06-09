package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhushangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhushangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhushangbaoView;


/**
 * 业主上报
 *
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface YezhushangbaoService extends IService<YezhushangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhushangbaoVO> selectListVO(Wrapper<YezhushangbaoEntity> wrapper);
   	
   	YezhushangbaoVO selectVO(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
   	
   	List<YezhushangbaoView> selectListView(Wrapper<YezhushangbaoEntity> wrapper);
   	
   	YezhushangbaoView selectView(@Param("ew") Wrapper<YezhushangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhushangbaoEntity> wrapper);
   	
}

