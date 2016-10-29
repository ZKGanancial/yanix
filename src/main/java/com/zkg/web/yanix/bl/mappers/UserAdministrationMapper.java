package com.zkg.web.yanix.bl.mappers;

import org.apache.ibatis.annotations.Param;

import com.zkg.web.yanix.bl.models.UserAccount;

public interface UserAdministrationMapper {

	public UserAccount getUserAccount(@Param("userName") String userName);

}
