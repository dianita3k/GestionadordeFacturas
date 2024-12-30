package com.apps.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Producto;
import com.apps.app.clases.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {}
