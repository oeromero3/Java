/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.factorymedthod;

/**
 *
 * @author colsutec21
 */
public class UsuarioAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente;
        cliente = new ClienteContacto();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        
    }
    
}
