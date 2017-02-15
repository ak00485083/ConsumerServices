package com.consumerapp.controller;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
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
	

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String redirectLogin(ModelMap model) {
		logger.info("login page");
		return "login";
	}
	
	
	public Admin verifyLogin(String userName,String password){
		
	logger.info("verify login");
	if(userName==null || password==null){
		return null;
	}else{
		return adminDao.findAdmin(userName, password);
	}
	}
	
	
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String goHome(@RequestParam(value="username",required=false) String userName, @RequestParam(value="password",required=false) String password, ModelMap model){
		admin=verifyLogin(userName,password);
		ObjectMapper mapper = new ObjectMapper();
		String adminJsonFormat = null;
		try {
			adminJsonFormat=mapper.writeValueAsString(admin);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(admin!=null){
			model.addAttribute("admin",adminJsonFormat);
			model.addAttribute("greeting", "hello there");
			return "home";
		}
		else
			return "redirect:login";
		}
	}

