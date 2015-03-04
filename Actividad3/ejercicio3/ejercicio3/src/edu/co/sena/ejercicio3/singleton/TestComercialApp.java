/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.singleton;

/**
 *
 * @author Colsutec17
 */
public class TestComercialApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comercial elComercial = Comercial.instance();
        elComercial.setNombre("Comercial Auto");
        elComercial.setDireccion("Madrid");
        elComercial.setEmail("comercial@comerciales.com ");

        elComercial.visualiza();
    }

    public static void visualiza() {
        Comercial elComercial = Comercial.instance();
        elComercial.visualiza();
    }

}
