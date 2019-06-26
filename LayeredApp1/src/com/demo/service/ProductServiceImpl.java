package com.demo.service;


import com.demo.bo.ProductBO;
import com.demo.dao.ProductDAO;
import com.demo.dao.ProductDAOImpl;
import com.demo.dto.ProductDTO;

public class ProductServiceImpl implements ProductService {

	@Override
	public String saveProduct(ProductDTO dto) {
		ProductDAO dao = null;
		ProductBO bo = null;
		String mfd = null;
		int count = 0;
		bo = new ProductBO();
		dao = new ProductDAOImpl();

		/*
		 * // convert util date to sql mfd = mfd.valueOf(dto.getMfgDate());
		 */	// convert dto to bo
		bo.setpId(dto.getpId());
		bo.setpName(dto.getpName());
		bo.setpCost(dto.getpCost());
		bo.setMfgDate(dto.getMfgDate());
		// use dao
		count = dao.insertProduct(bo);
		if (count != 0)
			return "Record inserted successfully";
		else
			return "Record insertion failed";
	}

}
