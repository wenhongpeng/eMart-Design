/**
 * 
 */
package com.emart.seller.service;

import com.emart.seller.entity.Buyer;
import com.emart.seller.entity.Seller;

/**
 * @author HongPengWen
 *
 */
public interface SellerService {

	
	/**
	 * Seller Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	int findSeller(String userName, String password);
	
	
	/**
	 * Seller signup
	 * 
	 * @param seller
	 */
	void saveSeller(Seller seller);
	
	
	
}
