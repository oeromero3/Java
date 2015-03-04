/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplojdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexionJDBC2 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
         Connection conexion = null;

        try {
            
             String servidor = "jdbc:mysql://localhost/akuavida";
            String usuarioDB = "root";
            String passwordDB = "123456789";

          conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

        } catch (SQLException  e) {

            System.out.println(e.toString());
        }finally{
        
            if (conexion!=null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }
        
        }

        
    }
    
}
