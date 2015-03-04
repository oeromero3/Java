/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplojdb;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexionJDBC7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        java.sql.Connection conexion = null;

        String servidor = "jdbc:mysql://172.16.4.142/pijamax";
            String usuarioDB = "nicolas";
            String passwordDB = "12345";
            Statement sentencia= null;
            ResultSet rs=null;
        try {
           
            

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia= conexion.createStatement();
            sentencia.executeQuery("SELECT * FROM akuavida.categorias");
            
            while (rs.next()== true) {
                System.out.println("id categoria" + rs.getString(1));
                System.out.println("nombre categoria" + rs.getString(2));
                System.out.println("-------------");
                
            }
            

        } catch (SQLException e) {

            System.out.println(e.toString());
        }finally{
            // cerrar el satement
            if (sentencia !=null) {
                conexion.close();
                System.out.println("La conexion se cerro  statement");
            }
        // cerrar el rs
            if (!rs.wasNull()) {
                rs.close();
                System.out.println("La conexion se cerro  statement");
            }
            if (conexion!=null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }
        
        }
    }
    
}
