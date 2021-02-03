/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.calculo.descontos;


public class DescontoDefinido extends Desconto {
    @Override
    public void calcular(Venda venda) {
        venda.setDesconto(venda.getTotal() * super.porcentagem);
        System.out.println("O preço recalculado é de R$ "+venda.calcular());
    }
}
