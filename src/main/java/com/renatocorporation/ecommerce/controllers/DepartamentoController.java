
package com.renatocorporation.ecommerce.controllers;

import com.renatocorporation.ecommerce.model.Departamento;
import com.renatocorporation.ecommerce.service.IDepartamentoServices;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * API Rest
 */

@RestController
public class DepartamentoController {
    
    @Autowired
    private IDepartamentoServices service;
    
    @GetMapping("/departamentos")
    public ArrayList<Departamento> listaDepartamento(){
        return service.searchAll();
    }
    
    @PostMapping("/departamentos")
    public ResponseEntity<Departamento> createNew(@RequestBody Departamento novo){
        Departamento resultado = service.createNew(novo);
        if(resultado != null){
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.badRequest().build();
    }
    
    @DeleteMapping("/departamentos/{numero}")
    public ResponseEntity<Departamento> deleteById(@PathVariable Integer numero){
        service.deleteById(numero);
        return ResponseEntity.ok(null);
    }
    
    @GetMapping("/departamentos/{numero}")
    public ResponseEntity<Departamento> findById(@PathVariable Integer numero){
        Departamento resultado = service.findById(numero);
        if(resultado != null){
            ResponseEntity.ok(resultado);
        }
        return ResponseEntity.notFound().build();
    }
}

