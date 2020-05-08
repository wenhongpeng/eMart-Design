/**
 * 
 */
package com.emart.user.service;

import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;

/**
 * @author HongPengWen
 *
 */
public interface UserService {

	/**
	 * Buyer Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	int findBuyer(String userName, String password);
	
	/**
	 * Seller Login
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	int findSeller(String userName, String password);
	
	/**
	 * Buyer signup
	 * 
	 * @param buyer
	 */
	void saveBuyer(Buyer buyer);
	
	/**
	 * Seller signup
	 * 
	 * @param seller
	 */
	void saveSeller(Seller seller);
	
	
	
}
