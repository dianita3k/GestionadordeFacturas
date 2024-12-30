package com.apps.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.TipoPago;

public interface TipoPagoRepository extends JpaRepository<TipoPago, Integer> {}