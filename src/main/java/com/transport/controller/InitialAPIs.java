package com.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.transport.service.SendOTPService;

@Controller
public class InitialAPIs {
	
	@Autowired
	SendOTPService sendOTPService;
	
	@RequestMapping(value = "/")
    public String index() {
		return "index";
    }
	
	@RequestMapping(value = "/sendOTP", method=RequestMethod.POST)
    public String sendOTP(String mobile) {
		return sendOTPService.sendOTP(mobile);
    }
}
