package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingfanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingfanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingfanghuView;


/**
 * 疫情防护
 *
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public interface YiqingfanghuService extends IService<YiqingfanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingfanghuVO> selectListVO(Wrapper<YiqingfanghuEntity> wrapper);
   	
   	YiqingfanghuVO selectVO(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
   	
   	List<YiqingfanghuView> selectListView(Wrapper<YiqingfanghuEntity> wrapper);
   	
   	YiqingfanghuView selectView(@Param("ew") Wrapper<YiqingfanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingfanghuEntity> wrapper);
   	
}

