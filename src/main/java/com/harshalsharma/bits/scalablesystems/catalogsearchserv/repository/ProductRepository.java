package com.harshalsharma.bits.scalablesystems.catalogsearchserv.repository;

import com.harshalsharma.bits.scalablesystems.catalogsearchserv.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductNameContainingIgnoreCase(String keyword);

}
