/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjdbcconexion;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class TareaConexion7 {

    /**
     * @param args the command line arguments
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
            
            String i= JOptionPane.showInputDialog("Escriba el Id del producto");
            
            rs = sentencia.executeQuery("select * from Akuavida.producto where ID_producto ="+i);
           
            
            if (!rs.wasNull()) {
                while (rs.next() == true) {
                    System.out.println("Id Categoria: " + rs.getString("ID_producto"));
                    System.out.println("Id categoria: " + rs.getString("Categorias_ID_Categoria"));
                    System.out.println("Nombre: " + rs.getString("Nombre"));
                    System.out.println("Precio: " + rs.getString("Precio"));
                    System.out.println("Descripcion: " + rs.getString("Descripcion"));
                    System.out.println("Cantidad: " + rs.getString("Cantidad"));
                    System.out.println("Activo: " + rs.getString("Activo"));
                    System.out.println("Impuesto: " + rs.getString("impuesto"));
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
