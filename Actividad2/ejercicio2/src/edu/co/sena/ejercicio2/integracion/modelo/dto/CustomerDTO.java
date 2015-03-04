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
public class CustomerDTO extends PeopleDTO implements Serializable{
    
    private String idCustomer;

    public CustomerDTO() {
    }
    
    

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    
    public String toString() {
    return "Customer {" + "idCustomer=" + this.idCustomer
            + ", primer nombre: " + this.getPrimerNombre() + 
            ", segundo nombre: " + this.getSegundoNombre() +
            ", primer apellido: " + this.getPrimerApellido() + 
            ", segundo apellido: " + this.getSegundoApellido() +"}";
    
    
    }
    
    
}
