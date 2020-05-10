package com.emart.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.seller.entity.Items;
import com.emart.seller.service.SellerService;

@RestController
@RequestMapping("/api/user")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("addItems")
	public String addItems(@RequestBody Items items) {
		
		sellerService.saveItems(items);
		
		return "SignUp Sucess";
	}
	
}
