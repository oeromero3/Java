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
public class PedidoEspana extends Pedido{

    @Override
    protected void calculaIva() {
         importeIva= importeSinIva * 0.21;
    }

    
    
}
