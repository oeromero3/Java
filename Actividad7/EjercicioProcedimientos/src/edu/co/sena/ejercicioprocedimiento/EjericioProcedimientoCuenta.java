/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioprocedimiento;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class EjericioProcedimientoCuenta {

    /**
     * @param args the command line arguments
     */
    java.sql.Connection conexion = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";
    CallableStatement sentencia = null;

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        CuentaTO cuenta1 = new CuentaTO();
        cuenta1.setTipoDocumento("C.C");
        cuenta1.setNumeroDocumento("10230064587");
        cuenta1.setPrimerNombre("Ana");
        cuenta1.setSegundoNombre("Mariia");
        cuenta1.setPrimerApellido("Hoyos");
        cuenta1.setSegundoApellido("Rodriguez");
        cuenta1.setContrasena("4512gjgsd");
        cuenta1.setCorreo("anaHoy@yahoo.es");
        cuenta1.setDireccion("calle 45 b 56-56");
        cuenta1.setTelefono("7546824");
        cuenta1.setRool("Cliente");
        cuenta1.setActivo(new Short("1"));
        cuenta1.setUsuarioIdUsuario("7");

        EjericioProcedimientoCuenta cuProced = new EjericioProcedimientoCuenta();
        cuProced.insertarCuenta(cuenta1);

    }

    public void insertarCuenta(CuentaTO cuenta) throws SQLException {
        String sql = "call akuavida.insertCuenta(?,?,?,?,?,?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());
            sentencia.setString(3, cuenta.getPrimerNombre());
            sentencia.setString(4, cuenta.getSegundoNombre());
            sentencia.setString(5, cuenta.getPrimerApellido());
            sentencia.setString(6, cuenta.getSegundoApellido());
            sentencia.setString(7, cuenta.getContrasena());
            sentencia.setString(8, cuenta.getCorreo());
            sentencia.setString(9, cuenta.getDireccion());
            sentencia.setString(10, cuenta.getTelefono());
            sentencia.setString(11, cuenta.getRool());
            sentencia.setShort(12, cuenta.isActivo());
            sentencia.setString(13, cuenta.getUsuarioIdUsuario());
            
            

            System.out.println("sentencia ejecutada " + sql);

            sentencia.execute();

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }

    }
}
