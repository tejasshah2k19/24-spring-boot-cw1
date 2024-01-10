package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.ProductBean;

@RestController
public class ProductController {

	// addProduct ->
	// form -> productName,price,qty,category
	// submit

	// db product insert add save
	@PostMapping("/product")
	public ProductBean addProduct(@RequestBody ProductBean productBean) {
		// dao insert
		System.out.println(productBean.getName());
		System.out.println(productBean.getCategoryName());
		return productBean;
	}

	// return all products
	@GetMapping("/product")
	public List<ProductBean> getAllProducts() {
		// dao -> getAllProducts -> return
		return null;
	}

	// single product -> get product by id
	@GetMapping("/product/{productId}") // /product/1
	public ProductBean getProduct(@PathVariable("productId") Integer productId) {
		// dao -> getProductById(productId) -> return
		return null;
	}

	@DeleteMapping("/product/{productId}")
	public String removeProduct(@PathVariable("productId") Integer productId) {
		return "Product Removed";
	}

	@PutMapping("/product")
	public ProductBean updateProduct(@RequestBody ProductBean productBean) {
		// dao update
		return productBean;
	}

}// http://localhost:9999/product
