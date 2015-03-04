/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjdbcconexion;

import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ColsutecR
 */
public class Conexion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //mysql
        java.sql.Connection conexion = null;

        try {

            String servidor = "com.jdbc:mysql://localhost:3306/pijamax";
            String usuarioDB = "nicolas";
            String passwordDB = "12345";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

        } catch (SQLException e) {
            System.out.println(e.toString());

        } finally {

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");

            }
        }
        //oracle
        java.sql.Connection conexion2 = null;

        try {

            String servidor2 = "jdbc:oracle:thin:@172.16.4.142:1521:XE";
            String usuarioDB2 = "SENA";
            String passwordDB2 = "sena2014";
            conexion2 = DriverManager.getConnection(servidor2, usuarioDB2, passwordDB2);
            System.out.println("se conecto");

        } catch (SQLException e) {
            System.out.println(e.toString());

        } finally {

            if (conexion2 != null) {
                conexion2.close();
                System.out.println("se cerro la conexion correctamente");

            }
        }
        //posgresSql
        java.sql.Connection conexion3 = null;

        try {

            String servidor3 = "jdbc:postgresql://172.16.4.142:5432/hibernatedb";
            String usuarioDB3 = "postgres";
            String passwordDB3 = "root";
            conexion2 = DriverManager.getConnection(servidor3, usuarioDB3, passwordDB3);
            System.out.println("se conecto en posgres");

        } catch (SQLException e) {
            System.out.println(e.toString());

        } finally {

            if (conexion3 != null) {
                conexion3.close();
                System.out.println("se cerro la conexion correctamente");

            }
        }

    }
}
