package com.apps.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {}
