/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.flyweight;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Oscar
 */
public class FabricaOpcion {

    public FabricaOpcion() {
    }
    

    protected Map<String, OpcionVehiculo> opciones  = new TreeMap <String,OpcionVehiculo>();
    
    public OpcionVehiculo getOption(String nombre) {
        OpcionVehiculo resultado;
        if (opciones.containsKey(nombre)) {
            return opciones.get(nombre);
        } else {
            resultado = new OpcionVehiculo(nombre);
            opciones.put(nombre, resultado);
        }
        return resultado;
    }

}
