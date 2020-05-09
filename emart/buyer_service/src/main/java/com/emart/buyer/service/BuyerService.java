/**
 * 
 */
package com.emart.buyer.service;

import com.emart.buyer.entity.Buyer;
import com.emart.buyer.entity.Seller;

/**
 * @author HongPengWen
 *
 */
public interface BuyerService {

	/**
	 * Buyer Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	int findBuyer(String userName, String password);
	
	/**
	 * Buyer signup
	 * 
	 * @param buyer
	 */
	void saveBuyer(Buyer buyer);
	
}
