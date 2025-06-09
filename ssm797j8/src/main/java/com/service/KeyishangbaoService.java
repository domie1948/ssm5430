package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyishangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyishangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyishangbaoView;


/**
 * 可疑上报
 *
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface KeyishangbaoService extends IService<KeyishangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyishangbaoVO> selectListVO(Wrapper<KeyishangbaoEntity> wrapper);
   	
   	KeyishangbaoVO selectVO(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
   	
   	List<KeyishangbaoView> selectListView(Wrapper<KeyishangbaoEntity> wrapper);
   	
   	KeyishangbaoView selectView(@Param("ew") Wrapper<KeyishangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyishangbaoEntity> wrapper);
   	
}

