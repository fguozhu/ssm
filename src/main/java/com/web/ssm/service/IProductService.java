package com.web.ssm.service;

import java.util.List;
import java.util.Map;

import com.web.ssm.pojo.Product;

public interface IProductService {
	
	public List<Product> findProductBySellerId(Long sellerId);
	
	public Product selectWithSellerById(Long id);
	
	public Map<String, Object> selectMapById(Long id);
	
	public List<Map<String, Object>> findMapBySellerId(Long sellerId);
	
	public void insertProduct(Product bean);
}
