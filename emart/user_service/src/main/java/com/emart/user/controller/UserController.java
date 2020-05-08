package com.emart.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;
import com.emart.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	
	@PostMapping("buyerSignUp")
	public String buyerSignUp(@RequestBody Buyer buyer) {
		
		userService.saveBuyer(buyer);
		
		return "SignUp Sucess";
	}
	
	@PostMapping("sellerSignUp")
	public String sellerSignUp(@RequestBody Seller seller) {
		
		userService.saveSeller(seller);
		
		return "SignUp Sucess";
	}
	
}
