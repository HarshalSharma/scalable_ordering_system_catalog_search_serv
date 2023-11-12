package com.harshalsharma.bits.scalablesystems.catalogsearchserv.service;

import com.harshalsharma.bits.scalablesystems.catalogsearchserv.entities.Product;
import com.harshalsharma.bits.scalablesystems.catalogsearchserv.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Optional<Product> getProductById(Long productId) {
        return repository.findById(productId);
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return repository.findByProductNameContainingIgnoreCase(keyword);
    }
}
