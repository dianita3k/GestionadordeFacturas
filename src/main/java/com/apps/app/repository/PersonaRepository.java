package com.apps.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.app.clases.Persona;

public interface PersonaRepository extends JpaRepository<com.apps.app.clases.Persona, Integer> {}
