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
public class VistaVehiculo implements ComponenteGraficoVehiculo{

    public VistaVehiculo() {
    }
    
    
    @Override
    public void visualiza() {
        
        System.out.println("Visualizacion del vehiculo");
    }
    
    
    
}
