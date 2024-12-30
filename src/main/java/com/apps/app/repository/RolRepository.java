package com.apps.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {}