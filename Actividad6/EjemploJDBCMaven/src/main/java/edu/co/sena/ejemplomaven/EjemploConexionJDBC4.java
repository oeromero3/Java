/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexionJDBC4 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {

        Connection conexion = null;
        Properties propiedades = new Properties();        
        propiedades.setProperty("user","root" );
        propiedades.setProperty("password","123456789" );

        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost/akuavida",propiedades);
            System.out.println("se conecto");

        } catch (SQLException e) {

            System.out.println(e.toString());
        }finally{
        
            if (conexion!=null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }
        
        }
    }
}
