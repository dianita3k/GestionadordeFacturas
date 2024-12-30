package com.apps.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.app.clases.Proveedores;
import com.apps.app.repository.ProveedoresRepository;

import java.util.List;

@Service
public class ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    public List<Proveedores> findAll() {
        return proveedoresRepository.findAll();
    }

    public Proveedores findById(int id) {
        return proveedoresRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con ID: " + id));
    }

    public Proveedores save(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    public void deleteById(int id) {
        if (!proveedoresRepository.existsById(id)) {
            throw new RuntimeException("Proveedor no encontrado con ID: " + id);
        }
        proveedoresRepository.deleteById(id);
    }
}
