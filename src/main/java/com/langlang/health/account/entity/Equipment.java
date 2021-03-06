package com.langlang.health.account.entity;

import java.util.Date;

import lombok.Data;

/**
 * 我的设备
 * @ClassName: Equipment 
 * @Description: TODO
 * @author: Daxiang
 * @date: 2019年1月7日 下午2:21:56
 */
@Data
public class Equipment {

	private Integer id;
	private Integer userId;
	private String type;
	private String name;
	private String mac;
	private String uuid;
	private String remark;
	private Date createTime;
	private Date updateTime;
	
}
