package com.web.ssm.pojo;

import java.util.List;

public class Seller {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_seller.id
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_seller.name
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_seller.id
     *
     * @return the value of tbl_seller.id
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_seller.id
     *
     * @param id the value for tbl_seller.id
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_seller.name
     *
     * @return the value of tbl_seller.name
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_seller.name
     *
     * @param name the value for tbl_seller.name
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	private List<Product> products;
}