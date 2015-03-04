/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.templatemethod;

/**
 *
 * @author Tatiana
 */
public class UsuarioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedidoEspana = new PedidoEspana();
        pedidoEspana.setImporteSinIva(10000);
        pedidoEspana.calculaPrecioConIva();
        pedidoEspana.visualiza();
        System.out.println("--------------------------------");
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo();
        pedidoLuxemburgo.setImporteSinIva(10000);
        pedidoLuxemburgo.calculaPrecioConIva();
        pedidoLuxemburgo.visualiza();

    }

}
