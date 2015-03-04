/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjdbcconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class Conexion6 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
       java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;
        try {
            
            String servidor="jdbc:mysql://localhost/akuavida";
            String usuarioDB="root";
            String passwordDB="123456789";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("Buena se conecto");         
            
            sentencia = conexion.createStatement();
            
            String i= JOptionPane.showInputDialog("Escriba el Id de la categoria");
            rs = sentencia.executeQuery("select * from Akuavida.categorias where ID_Categoria ="+i);
            
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Id Categoria: " + rs.getString("id_categoria"));
                    System.out.println("Nombre Categoria: " + rs.getString("Nombre"));
                    System.out.println("Activa: " + rs.getString("Activa"));
                    System.out.println("Pariente: " + rs.getString("Pariente"));
                }
            } else {
                System.out.println("No hay datos");
            }
            

        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (sentencia != null) {
                sentencia.close();
                System.out.println("Se cerro el statement de mysql");
            }
            if (rs != null) {
                rs.close();
                System.out.println("Se cerro el rs");
            }
            if (conexion != null) {
                conexion.close();
                System.out.println("Se cerro la conexion de mysql");
            }
        }
    }

}
