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
public class VisitanteMailingComercial implements Visitante{

    @Override
    public void visita(EmpresSinFilial empresa) {
        System.out.println("Envia un email a  " + empresa.getNombre() + " Direcion: " + empresa.getEmail() 
                + " Propuesta comercial para su empresa");
    }

    @Override
    public void visita(EmpresaMadre empresa) {
        System.out.println("Envia un email a  " + empresa.getNombre() + " Direcion: " + empresa.getEmail() 
                + " Propuesta comercial para su empresa");
        System.out.println("Impresion de un correo para: " + empresa.getNombre() + " Direccion: " + 
                empresa.getDireccion() + " Propuesta comercial para su grupo");
    
    }   
}
