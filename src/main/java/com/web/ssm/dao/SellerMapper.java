package com.web.ssm.dao;

import com.web.ssm.pojo.Seller;

public interface SellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    int insert(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    int insertSelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    Seller selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    int updateByPrimaryKeySelective(Seller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seller
     *
     * @mbg.generated Fri Sep 30 10:23:18 CST 2016
     */
    int updateByPrimaryKey(Seller record);
    
    Seller selectWithProductsById(Long id);
    
    int updateProductCount(Long id);
}