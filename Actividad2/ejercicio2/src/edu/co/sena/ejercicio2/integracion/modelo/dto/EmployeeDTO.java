/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.modelo.dto;

import java.io.Serializable;

/**
 *
 * @author ColsutecR
 */
public class EmployeeDTO extends PeopleDTO implements Serializable{
    
    private String idEmployeed;

    public EmployeeDTO() {
    }
    
    

    public String getIdEmployeed() {
        return idEmployeed;
    }

    public void setIdEmployeed(String idEmployeed) {
        this.idEmployeed = idEmployeed;
    }
    @Override
    
    public String toString() {
    return "Employeed {" + "idEmployeed=" + this.idEmployeed
            + ", primer nombre: " + this.getPrimerNombre() + 
            ", segundo nombre: " + this.getSegundoNombre() +
            ", primer apellido: " + this.getPrimerApellido() + 
            ", segundo apellido: " + this.getSegundoApellido() +"}";
    
    
    }
    
    
}
