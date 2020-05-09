package com.emart.seller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.seller.dao.SellerDao;
import com.emart.seller.entity.Seller;
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
	public int findSeller(String userName, String password) {
		int num = 0;
		List<Seller> list = sellerDao.findByUserNameAndPassword(userName, password);
		if(list != null) {
			num = 1;
		}
		
		return num;
	}

	@Override
	public void saveSeller(Seller seller) {

		sellerDao.save(seller);
		
	}

}
