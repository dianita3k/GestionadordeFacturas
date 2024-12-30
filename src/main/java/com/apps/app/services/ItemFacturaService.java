package com.apps.app.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.app.clases.ItemFactura;
import com.apps.app.repository.ItemFacturaRepository;

import java.util.List;

@Service
public class ItemFacturaService {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    public List<ItemFactura> findAll() {
        return itemFacturaRepository.findAll();
    }

    public ItemFactura findById(int id) {
        return itemFacturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ItemFactura no encontrada con ID: " + id));
    }

    public ItemFactura save(ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    public void deleteById(int id) {
        if (!itemFacturaRepository.existsById(id)) {
            throw new RuntimeException("ItemFactura no encontrada con ID: " + id);
        }
        itemFacturaRepository.deleteById(id);
    }
}