/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.bridge;

/**
 *
 * @author Tatiana
 */
public class FormularioMatriculacionPortugal extends FormularioMatriculacion{

    public FormularioMatriculacionPortugal(FormularioImpl implementacion) {
        super(implementacion);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length() == 6;
    }
    
}
