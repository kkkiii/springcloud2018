package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class ConfigClientController {
	 @Value("${spring.application.name}")
	 private String application_name;
	 
	 
	 @Value("${eureka.client.service-url.defaultZone}")
	 private String eureka;
	 
	 
	 @Value("${server.port}")
	 private String port;
	
	
	    @GetMapping("/config")
	    public String getConfigInfo() {
	    String str = "${spring.application.name}" +  application_name
	    		+ "${eureka.client.service-url.defaultZone}" + eureka
	    		+ "${server.port}"+ port
	    	;
	    	
	        return str;
	    }

}
