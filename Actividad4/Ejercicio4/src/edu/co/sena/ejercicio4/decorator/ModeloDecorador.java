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
public class ModeloDecorador extends Decorador {

  public ModeloDecorador(){}
    public ModeloDecorador(ComponenteGraficoVehiculo componente) {

        super(componente);
    }

    protected void visualizaInformacionTecnica() {

        System.out.println("Informacion tecnica del modelo");

    }

    @Override
    public void visualiza() {
        super.visualiza();
        this.visualizaInformacionTecnica();
    }

}
