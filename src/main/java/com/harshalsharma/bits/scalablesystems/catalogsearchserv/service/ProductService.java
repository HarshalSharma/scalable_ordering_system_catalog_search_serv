package com.harshalsharma.bits.scalablesystems.catalogsearchserv.service;

import com.harshalsharma.bits.scalablesystems.catalogsearchserv.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> getProductById(Long productId);

    List<Product> searchProducts(String keyword);

}
