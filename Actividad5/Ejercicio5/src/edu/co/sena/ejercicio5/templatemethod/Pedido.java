/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.templatemethod;

/**
 *
 * @author Tatiana
 */
public abstract class Pedido {

    protected double importeSinIva;
    protected double importeIva;
    protected double importeConIva;

    protected abstract void calculaIva();

    public void calculaPrecioConIva() {
        this.calculaIva();
        importeConIva = importeSinIva + importeIva;

    }

    public void setImporteSinIva(double importeSinIva) {

        this.importeSinIva = importeSinIva;

    }

    public void visualiza() {
        System.out.println("Pedido");
        System.out.println("Importe sin IVA " + importeSinIva);
        System.out.println("Importe con IVA " + importeConIva);
    }

}
