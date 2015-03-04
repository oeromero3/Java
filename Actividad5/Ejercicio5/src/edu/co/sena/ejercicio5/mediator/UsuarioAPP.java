/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.mediator;

/**
 *
 * @author Oscar
 */
public class UsuarioAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Formulario formulario = new Formulario();
        formulario.agregaControl(new ZonaInformacion("Nombre"));
        formulario.agregaControl(new ZonaInformacion("Apellidos"));
        PopupMenu menu = new PopupMenu("Coprestatario");
        menu.agregaOpcion("sin coprestatario");
        menu.agregaOpcion("con coprestatario");
        formulario.agregaControl(menu);
        formulario.setMenuCoprestatario(menu);
        
        Boton boton = new Boton("OK");
        formulario.agregaControl(boton);
        formulario.setBotonOK(boton);
        formulario.agregaControlCoprestatario(new ZonaInformacion("Nombre del coprestatario"));
        formulario.agregaControlCoprestatario(new ZonaInformacion("Apellidos sin coprestatario"));
        formulario.informa();
    }
    
}
