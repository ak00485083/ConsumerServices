package com.consumerapp.services.impl;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
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
	public Admin getAdminDetails(String username,String password) {
		
		return adminDao.findAdmin(username, password);
	}

	@Override
	public Admin updateAdminDetails(Admin admin) {
		return adminDao.updateAdmin(admin);
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

	public String deleteAdminDetails(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Admin> findAdmin(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createAdmin(Admin admin) throws JsonGenerationException, JsonMappingException, IOException {
		return adminDao.createAdmin(admin);
	}

}
