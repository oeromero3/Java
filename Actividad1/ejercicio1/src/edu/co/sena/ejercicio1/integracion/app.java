/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio1.integracion;

/**
 *
 * @author ColsutecR
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaVO per = new PersonaVO();
        per.setPrimerNombre("Juancho");
        per.setSegundoNombre("Andres");
        per.setPrimerApellido("Montero");
        per.setSegundoApellido("Castañeda");
        per.setTipoDocumento("C.C");
        per.setNumDocumento("1023014938");
        per.setEdad("18");
        per.setSexo("Masculino");

        PersonaVO p2 = new PersonaVO();
        p2.setPrimerNombre("Juancho");
        p2.setSegundoNombre("Andres");
        p2.setPrimerApellido("Montero");
        p2.setSegundoApellido("Castañeda");
        p2.setTipoDocumento("C.C");
        p2.setNumDocumento("1023014938");
        p2.setEdad("18");
        p2.setSexo("Masculino");

        PersonaVO p3 = per.clone();

        if (per.compareTo(p3) == -2) {
            System.out.println("Verdad");
        } else {
            System.out.println("Falso");
        }

        System.out.println(p3.toString());

    }

}
