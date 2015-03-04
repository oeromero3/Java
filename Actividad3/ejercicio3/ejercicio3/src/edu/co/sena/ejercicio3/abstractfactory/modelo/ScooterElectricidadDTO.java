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
public class ScooterElectricidadDTO extends ScooterDTO{
    
    private String voltaje;
    private String amperaje;

    public ScooterElectricidadDTO() {
    }
    
    

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(String amperaje) {
        this.amperaje = amperaje;
    }

    @Override
    public String toString() {
        return "ScooterElectricidad{" + "placa=" + this.getPlaca() + ", modelo=" + this.getModelo() + ", color=" + this.getColor() + ", pasajero= " + this.getPasajero() + ",  voltaje=" + voltaje + ", amperaje=" + amperaje + '}';
    }

    
}
