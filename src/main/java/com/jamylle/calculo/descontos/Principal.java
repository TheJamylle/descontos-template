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
public class Principal {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.setTotal(68);
        
        DescontoProgressivo pro = new DescontoProgressivo();
        
        DescontoDefinido dd = new DescontoDefinido();
        dd.setPorcentagem(0.1);
        
        DescontoAniversario niver = new DescontoAniversario();
        
        pro.calcular(venda);
        dd.calcular(venda);
        niver.calcular(venda);
        
    }
}
