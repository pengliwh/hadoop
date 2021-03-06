package com.chinacscs.usercenter.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinacscs.usercenter.ServiceName;
import com.chinacscs.usercenter.dto.UserRole;

/**
*@author:MG01867
*@date:2018年11月5日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/user_role")
public interface UserRoleService {

	@RequestMapping(value = "/getByUserIdAndRoleId", method = RequestMethod.POST)
	UserRole getByUserIdAndRoleId(@RequestParam(name="userId") String userId,@RequestParam(name="roleId") String roleId);
	
	@RequestMapping(value = "/listByRoleId", method = RequestMethod.POST)
	List<UserRole> listByRoleId(@RequestParam(name="roleId") String roleId);
	
	@RequestMapping(value = "/listByUserId", method = RequestMethod.POST)
	List<UserRole> listByUserId(@RequestParam(name="userId") String userId);
}
