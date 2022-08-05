/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.renatocorporation.ecommerce.service;

import com.renatocorporation.ecommerce.model.Produto;
import java.util.ArrayList;


public interface IProdutoService {
    
    public ArrayList<Produto> findAll();
    public Produto findById(Integer id);
    public Produto createNew(Produto novo);
}
