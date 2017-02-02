package com.consumerapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.consumerapp.dao.AdminDao;
import com.consumerapp.model.Admin;
import com.consumerapp.services.AdminService;


@Component("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao;

	@Override
	public Admin getAdminDetails(String identifier) {
		
		return adminDao.getAdmin(identifier);
	}

	@Override
	public Admin updateAdminDetails(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin changeRole(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendGeneralNotification() {
		// TODO Auto-generated method stub
		
	}

}
