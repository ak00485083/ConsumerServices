package com.consumerapp.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consumerapp.model.Admin;
import com.consumerapp.services.impl.AdminServiceImpl;

@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	AdminServiceImpl adminService;
	

	
	/**
	 * update admin informations
	 * @param admin
	 * @return
	 */
	@RequestMapping(value="/admins/{identifier}",method=RequestMethod.PUT , produces=MediaType.APPLICATION_JSON_VALUE)
	public Admin updateAdminInfo(@RequestBody Admin admin){
		
		return adminService.updateAdminDetails(admin);
	}
	
	/**
	 * create new admin
	 * @param admin
	 * @return
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	@RequestMapping(value="/admins/",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE )
	public String createAdmin( @RequestBody Admin admin) throws JsonGenerationException, JsonMappingException, IOException{
		
		return adminService.createAdmin(admin);
	}
	
	
//	@RequestMapping(value="/admins/",method=RequestMethod.GET)
//	public Admin getAdmins( @RequestBody Admin admin){
//		
//		return adminService.updateAdminDetails(admin);
//	}
	
	
	/**
	 * deletes an admin
	 * @param identifier
	 * @return
	 */
	@RequestMapping(value="/admins/{identifier}",method=RequestMethod.DELETE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String deleteAdmin( @PathVariable("identifier") String identifier){
		
		return adminService.deleteAdminDetails(identifier);
	}
	
	/**
	 * search an admin
	 * @param identifier
	 * @return
	 */
	@RequestMapping(value="/admins/",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE )
	public List<Admin> findAdmin(@RequestBody Admin admin){
		
		return adminService.search(admin.getUsername());
	}
	

}
