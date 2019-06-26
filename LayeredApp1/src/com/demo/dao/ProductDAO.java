package com.demo.dao;

import java.util.List;

import com.demo.bo.ProductBO;

public interface ProductDAO {
	/* public void createProduct(ProductBO bo); */
	public int insertProduct(ProductBO bo);
	
	public List<ProductBO> retriveProduct(ProductBO bo);
}
