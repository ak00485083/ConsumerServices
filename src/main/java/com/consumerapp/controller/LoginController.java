package com.consumerapp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.consumerapp.dao.AdminDao;
import com.consumerapp.model.Admin;

@Controller
@RequestMapping("/")
public class LoginController {
	
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	AdminDao adminDao;
	
	private Admin admin;
	
	@RequestMapping(value="/" ,method = RequestMethod.GET)
	public String login(ModelMap model) {
		logger.info("login page");
		return "login";
	}
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String verifyLogin(@RequestParam(value="username",required=false) String userName,@RequestParam(value="password",required=false) String password){
		
	logger.info("verify login");
	if(userName==null || password==null){
		return "login";
	}else{
		admin = adminDao.findAdmin(userName, password);
	}
		
	if(admin!=null)
		return "home";
	else
		return "login";
	}
	

}
