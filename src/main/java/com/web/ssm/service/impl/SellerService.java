package com.web.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.ssm.dao.SellerMapper;
import com.web.ssm.pojo.Seller;
import com.web.ssm.service.ISellerService;

@Service
public class SellerService implements ISellerService {

	@Resource
	private SellerMapper sellerMapper;
	
	@Override
	public Seller selectWithProductsById(Long id) {
		return sellerMapper.selectWithProductsById(id);
	}

}
