package com.sas.inventory.controller;

import com.sas.inventory.entity.Supplier;
import com.sas.inventory.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private ISupplierService supplierService;

    @GetMapping("/getAll")
    ResponseEntity<?> getAllSuppliers(){
        throw new UnsupportedOperationException("TODO");
    }

    @GetMapping("/get/{name}")
    ResponseEntity<?> getSupplierByName(@PathVariable String name){
        throw new UnsupportedOperationException("TODO");
    }

    @PostMapping("/save")
    ResponseEntity<?> createSupplier(@RequestBody Supplier supplier){
        throw new UnsupportedOperationException("TODO");
    }

    @PutMapping("/edit")
    ResponseEntity<?> editSupplier(@RequestBody Supplier supplier){
        throw new UnsupportedOperationException("TODO");
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteSupplier(@PathVariable Long id){
        throw new UnsupportedOperationException("TODO");
    }
}
