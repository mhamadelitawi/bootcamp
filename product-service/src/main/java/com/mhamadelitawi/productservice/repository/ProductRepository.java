package com.mhamadelitawi.productservice.repository;

import com.mhamadelitawi.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}