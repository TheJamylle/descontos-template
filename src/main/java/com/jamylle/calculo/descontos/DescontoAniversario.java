/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.calculo.descontos;


public class DescontoAniversario extends Desconto {
    private final double desconto = 0.15;
    
    @Override
    public void calcular(Venda venda) {
        super.porcentagem = desconto;
        venda.setDesconto(venda.getTotal() * this.desconto);
        System.out.println("O preço recalculado é de R$ "+venda.calcular());
    }
}
