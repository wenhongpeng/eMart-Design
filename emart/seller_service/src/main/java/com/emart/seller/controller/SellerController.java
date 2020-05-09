package com.emart.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.seller.entity.Buyer;
import com.emart.seller.entity.Seller;
import com.emart.seller.service.SellerService;

@RestController
@RequestMapping("/api/user")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;

	
	
	@PostMapping("buyerSignUp")
	public String buyerSignUp(@RequestBody Buyer buyer) {
		
		sellerService.saveBuyer(buyer);
		
		return "SignUp Sucess";
	}
	
	@PostMapping("sellerSignUp")
	public String sellerSignUp(@RequestBody Seller seller) {
		
		sellerService.saveSeller(seller);
		
		return "SignUp Sucess";
	}
	
}
