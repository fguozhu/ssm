package com.web.ssm.pojo;

import java.math.BigDecimal;

public class Product {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_product.id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_product.title
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_product.price
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	private BigDecimal price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_product.seller_id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	private Long sellerId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_product.id
	 * @return  the value of tbl_product.id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_product.id
	 * @param id  the value for tbl_product.id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_product.title
	 * @return  the value of tbl_product.title
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_product.title
	 * @param title  the value for tbl_product.title
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_product.price
	 * @return  the value of tbl_product.price
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_product.price
	 * @param price  the value for tbl_product.price
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_product.seller_id
	 * @return  the value of tbl_product.seller_id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public Long getSellerId() {
		return sellerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_product.seller_id
	 * @param sellerId  the value for tbl_product.seller_id
	 * @mbg.generated  Thu Sep 29 23:21:21 CST 2016
	 */
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	
	private Seller seller;

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}