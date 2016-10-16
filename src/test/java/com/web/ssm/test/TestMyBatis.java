package com.web.ssm.test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.web.ssm.pojo.Product;
import com.web.ssm.pojo.Seller;
import com.web.ssm.pojo.User;
import com.web.ssm.service.IProductService;
import com.web.ssm.service.ISellerService;
import com.web.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private IUserService userService;
	
	@Resource
	private IProductService productService;
	
	@Resource
	private ISellerService sellerService;
	
	@Test
	public void testGetSimpleObject(){
		User user = userService.getUserById(1L);
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void testGetSimpleList(){
		List<Product> products = productService.findProductBySellerId(1L);
		logger.info(JSONArray.toJSONString(products));
	}
	
	@Test
	public void testGetNestedObject(){
		Product product = productService.selectWithSellerById(1L);
		logger.info(JSON.toJSONString(product));
		
		Seller seller = sellerService.selectWithProductsById(1L);
		logger.info(JSON.toJSONString(seller));
	}
	
	@Test
	public void testGetMap(){
		Map<String, Object> map = productService.selectMapById(1L);
		logger.info(JSON.toJSONString(map));
	}
	
	@Test
	public void testGetMapList(){		
		List<Map<String, Object>> list = productService.findMapBySellerId(1L);
		
		for (Map<String, Object> map : list) {
			logger.info(JSON.toJSONString(map));
		}
		
//		PageHelper.startPage(1, 10);
//		
//		List<Product> products = productService.findProductBySellerId(1L);
//		
//		PageInfo<Product> pageInfo = new PageInfo<Product>(products);
//		
//		logger.info(JSONArray.toJSONString(pageInfo));
	}
	
	@Test
	public void testTransaction(){
		Product bean = new Product();
		bean.setTitle("华为笔记本");
		bean.setPrice(new BigDecimal(2000));
		bean.setSellerId(1L);
		
		productService.insertProduct(bean);
	}
}