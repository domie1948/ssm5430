package com.entity.view;

import com.entity.DiscussyiqingfanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情防护评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
@TableName("discussyiqingfanghu")
public class DiscussyiqingfanghuView  extends DiscussyiqingfanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyiqingfanghuView(){
	}
 
 	public DiscussyiqingfanghuView(DiscussyiqingfanghuEntity discussyiqingfanghuEntity){
 	try {
			BeanUtils.copyProperties(this, discussyiqingfanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
