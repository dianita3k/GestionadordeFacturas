package com.apps.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Producto;

public interface ProductRepository extends JpaRepository<Producto, Integer> {
}