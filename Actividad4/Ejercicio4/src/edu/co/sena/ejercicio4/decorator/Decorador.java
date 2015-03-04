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
public class Decorador implements ComponenteGraficoVehiculo{

    public Decorador() {
    }
    
    protected ComponenteGraficoVehiculo componente;
    
    public Decorador(ComponenteGraficoVehiculo componente) {
        
        this.componente = componente;
    }
    
    @Override
    public void visualiza() {
        
        componente.visualiza();
    }
    
    
    
}
