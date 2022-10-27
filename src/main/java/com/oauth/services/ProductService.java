package com.oauth.services;

import com.oauth.models.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    ProductEntity save(ProductEntity productData);
    void deleteById(Long productId);
    Optional<ProductEntity> findById(Long productId);
    List<ProductEntity> findAll();
}
