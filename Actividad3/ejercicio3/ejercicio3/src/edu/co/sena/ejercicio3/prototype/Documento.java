/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.prototype;

/**
 *
 * @author Colsutec17
 */
public abstract class Documento implements Cloneable {

    protected String contenido = new String();

    public Documento duplica() {
        Documento resultado;
        try {
            resultado = (Documento) this.clone();
            System.out.println(this.toString());
            System.out.println(resultado.toString());
        } catch (CloneNotSupportedException exception) {
            return null;
        }
        return resultado;
    }

    public void rellena(String informacion) {
        contenido = informacion;
    }

    public abstract void imprime();

    public abstract void visualiza();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
