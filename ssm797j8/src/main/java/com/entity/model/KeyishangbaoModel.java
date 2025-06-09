package com.entity.model;

import com.entity.KeyishangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 可疑上报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
public class KeyishangbaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 上报内容
	 */
	
	private String shangbaoneirong;
		
	/**
	 * 上报日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangbaoriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 物业工号
	 */
	
	private String wuyegonghao;
		
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：上报内容
	 */
	 
	public void setShangbaoneirong(String shangbaoneirong) {
		this.shangbaoneirong = shangbaoneirong;
	}
	
	/**
	 * 获取：上报内容
	 */
	public String getShangbaoneirong() {
		return shangbaoneirong;
	}
				
	
	/**
	 * 设置：上报日期
	 */
	 
	public void setShangbaoriqi(Date shangbaoriqi) {
		this.shangbaoriqi = shangbaoriqi;
	}
	
	/**
	 * 获取：上报日期
	 */
	public Date getShangbaoriqi() {
		return shangbaoriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：物业工号
	 */
	 
	public void setWuyegonghao(String wuyegonghao) {
		this.wuyegonghao = wuyegonghao;
	}
	
	/**
	 * 获取：物业工号
	 */
	public String getWuyegonghao() {
		return wuyegonghao;
	}
				
	
	/**
	 * 设置：物业姓名
	 */
	 
	public void setWuyexingming(String wuyexingming) {
		this.wuyexingming = wuyexingming;
	}
	
	/**
	 * 获取：物业姓名
	 */
	public String getWuyexingming() {
		return wuyexingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
