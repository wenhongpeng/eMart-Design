package com.emart.buyer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emart.buyer.dao.BuyerDao;
import com.emart.buyer.entity.Buyer;
import com.emart.buyer.service.BuyerService;

/**
 * @author HongPengWen
 *
 */
@Service
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	private BuyerDao buyerDao;
	
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
	public void saveBuyer(Buyer buyer) {

		buyerDao.save(buyer);
		
	}

}
