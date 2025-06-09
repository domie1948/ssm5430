package com.entity.view;

import com.entity.YezhushangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
@TableName("yezhushangbao")
public class YezhushangbaoView  extends YezhushangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhushangbaoView(){
	}
 
 	public YezhushangbaoView(YezhushangbaoEntity yezhushangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, yezhushangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
