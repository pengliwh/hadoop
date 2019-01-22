package com.chinacscs.usercenter.repository.dao;

import com.chinacscs.platform.commons.dao.BaseDao;
import com.chinacscs.usercenter.repository.entity.UserEntity;

/**
*@author:MG01867
*@date:2018年10月31日
*@email:359852326@qq.com
*@version:
*@describe 用户实体数据访问接口
*/
public interface UserDao extends BaseDao<UserEntity>{

	UserEntity getByName(String name);
}
