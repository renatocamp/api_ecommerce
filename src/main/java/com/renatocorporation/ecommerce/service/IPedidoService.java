/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.renatocorporation.ecommerce.service;

import com.renatocorporation.ecommerce.model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author RenatoCampos
 */
public interface IPedidoService {
    
    /*
        Inserir os métodos com os quais trabalhar nas classes controllers
    */
    public ArrayList<Pedido>recuperarPedidos();
}
