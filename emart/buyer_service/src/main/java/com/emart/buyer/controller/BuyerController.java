package com.emart.buyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.buyer.entity.Buyer;
import com.emart.buyer.service.BuyerService;

@RestController
@RequestMapping("/api/buyer")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;

	
	
	@PostMapping("buyerSignUp")
	public String buyerSignUp(@RequestBody Buyer buyer) {
		
		buyerService.saveBuyer(buyer);
		
		return "SignUp Sucess";
	}

}
