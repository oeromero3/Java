/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejerciciodto;

/**
 *
 * @author Invitado
 */
public class CarritoTO {
    
    private int idCarrito;
    private double total;
    private double subtotal;

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "CarritoTO{" + "idCarrito=" + idCarrito + ", total=" + total + ", subtotal=" + subtotal + '}';
    }
    
    
}
