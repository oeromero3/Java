/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.entity.dao;

import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.Collection;


/**
 *
 * @author ColsutecR
 */
public interface GenericDAO {
    public void insert(PeopleDTO e);
    public void update (PeopleDTO e);
    public void delete (PeopleDTO e);
    public void findByID (PeopleDTO e);
    
    public void inser(Collection<PeopleDTO> listaPersonas);
    
}
