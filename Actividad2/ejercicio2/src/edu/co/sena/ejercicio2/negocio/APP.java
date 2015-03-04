/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio2.negocio;

import edu.co.sena.ejercicio2.integracion.entity.dao.CustomerDAO;
import edu.co.sena.ejercicio2.integracion.entity.dao.EmployeedDAO;
import edu.co.sena.ejercicio2.integracion.factory.DAOAbstractFactory;
import edu.co.sena.ejercicio2.integracion.factory.DAOFactory;
import edu.co.sena.ejercicio2.integracion.modelo.dto.CustomerDTO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.EmployeeDTO;
import edu.co.sena.ejercicio2.integracion.modelo.dto.PeopleDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        PeopleDTO p1 = new PeopleDTO();
        p1.setPrimerNombre("Andres");
        p1.setSegundoNombre("Felipe");
        p1.setPrimerApellido("Castañeda");
        p1.setSegundoApellido("Sanchez");
        System.out.println(p1.toString());
        System.out.println("----------------------------------");

        CustomerDTO c1 = new CustomerDTO();
        c1.setIdCustomer("01");
        c1.setPrimerNombre("Maicol");
        c1.setSegundoNombre("Steven");
        c1.setPrimerApellido("Chunza");
        c1.setSegundoApellido("Alfonzo");

        System.out.println(c1.toString());
        System.out.println("-----------------------------------");

        EmployeeDTO em1 = new EmployeeDTO();
        em1.setIdEmployeed("02");
        em1.setPrimerNombre("Oscar");
        em1.setSegundoNombre("Eduardo");
        em1.setPrimerApellido("Romero");
        em1.setSegundoApellido("Marin");

        System.out.println(em1.toString());
        System.out.println("-----------------------------------------------");
        
        DAOFactory fabrica = DAOAbstractFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        EmployeedDAO emp1Salidofabrica = fabrica.createEmployeedDAO();
        CustomerDAO cli1Salidofabrica= fabrica.createCustomerDAO();
        
        emp1Salidofabrica.insert(em1);
        emp1Salidofabrica.update(em1);
        emp1Salidofabrica.delete(em1);
        emp1Salidofabrica.findByID(em1);
        System.out.println("-----------------------------------------------------");
        
        cli1Salidofabrica.insert(c1);
        cli1Salidofabrica.update(c1);
        cli1Salidofabrica.delete(c1);
        cli1Salidofabrica.findByID(c1);
        System.out.println("-------------------------------------------------------");
        
        List<PeopleDTO> listaEmpleados = new ArrayList();
        listaEmpleados.add(em1);
        listaEmpleados.add(em1);
        listaEmpleados.add(em1);
        listaEmpleados.add(em1);
        listaEmpleados.add(em1);
        
        emp1Salidofabrica.inser(listaEmpleados);
        
        System.out.println("--------------------------------------------------------");
        
        List<PeopleDTO>  listaClientes = new ArrayList<>();
        listaClientes.add(c1);
        listaClientes.add(c1);
        listaClientes.add(c1);
        
        cli1Salidofabrica.inser(listaClientes);
        
        
        

    }

}
