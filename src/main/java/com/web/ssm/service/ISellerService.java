package com.web.ssm.service;

import com.web.ssm.pojo.Seller;

public interface ISellerService {
	
	public Seller selectWithProductsById(Long id);
}
