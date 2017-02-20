package com.consumerapp.services;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.consumerapp.model.Admin;

public interface AdminService {
	
	public Admin getAdminDetails(String username,String password);
	public Admin updateAdminDetails(Admin admin);
	public Admin changeRole(Admin admin);
	public void sendGeneralNotification();
	public String deleteAdminDetails(String identifier);
	public List<Admin> findAdmin(String identifier);
	public String createAdmin(Admin admin) throws JsonGenerationException, JsonMappingException, IOException;
	public List<Admin> search();
	
}
