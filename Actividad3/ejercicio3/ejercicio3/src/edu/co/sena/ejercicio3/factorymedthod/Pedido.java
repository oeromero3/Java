/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.factorymedthod;

/**
 *
 * @author colsutec21
 */
public abstract class Pedido {

    protected double importe;

    public  Pedido(double importe)

    {
        this.importe = importe;

    }

    public abstract boolean valida();

    public abstract void paga();

}
