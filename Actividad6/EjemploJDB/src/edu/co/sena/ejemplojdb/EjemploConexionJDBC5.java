/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplojdb;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class EjemploConexionJDBC5 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        // mysql
        java.sql.Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://172.16.4.142/pijamax";
            String usuarioDB = "nicolas";
            String passwordDB = "12345";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto en mysql");

        } catch (SQLException | ClassNotFoundException e) {

            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }
            System.out.println("---------------------");
        }

        // postgres
        java.sql.Connection conexion2 = null;
        String servidor2 = "jdbc:postgresql://localhost:5432/Ejemplo1";
        String usuarioDB2 = "postgres";
        String passwordDB2 = "123456789";

        try {

            conexion = DriverManager.getConnection(servidor2, usuarioDB2, passwordDB2);
            System.out.println("se conecto en postgres");

        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }
            System.out.println("---------------------");
        }

        // oracle
        java.sql.Connection conexion3 = null;

        try {

            String servidor3 = "jdbc:oracle:thin://172.16.4.142/XE";
            String usuarioDB3 = "SENA";
            String passwordDB3 = "Sena2014";

            conexion = DriverManager.getConnection(servidor2, usuarioDB2, passwordDB2);
            System.out.println("se conecto en oracle");

        } catch (SQLException e) {

            System.out.println(e.toString());
        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("La conexion se cerro");
            }

        }
    }
    }

