/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.command;

/**
 *
 * @author ColsutecR
 */
public class Vehiculo {
    
    protected String nombre;
    protected long fechaEntradaStock;
    protected double precioVenta;

    public Vehiculo(String nombre, long fechaEntradaStock, double precioVenta) {
        this.nombre = nombre;
        this.fechaEntradaStock = fechaEntradaStock;
        this.precioVenta = precioVenta;
    }
    
    public long getTiempoStock(long hoy){
    
        return hoy - fechaEntradaStock;
    
    }
    
    public void modificaPrecio(double coeficiente){
     
        this.precioVenta = 0.01 * Math.round(coeficiente* this.precioVenta*100);
    
    }
    
    
    public void visualiza(){
    
        System.out.println(nombre + " precio: "+ precioVenta + "fecha entrada stock"+ fechaEntradaStock);
        
    
    }
}
