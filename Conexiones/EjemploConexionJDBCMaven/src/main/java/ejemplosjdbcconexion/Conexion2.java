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
public class Conexion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
         java.sql.Connection conexion= null;
        try {
            
            String servidor="jdbc:mysql://localhost/akuavida";
            String usuarioDB="root";
            String passwordDB="123456789";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            System.out.println("Buena se conecto");
        } catch (SQLException  e) {
            System.err.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            System.out.println("Se cerro la conexion");
        
            }
        
        }
    }
    
}
