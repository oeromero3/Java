/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory.modelo;

import java.io.Serializable;

/**
 *
 * @author colsutec21
 */
public class AutomovilDTO implements Serializable{

    private String placa;
    private String modelo;
    private String color;
    private int pasajero;

    public AutomovilDTO() {
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", pasajero=" + pasajero + '}';
    }

}
