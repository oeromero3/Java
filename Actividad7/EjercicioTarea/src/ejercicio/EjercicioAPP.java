/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba_
 */
public class EjercicioAPP {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        Statement sentencia = null;
        ResultSet rs = null;

        String servidor = "jdbc:mysql://localhost/akuavida";
        String usuarioDB = "root";
        String passwordDB = "123456789";

        String a = JOptionPane.showInputDialog("Escriba el id de la factura ");

        String sql = "Select * "
                + "FROM akuavida.factura fac "
                + "where fac.ID_Factura = '" + a + "'"
                + ";";
        System.out.println(sql);

        
        
        try {

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("Se conecto correctamente");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            System.out.println("_______________");
            rs = sentencia.executeQuery(sql);

            Factura fac1 = new Factura();
            Cuenta cue1 = new Cuenta();

            if (rs.next() == true) {
                rs.beforeFirst();
                while (rs.next() == true) {

                    fac1.setIdFactura(rs.getInt("ID_Factura"));
                    fac1.setFecha(rs.getDate("Fecha"));
                    fac1.setCuentaTipoDocumento(rs.getString("Cuenta_Tipo_Documento"));
                    fac1.setCuentaNumeroDocumento(rs.getString("Cuenta_Numero_Documento"));

                    
                }
                System.out.println(fac1.toString());
                
            } else {
                System.out.println("No Existen Los Datos");
            }
            System.out.println("_______________");
            boolean resultado = sentencia.execute(sql);
            if (resultado = true) {
                System.out.println("Se pudo ejecutar el programa");
            } else {
                System.out.println("No se pudo ejecutar el programa");
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro la sentencia correctamente");
            }

            if (!rs.wasNull()) {
                rs.close();
                System.out.println("se cerro el result correctamente");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }

    }

}
