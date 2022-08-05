/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renatocorporation.ecommerce.controllers;

import com.renatocorporation.ecommerce.model.Produto;
import com.renatocorporation.ecommerce.service.IProdutoService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    
    @Autowired
    private IProdutoService service;
    
    //Mapeamento para retornar a lista de todos os produtos
    @GetMapping("/produtos")
    public ArrayList<Produto> findAll(){
        return service.findAll();
    }
    
    
    //Mapeamento de entidade para localizar por codigo/ID
    @GetMapping("/produtos{codigo}")
    public ResponseEntity<Produto> findById(@PathVariable Integer codigo){
        Produto resposta = service.findById(codigo);
        
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.status(404).build();
    }
    
    //Mapear entidade para Deletar um produto
    @PostMapping("/produtos")
    public ResponseEntity<Produto> createNewProduct(@RequestBody Produto novo){
        Produto resposta = service.createNew(novo);
        
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.badRequest().build();
    }
}
