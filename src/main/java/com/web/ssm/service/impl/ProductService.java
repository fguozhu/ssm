package com.web.ssm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.web.ssm.dao.ProductMapper;
import com.web.ssm.dao.SellerMapper;
import com.web.ssm.pojo.Product;
import com.web.ssm.service.IProductService;

@Service
public class ProductService implements IProductService {

	@Resource
	private ProductMapper productMapper;
	
	@Resource
	private SellerMapper sellerMapper;
	
	@Resource
	private TransactionTemplate transactionTemplate;
	
	@Override
	public List<Product> findProductBySellerId(Long sellerId) {
		return productMapper.findProductBySellerId(sellerId);
	}

	@Override
	public Product selectWithSellerById(Long id) {
		return productMapper.selectWithSellerById(id);
	}

	@Override
	public Map<String, Object> selectMapById(Long id) {
		return productMapper.selectMapById(id);
	}

	@Override
	public List<Map<String, Object>> findMapBySellerId(Long sellerId) {
		return productMapper.findMapBySellerId(sellerId);
	}

//	@Override
//	@Transactional
//	public void insertProduct(Product bean) {
//		productMapper.insertSelective(bean);
//		int a = 1/0;
//		sellerMapper.updateProductCount(bean.getSellerId());
//	}
	
	@Override
	public void insertProduct(Product bean) {
		transactionTemplate.execute(new TransactionCallback<Integer>() {

			@Override
			public Integer doInTransaction(TransactionStatus status) {
				
				int i = productMapper.insertSelective(bean);
				
//				int a = 1/0;
				
				int u = sellerMapper.updateProductCount(bean.getSellerId());
				
				if(i == 1 && u == 1){
					return 1;
				}
				
				return 0;
			}
		});

	}
	
}