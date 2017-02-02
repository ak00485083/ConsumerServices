package com.consumerapp.controller;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consumerapp.model.Admin;
import com.consumerapp.services.AdminService;
import com.consumerapp.services.impl.AdminServiceImpl;

@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminService;
	
	@RequestMapping(value="/admin/detail/{identifier}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Admin getAdminDetails(@PathVariable("identifier")int identifier){
		
		Admin adminDetails = adminService.getAdminDetails(String.valueOf(identifier));
		return adminDetails;
	}
	
	@RequestMapping(value="/admin/update/{identifier}",method=RequestMethod.PUT)
	public Admin updateAdminInfo(@RequestBody Admin admin){
		
		return adminService.updateAdminDetails(admin);
	}
	
	

}
