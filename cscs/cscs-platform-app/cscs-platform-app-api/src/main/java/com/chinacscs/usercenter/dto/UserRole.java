package com.chinacscs.usercenter.dto;


import com.chinacscs.platform.commons.dto.AuditBaseDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserRole extends AuditBaseDTO{

	/**用户id**/
	private String userId;
	
	/**角色id**/
	private String roleId;
}