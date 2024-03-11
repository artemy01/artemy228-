package com.example.artemy.repositories;

import com.example.artemy.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepositories extends JpaRepository <Product, Long> {
    List<Product> findByTitle(String title);
}
