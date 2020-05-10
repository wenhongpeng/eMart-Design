package com.emart.seller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.seller.dao.SellerDao;
import com.emart.seller.entity.Items;
import com.emart.seller.service.SellerService;

/**
 * @author HongPengWen
 *
 */
@Service
public class SellerServiceImpl implements SellerService {
	
	@Autowired
	private SellerDao sellerDao;

	@Override
	public void saveItems(Items items) {

		sellerDao.save(items);
		
	}
	
	@Override
	public void deleteItems(Items items) {
		
		sellerDao.delete(items);
		
	}

	@Override
	public void deleteItems(int itemId) {

		sellerDao.deleteById(itemId);
		
	}

}
