package com.webservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.main.entity.Product;
import com.webservice.main.service.ProductServices;

@RestController
public class ProductController {

	@Autowired
	private ProductServices service;

	@PostMapping("/addOneProduct")
	public Product addOneProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/addMultiProduct")
	public List<Product> addMultiProduct(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/DisplayAllProducts")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/DisplayProductById/{id}")
	public Product findOneProduct(@PathVariable int id) {
		return service.getProductById(id);
	}

	@GetMapping("/DisplayProductByName/{name}")
	public Product findOneProduct(@PathVariable String name) {
		return service.getProductByName(name);
	}

	@PutMapping("/updateProdcut")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}

}
