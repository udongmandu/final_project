package com.classpick.web.cart.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.classpick.web.cart.model.Cart;

@Repository
@Mapper
public interface ICartRepository {

	List<Cart> getCarts(Long memberUID);
	void addCart(Long memberUID, String lectureId);
	void deleteCart(Long memberUID, Long cartId);
	String getMemberIdbyCartId(Long cartId);
}
