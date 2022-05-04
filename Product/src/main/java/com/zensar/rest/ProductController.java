package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Product;
import com.zensar.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;

	@PostMapping(value = "/add")
	public Product f1(@RequestBody Product pro) {
		return service.addProduct(pro);
	}

	@GetMapping("/getAll")
	public List<Product> f2() {
		return service.getProducts();
	}

	@PutMapping(value = "/update")
	public Product f3(@RequestBody Product pro) {
		return this.service.updateProduct(pro);

	}

	@DeleteMapping("/delete/{eid}")
	public boolean f4(@PathVariable(name = "eid") int id) {
		return this.service.deleteProduct(id);
	}

}
