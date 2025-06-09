package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyeView;


/**
 * 物业
 *
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface WuyeService extends IService<WuyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyeVO> selectListVO(Wrapper<WuyeEntity> wrapper);
   	
   	WuyeVO selectVO(@Param("ew") Wrapper<WuyeEntity> wrapper);
   	
   	List<WuyeView> selectListView(Wrapper<WuyeEntity> wrapper);
   	
   	WuyeView selectView(@Param("ew") Wrapper<WuyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyeEntity> wrapper);
   	
}

