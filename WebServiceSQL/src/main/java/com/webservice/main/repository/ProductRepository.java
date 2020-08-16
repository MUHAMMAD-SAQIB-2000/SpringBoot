package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.main.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
