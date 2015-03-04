/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.chainofresponsability;

/**
 *
 * @author ColsutecR
 */
public abstract class ObjetoBasico {

    protected ObjetoBasico siguiente;

    public ObjetoBasico() {
    }

    private String descripcionPorDefecto() {
        return "Descripcion por defecto";

    }

    protected abstract String getDescripcion();

    public String devuelveDescripcion() {
        String resultado;
        resultado = this.getDescripcion();
        if (resultado != null) {
            return resultado;
        }
        if (siguiente != null) {
            return siguiente.devuelveDescripcion();
        } else {
            return this.descripcionPorDefecto();
        }
      }
    public void setSiguiente(ObjetoBasico siguiente){
    
    this.siguiente= siguiente;
    
    }

}
