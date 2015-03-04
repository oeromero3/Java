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
public class VistaCatalogoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaVehiculo vistaVehiculo = new VistaVehiculo();
        ModeloDecorador modelodDecorador = new ModeloDecorador(vistaVehiculo);
        MarcaDecorador marcaDecorador = new MarcaDecorador(modelodDecorador);
        marcaDecorador.visualiza();
       
        
        
    }
    
}
