/**
 * 
 */
package com.emart.seller.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emart.seller.entity.Items;
import com.emart.seller.entity.Seller;

/**
 * @author HongPengWen
 *
 */
public interface SellerDao extends JpaRepository<Items, Integer>, JpaSpecificationExecutor<Items> {

//	@Query(nativeQuery = true, value = "SELECT * FROM seller WHERE user_name = :userName AND password = :pwd ")
//	List<Seller> findByUserNameAndPassword(@Param("userName") String userName, @Param("pwd")  String password);
}
