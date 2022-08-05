/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.renatocorporation.ecommerce.service;

import com.renatocorporation.ecommerce.model.Departamento;
import java.util.ArrayList;


public interface IDepartamentoServices {
    
    public Departamento createNew(Departamento departamento);
    public Departamento updateDepto(Departamento departamento);
    public ArrayList<Departamento> searchAll();
    public Departamento findById(Integer id);
    public void deleteById(Integer id);
    
}
