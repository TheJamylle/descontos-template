/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.calculo.descontos;

/**
 *
 * @author Jamylle
 */
public abstract class Desconto {
    public double porcentagem;
    
    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    public void calcular(Venda venda) {
        venda.setDesconto(venda.getTotal() * this.porcentagem);
        System.out.println("O preço recalculado é de R$ "+venda.calcular());
    }
}
