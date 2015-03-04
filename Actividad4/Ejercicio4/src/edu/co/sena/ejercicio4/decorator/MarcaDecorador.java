/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.decorator;

/**
 *
 * @author Oscar
 */
public class MarcaDecorador extends Decorador {

    public MarcaDecorador() {
    }

    public MarcaDecorador(ComponenteGraficoVehiculo componente) {

        super(componente);

    }

    public void visualizaLogo() {

        System.out.println("Logotipo de la marca");

    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaLogo();
    }

}
