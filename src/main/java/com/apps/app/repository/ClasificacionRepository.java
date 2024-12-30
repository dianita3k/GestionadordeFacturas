package com.apps.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Clasificacion;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {}