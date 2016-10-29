package com.zkg.web.yanix.bl.daos.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zkg.web.yanix.bl.daos.UserAdministrationDao;
import com.zkg.web.yanix.bl.mappers.UserAdministrationMapper;
import com.zkg.web.yanix.bl.models.UserAccount;

@Component
public class UserAdministrationDaoImpl implements UserAdministrationDao {

	@Autowired
	private UserAdministrationMapper mapper;
	
	@Override
	public UserAccount getUserAccount(String userName) {
		return mapper.getUserAccount(userName);
	}

}
