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
public class ClienteContacto extends Cliente{

    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
    
}
