/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.integracion.factory.postgresql;

import edu.co.sena.ejercicio2.integracion.entity.dao.CustomerDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.postgresql.CustomerDAOPostgreSQLImpl;
import edu.co.sena.ejercicio2.integracion.entity.dao.postgresql.EmployeedDAOPostgreSQLImpl;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;

/**
 *
 * @author ColsutecR
 */
public class PostgreSQLDAOFactory extends DAOAbstractFactory{
    
    @Override
    public EmployeedDAO createEmployeedDAO() {
       return new EmployeedDAOPostgreSQLImpl();
    }

    @Override
    public CustomerDAO createCustomerDAO() {
     return new CustomerDAOPostgreSQLImpl(); 
    }
    
}
