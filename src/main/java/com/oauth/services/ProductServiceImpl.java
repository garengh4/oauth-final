package com.oauth.services;

import com.oauth.models.ProductEntity;
import com.oauth.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity productData) {
        return productRepository.save(productData);
    }

    @Override
    public void deleteById(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Optional<ProductEntity> findById(Long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }
}
