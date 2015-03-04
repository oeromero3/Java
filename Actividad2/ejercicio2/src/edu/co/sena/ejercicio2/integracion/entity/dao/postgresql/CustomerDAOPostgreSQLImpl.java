/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao.postgresql;

import edu.co.sena.ejercicio2.integracion.entity.dao.CustomerDAO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;

/**
 *
 * @author ColsutecR
 */
public class CustomerDAOPostgreSQLImpl implements CustomerDAO{

    @Override
    public void insert(PeopleDTO e) {
        System.out.println("Se inserto el cliente en PostgreSQL: " +e.toString());
    }

    @Override
    public void update(PeopleDTO e) {
        System.out.println("Se actualizo el cliente en PostgreSQL: " +e.toString());
    }

    @Override
    public void delete(PeopleDTO e) {
        System.out.println("Se borro el cliente en PostgreSQL: " +e.toString());
    }

    @Override
    public void findByID(PeopleDTO e) {
        System.out.println("Se busco el cliente en PostgreSQL: " +e.toString());
    }

    @Override
    public void inser(Collection<PeopleDTO> listaPersonas) {
        for (PeopleDTO listaPersona : listaPersonas) {
            System.out.println("Se inserto el cliente en PostgreSQL:  " + listaPersona.toString());
            
        }
    }
    
}
