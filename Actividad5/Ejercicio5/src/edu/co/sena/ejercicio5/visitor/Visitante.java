/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.visitor;

/**
 *
 * @author toshiba_
 */
public interface Visitante {
    
    public void visita (EmpresSinFilial empresa);
    public void visita (EmpresaMadre empresa);
    
}
