package com.zkg.web.yanix.bl.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkg.web.yanix.bl.daos.UserAdministrationDao;
import com.zkg.web.yanix.bl.models.UserAccount;
import com.zkg.web.yanix.bl.services.UserAdministrationService;

@Service
public class UserAdministrationServiceImpl implements UserAdministrationService {

	@Autowired
	private UserAdministrationDao dao;
	
	@Override
	public UserAccount getUserAccount(String userName) {
		return dao.getUserAccount(userName); 
	}

}
