package com.consumerapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"com.consumerapp","com.consumerapp.dao","com.consumerapp.controller","com.consumerapp.services","com.consumerapp.services.impl"})
public class ConsumerAppConfiguration extends WebMvcConfigurerAdapter {
	  @Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }
	  
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		    registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
		    registry.addResourceHandler("/html/**").addResourceLocations("/WEB-INF/html/");
		   
		}
}
