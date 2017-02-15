package com.consumerapp.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.consumerapp.model.Address;
import com.consumerapp.model.Admin;

@Component("adminDao")
public class AdminDao {

	 static ArrayList<Admin> adminCollection=new ArrayList<>();
	static{

		adminCollection.add(new Admin("manager", "rm0012897", "anything","roshan","mankar", "pimple gurav",new Date(),"9874563215",
				new Address("dange chowk","A 303","opp macdonalds", "pune", "maharashtra", "411033")));
		adminCollection.add(new Admin("junior manager", "ps0012677", "anything","raj","abhishek", "pimple gurav",new Date(),"5236478915",
				new Address("dange chowk","A 303","opp macdonalds", "pune", "maharashtra", "411033")));
		adminCollection.add(new Admin("manager", "np0012397", "anything","kumar","abhishek", "pimple gurav",new Date(),"6547893215",
				new Address("dange chowk","A 303","opp macdonalds", "pune", "maharashtra", "411033")));
		adminCollection.add(new Admin("junior manager", "sd0098897", "anything","nirmal","baba", "pimple gurav",new Date(),"74568931452",
				new Address("dange chowk","A 303","opp macdonalds", "pune", "maharashtra", "411033")));
	}

	public Admin findAdmin(String username,String password){
		
		for (Admin admin : adminCollection) {
			if(admin.getUsername().equals(username)&& admin.getPassword().equals(password)){
				return admin;
				
			}
		}
		return null;
	}

	
	
	public String createAdmin(Admin admin){
		adminCollection.add(admin);
		return "password";
	}
	
	public Admin updateAdmin(Admin admin){
		Admin findAdmin=findAdmin(admin.getUsername(), admin.getPassword());
		adminCollection.remove(findAdmin);
		adminCollection.add(admin);
		return admin;
	}

}
