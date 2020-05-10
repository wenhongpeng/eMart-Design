/**
 * 
 */
package com.emart.seller.service;

import com.emart.seller.entity.Items;

/**
 * @author HongPengWen
 *
 */
public interface SellerService {
	
	void saveItems(Items items);
	
	void deleteItems(Items items);
	
	void deleteItems(int itemId);
	
}
