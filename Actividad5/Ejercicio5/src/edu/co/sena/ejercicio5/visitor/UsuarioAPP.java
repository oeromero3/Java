/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.visitor;

/**
 *
 * @author toshiba_
 */
public class UsuarioAPP {
    public static void main(String[] args) {
        
        Empresa empresa1 = new EmpresSinFilial("Empresa1", "info@empresa1.com", "calle empresa1 el bronx ");
        Empresa empresa2 = new EmpresSinFilial("Empresa2", "info@empresa2.com", "calle empresa2 del cartcho ");
        Empresa grupo1 = new EmpresaMadre("Grupo1", "info@grupo1.com", "calle grupo1 el samber ");
        grupo1.agregaFilial(empresa1);
        grupo1.agregaFilial(empresa2);
        Empresa empresa3 = new EmpresSinFilial("Empresa3", "info@empresa3.com", "calle empresa3 la L ");
        Empresa grupo2 = new EmpresaMadre("Grupo2", "info@grupo2.com", "calle grupo2 la olla ");
        grupo2.agregaFilial(grupo1);
        grupo2.agregaFilial(empresa3);
        grupo2.aceptaVisitante(new VisitanteMailingComercial());
        
    }
}
