package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate stmt;

	public void addProduct(ProductBean product) {
		// insert query

	}
}
