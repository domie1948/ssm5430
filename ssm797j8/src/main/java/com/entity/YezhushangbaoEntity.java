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
 * 业主上报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-16 16:01:58
 */
@TableName("yezhushangbao")
public class YezhushangbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YezhushangbaoEntity() {
		
	}
	
	public YezhushangbaoEntity(T t) {
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
	 * 上报标题
	 */
					
	private String shangbaobiaoti;
	
	/**
	 * 最近行程
	 */
					
	private String zuijinxingcheng;
	
	/**
	 * 高危地区
	 */
					
	private String gaoweidiqu;
	
	/**
	 * 身体状态
	 */
					
	private String shentizhuangtai;
	
	/**
	 * 实时体温
	 */
					
	private String shishitiwen;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 楼号
	 */
					
	private String louhao;
	
	/**
	 * 房号
	 */
					
	private String fanghao;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 上报日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangbaoriqi;
	
	/**
	 * 上报内容
	 */
					
	private String shangbaoneirong;
	
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
	 * 设置：上报标题
	 */
	public void setShangbaobiaoti(String shangbaobiaoti) {
		this.shangbaobiaoti = shangbaobiaoti;
	}
	/**
	 * 获取：上报标题
	 */
	public String getShangbaobiaoti() {
		return shangbaobiaoti;
	}
	/**
	 * 设置：最近行程
	 */
	public void setZuijinxingcheng(String zuijinxingcheng) {
		this.zuijinxingcheng = zuijinxingcheng;
	}
	/**
	 * 获取：最近行程
	 */
	public String getZuijinxingcheng() {
		return zuijinxingcheng;
	}
	/**
	 * 设置：高危地区
	 */
	public void setGaoweidiqu(String gaoweidiqu) {
		this.gaoweidiqu = gaoweidiqu;
	}
	/**
	 * 获取：高危地区
	 */
	public String getGaoweidiqu() {
		return gaoweidiqu;
	}
	/**
	 * 设置：身体状态
	 */
	public void setShentizhuangtai(String shentizhuangtai) {
		this.shentizhuangtai = shentizhuangtai;
	}
	/**
	 * 获取：身体状态
	 */
	public String getShentizhuangtai() {
		return shentizhuangtai;
	}
	/**
	 * 设置：实时体温
	 */
	public void setShishitiwen(String shishitiwen) {
		this.shishitiwen = shishitiwen;
	}
	/**
	 * 获取：实时体温
	 */
	public String getShishitiwen() {
		return shishitiwen;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：楼号
	 */
	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	/**
	 * 获取：楼号
	 */
	public String getLouhao() {
		return louhao;
	}
	/**
	 * 设置：房号
	 */
	public void setFanghao(String fanghao) {
		this.fanghao = fanghao;
	}
	/**
	 * 获取：房号
	 */
	public String getFanghao() {
		return fanghao;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
