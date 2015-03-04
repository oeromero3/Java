/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplogenericos.ejercicio2;

/**
 *
 * @author ColsutecR
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona <String, String, String, String> p1= new Persona<>();
        p1.setPrimerNombre("Andresinho");
        p1.setSegundoNombre("feliínho");
        p1.setPrimerApellido("Gauchinho");
        p1.setSegundoApellido("Paulinho");
        
        System.out.println(p1.toString());
        
    }
    
}
