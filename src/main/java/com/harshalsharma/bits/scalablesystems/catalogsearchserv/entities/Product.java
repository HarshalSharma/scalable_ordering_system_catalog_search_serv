package com.harshalsharma.bits.scalablesystems.catalogsearchserv.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ProductCatalog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private Long id;

    @Column(name = "ProductName", nullable = false)
    private String productName;

    @Column(name = "Category")
    private String category;

    @Column(name = "Price", nullable = false)
    private double price;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Availability", nullable = false)
    private boolean availability;

    @Column(name = "CreatedAt", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

}
