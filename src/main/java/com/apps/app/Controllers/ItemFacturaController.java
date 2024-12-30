package com.apps.app.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.apps.app.clases.ItemFactura;
import com.apps.app.repository.ItemFacturaRepository;
import com.apps.app.services.ItemFacturaService;

import java.util.List;

@RestController
@RequestMapping("/items-factura")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaService itemFacturaService;

    @GetMapping
    public List<ItemFactura> getAll() {
        return itemFacturaService.findAll();
    }

    @GetMapping("/{id}")
    public ItemFactura getById(@PathVariable int id) {
        return itemFacturaService.findById(id);
    }

    @PostMapping
    public ItemFactura create(@RequestBody ItemFactura itemFactura) {
        return itemFacturaService.save(itemFactura);
    }

    @PutMapping("/{id}")
    public ItemFactura update(@PathVariable int id, @RequestBody ItemFactura itemFactura) {
        itemFactura.setId_item_factura(id);
        return itemFacturaService.save(itemFactura);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        itemFacturaService.deleteById(id);
    }
}