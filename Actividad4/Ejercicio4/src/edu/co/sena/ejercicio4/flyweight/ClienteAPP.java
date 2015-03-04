/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.flyweight;

/**
 *
 * @author Oscar
 */
public class ClienteAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaOpcion fabrica = new FabricaOpcion();
        VehiculoSolicitado vehiculo = new VehiculoSolicitado();
        vehiculo.agregaOpciones("air bag", 80, fabrica);
        vehiculo.agregaOpciones("Direccion asistida", 90, fabrica);
        vehiculo.agregaOpciones("elevalunas electricos", 85, fabrica);
        vehiculo.muestraOpciones();
        
    }
    
}
