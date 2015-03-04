/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory.modelo;

/**
 *
 * @author colsutec21
 */
public class ScooterGasolinaDTO extends ScooterDTO{
    
     private String capacidadDeTanque;

    public ScooterGasolinaDTO() {
    }

    public String getCapacidadDeTanque() {
        return capacidadDeTanque;
    }

    public void setCapacidadDeTanque(String capacidadDeTanque) {
        this.capacidadDeTanque = capacidadDeTanque;
    }
     
     @Override
    public String toString() {
        return "ScooterGasolina{" + "placa=" + this.getPlaca() + ", modelo=" + this.getModelo() + ", color=" + this.getColor() + ", pasajero=" + this.getPasajero() + ", Capacidad de tanque=" + capacidadDeTanque + '}';
    }
    
}
