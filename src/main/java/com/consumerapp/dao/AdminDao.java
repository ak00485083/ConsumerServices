package com.consumerapp.dao;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.consumerapp.model.Admin;

@Component("adminDao")
public class AdminDao {
	
	
	 public Admin findAdmin(String username,String password){
		return new Admin();
	}
	 public Admin getAdmin(String identifier){
		 Admin admin=new Admin();
		 admin.setRole("manager");
		 admin.setJoiningDate(new Date());
		 return admin;
	 }

}
