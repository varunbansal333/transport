package com.transport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.helper.HTTPClientHelper;

@Service
public class SendOTPService {

	@Autowired
	HTTPClientHelper helper;
	
	public String sendOTP(String mobile){
		String apiKey = "07031720-1456-11e7-9462-00163ef91450";
		String otp = generateRandomOTP();
		String url = "http://2factor.in/API/V1/" + apiKey + "/SMS/" + mobile + "/" + otp;
		helper.connectURL(url);
		return "success";
	}
	
	private String generateRandomOTP(){
		return String.valueOf(Math.abs(Math.random() * 10000));
	}
}
