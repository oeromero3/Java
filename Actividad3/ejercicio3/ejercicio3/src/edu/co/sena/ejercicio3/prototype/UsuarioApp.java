/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototype;

/**
 *
 * @author Colsutec17
 */
public class UsuarioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentacionEnBlanco documentaionEnBlanco=     DocumentacionEnBlanco.instance();
        documentaionEnBlanco.incluye(new OrdenDePedido());
        documentaionEnBlanco.incluye(new CertificadoCesion());
        documentaionEnBlanco.incluye(new SolicitudMatriculacion());
        documentaionEnBlanco.incluye(new SolicitudMatriculacion());
        
        
        DocumentacionCliente documentacionCliente1= new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente2= new DocumentacionCliente("Simon");
        
      
      
      
      
        
        documentacionCliente1.visualiza();
        documentacionCliente2.visualiza();
        
        
    }
    
}
