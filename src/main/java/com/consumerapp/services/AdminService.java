package com.consumerapp.services;

import com.consumerapp.model.Admin;

public interface AdminService {
	
	public Admin getAdminDetails(String username,String password);
	public Admin updateAdminDetails(Admin admin);
	public Admin changeRole(Admin admin);
	public void sendGeneralNotification();
	
}
