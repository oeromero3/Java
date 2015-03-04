/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.facade;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public class ComponenteCatalogo implements Catalogo{

    public ComponenteCatalogo() {
    }
    
    protected Object[] descripcionVehiculo={
    
    "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000, "Espace 5 puertas", 8000, "Break 5 puertas", 7000, "Coupe 2 puertas", 9000, "Utilitario 3 puertas", 5000 
    };

    @Override
    public List<String> buscaVehiculos(int precioMin, int precioMax) {
        int indice, tamano;
        List<String> resultado= new ArrayList<>();
        tamano= descripcionVehiculo.length/2;
        for ( indice = 0; indice < tamano; indice++) {
            int precio=(Integer)descripcionVehiculo[2*indice+1];
            if ((precio>=precioMin) && (precio<= precioMax)) {
                resultado.add((String)descripcionVehiculo[2*indice]);
            }
            
        }
        return  resultado;
    }
    
}
