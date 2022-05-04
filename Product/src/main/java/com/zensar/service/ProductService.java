package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Product;
import com.zensar.db.ProductDAO;

@Service
public class ProductService {
	@Autowired
	ProductDAO dao;

	public Product addProduct(Product pro) {
		return dao.save(pro);
	}

	public List<Product> getProducts() {
		return this.dao.findAll();
	}

	public Product updateProduct(Product pro) {
		return this.dao.save(pro);

	}

	public boolean deleteProduct(int id) {
		this.dao.deleteById(id);
		return true;
	}

}
