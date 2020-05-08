package com.emart.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.user.dao.BuyerDao;
import com.emart.user.dao.SellerDao;
import com.emart.user.entity.Buyer;
import com.emart.user.entity.Seller;
import com.emart.user.service.UserService;

/**
 * @author HongPengWen
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private BuyerDao buyerDao;
	
	@Autowired
	private SellerDao sellerDao;

	@Override
	public int findBuyer(String userName, String password) {
		int num = 0;
		List<Buyer> list = buyerDao.findByUserNameAndPassword(userName, password);
		if(list != null) {
			num = 1;
		}
		
		return num;
	}

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
	public void saveBuyer(Buyer buyer) {

		buyerDao.save(buyer);
		
	}

	@Override
	public void saveSeller(Seller seller) {

		sellerDao.save(seller);
		
	}

}
