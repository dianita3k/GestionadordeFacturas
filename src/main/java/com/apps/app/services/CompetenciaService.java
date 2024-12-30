package com.apps.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.app.clases.Competencia;
import com.apps.app.repository.CompetenciaRepository;

import java.util.List;

@Service
public class CompetenciaService {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    public List<Competencia> findAll() {
        return competenciaRepository.findAll();
    }

    public Competencia findById(int id) {
        return competenciaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Competencia no encontrada con ID: " + id));
    }

    public Competencia save(Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    public void deleteById(int id) {
        if (!competenciaRepository.existsById(id)) {
            throw new RuntimeException("Competencia no encontrada con ID: " + id);
        }
        competenciaRepository.deleteById(id);
    }
}
