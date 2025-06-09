package com.entity.view;

import com.entity.KeyishangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 可疑上报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
@TableName("keyishangbao")
public class KeyishangbaoView  extends KeyishangbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyishangbaoView(){
	}
 
 	public KeyishangbaoView(KeyishangbaoEntity keyishangbaoEntity){
 	try {
			BeanUtils.copyProperties(this, keyishangbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
