/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.calculo.descontos;


public class DescontoProgressivo extends Desconto {
    @Override
    public void calcular(Venda venda) {
        double desconto = venda.getTotal()/25;
        if (desconto > (venda.getTotal()/5)) {
            venda.setDesconto(venda.getTotal()/5);
        } else {
            venda.setDesconto(desconto);
        }
        System.out.println("O preço recalculado é de R$ "+venda.calcular());
    }
}
