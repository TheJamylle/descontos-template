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
public class Venda {
    private double total;
    private double totalreal;
    private double desconto = 0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalreal() {
        return totalreal;
    }

    public void setTotalreal(double totalreal) {
        this.totalreal = totalreal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double calcular() {
        this.totalreal = this.total - this.desconto;
        return this.totalreal;
    }
}
