package com.consumerapp.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
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

	
	
	public String createAdmin(Admin admin) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		adminCollection.add(admin);
		String password="password";
		return mapper.writeValueAsString(password);
	}
	
	public Admin updateAdmin(Admin admin){
		Admin findAdmin=findAdmin(admin.getUsername(), admin.getPassword());
		adminCollection.remove(findAdmin);
		adminCollection.add(admin);
		return admin;
	}



	public List<Admin> search() {
		List<Admin> adminSearchResult=new ArrayList<>();
//		if(identifier==null){
			return adminCollection;
//		}else{
//			for (Admin admin : adminCollection) {
//				if(admin.getUsername().equals(identifier)){
//					adminSearchResult.add(admin);
//					
//				}else if(admin.getFirstName().equals(identifier)){
//					adminSearchResult.add(admin);
//					
//				}else if(admin.getLastName().equals(identifier)){
//					adminSearchResult.add(admin);
//					
//				}
//				else if(admin.getContact().equals(identifier)){
//					adminSearchResult.add(admin);
//					
//				}
//			}
//			return adminSearchResult;
//		}
	}

}
