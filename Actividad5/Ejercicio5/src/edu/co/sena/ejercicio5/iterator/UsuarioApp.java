/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.iterator;

/**
 *
 * @author ColsutecR
 */
public class UsuarioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatalogoVehiculo catalogo = new CatalogoVehiculo();
        IteradorVehiculo iterator = catalogo.busqueda("economico");
        Vehiculo vehiculo;
        iterator.inicio();
        vehiculo = iterator.item();
        while (vehiculo != null) {
            vehiculo.visualiza();
            iterator.siguiente();
            vehiculo = iterator.item();
        }
    }

}
