/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao.mysql;

import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class EmployeedDAOMySqlImpl implements EmployeedDAO{

    @Override
    public void insert(PeopleDTO e) {
        System.out.println("Se inserto el empleado en MYSQL: " +e.toString());
    }

    @Override
    public void update(PeopleDTO e) {
        System.out.println("Se actualzo el empleado en MYSQL: " +e.toString());
    }

    @Override
    public void delete(PeopleDTO e) {
       System.out.println("Se borro el empleado en MYSQL: " +e.toString());
    }

    @Override
    public void findByID(PeopleDTO e) {
        System.out.println("Se busco el empleado en MYSQL: " +e.toString());
    }

    @Override
    public void inser(Collection<PeopleDTO> listaPersonas) {
       for (PeopleDTO listaPersona : listaPersonas) {
            System.out.println("Se inserto el empleado en MYSQL:  " + listaPersona.toString());
            
        }
    }
    
}
