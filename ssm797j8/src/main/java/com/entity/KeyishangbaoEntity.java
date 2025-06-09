package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 可疑上报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
@TableName("keyishangbao")
public class KeyishangbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeyishangbaoEntity() {
		
	}
	
	public KeyishangbaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题名称
	 */
					
	private String biaotimingcheng;
	
	/**
	 * 上报内容
	 */
					
	private String shangbaoneirong;
	
	/**
	 * 上报日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题名称
	 */
	public void setBiaotimingcheng(String biaotimingcheng) {
		this.biaotimingcheng = biaotimingcheng;
	}
	/**
	 * 获取：标题名称
	 */
	public String getBiaotimingcheng() {
		return biaotimingcheng;
	}
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
