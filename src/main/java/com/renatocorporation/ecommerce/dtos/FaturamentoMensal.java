/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.renatocorporation.ecommerce.dtos;

/**
 *
 * Um Objeto DTO é um objeto Oriundo de insformações de outros objetos
 */
public class FaturamentoMensal {
    
    private Integer ano;
    private Double preço;

    public FaturamentoMensal(Integer ano, Double preço) {
        this.ano = ano;
        this.preço = preço;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
    
    
}
