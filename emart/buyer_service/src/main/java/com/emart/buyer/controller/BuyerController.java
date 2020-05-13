package com.emart.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emart.buyer.dto.ResponseDTO;
import com.emart.buyer.entity.Items;
import com.emart.buyer.entity.PurchaseHistory;
import com.emart.buyer.exception.DataNotFoundException;
import com.emart.buyer.service.BuyerService;

@RestController
@RequestMapping("/api/buyer")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;

	@PostMapping("searchItems")
	public ResponseDTO searchItems(@RequestParam String itemName) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			List<Items> itemList = buyerService.searchItems(itemName);

			response.setItemList(itemList);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Search Items Success!!!");
		} catch (DataNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Search Items Fail!!!");
		}

		return response;
	}
	
	@PostMapping("filterItems")
	public ResponseDTO filterItems(@RequestParam String itemName, @RequestParam double fromPrice, @RequestParam double toPrice) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			List<Items> itemList = buyerService.filterItems(itemName, fromPrice, toPrice);

			response.setItemList(itemList);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Filter Items Success!!!");
		} catch (DataNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Filter Items Fail!!!");
		}

		return response;
	}
	
	@PostMapping("searchpurchaseHistory")
	public ResponseDTO searchpurchaseHistory(@RequestParam String buyerName) {
		
		ResponseDTO response = new ResponseDTO();
		try {
			List<PurchaseHistory> purchaseHistoryList = buyerService.searchPurchaseHistory(buyerName);

			response.setPurchaseHistoryList(purchaseHistoryList);
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_SUCCESS);
			response.setResponseMessage("Search Purchase History Success!!!");
		} catch (DataNotFoundException e) {
			response.setResponseCode(ResponseDTO.REST_API_RESPONSE_CODE_ERROR);
			response.setResponseMessage("Search Purchase History Fail!!!");
		}

		return response;
	}

}
