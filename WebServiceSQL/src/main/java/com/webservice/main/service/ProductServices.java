package com.webservice.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.main.entity.Product;
import com.webservice.main.repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productrepo;

	public Product saveProduct(Product product) {
		return productrepo.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productrepo.saveAll(products);
	}

	public List<Product> getProducts() {
		return productrepo.findAll();
	}

	public Product getProductById(int id) {
		return productrepo.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {
		return productrepo.findByName(name);
	}

	public String deleteProduct(int id) {
		productrepo.deleteById(id);
		return "Product Deleted " + id;
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productrepo.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productrepo.save(existingProduct);
	}
}
