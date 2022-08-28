package com.ansn.demo.productservice.repository;


import com.ansn.demo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
