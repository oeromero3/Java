/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.composite;

/**
 *
 * @author toshiba_
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregarVehiculo();
        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregarVehiculo();
        empresa2.agregarVehiculo();
        
        Empresa grupo = new EmpresaMadre();
        grupo.agregaFilial(empresa1);
        grupo.agregaFilial(empresa2);
        grupo.agregarVehiculo();
        System.out.println("Coste de mantenimiento total de grupo: " + grupo.calculaCosteMantenimiento());
    }

}
