/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejerciciodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ColsutecR
 */
public class CuentaApp2 {

    public Connection conexion = null;
    public PreparedStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public static void main(String[] args) throws SQLException {

//        CuentaTO cuenta1 = new CuentaTO();
//        cuenta1.setTipoDocumento("C.C");
//        cuenta1.setNumeroDocumento("10230064587");
//        cuenta1.setPrimerNombre("Ana");
//        cuenta1.setSegundoNombre("Mariia");
//        cuenta1.setPrimerApellido("Hoyos");
//        cuenta1.setSegundoApellido("Rodriguez");
//        cuenta1.setContrasena("4512gjgsd");
//        cuenta1.setCorreo("anaHoy@yahoo.es");
//        cuenta1.setDireccion("calle 45 b 56-56");
//        cuenta1.setTelefono("7546824");
//        cuenta1.setRool("Cliente");
//        cuenta1.setActivo(new Short("1"));
//        cuenta1.setUsuarioIdUsuario("1");
//
//        CuentaApp2 cu = new CuentaApp2();
//        cu.insertarCuenta(cuenta1);
//        System.out.println("--------------------------------");
//        
        CuentaTO cuenta2 = new CuentaTO();
        
        cuenta2.setDireccion("calle las lajas");
        cuenta2.setTelefono("7612288");
        cuenta2.setTipoDocumento("C.C");
        cuenta2.setNumeroDocumento("10230064587");
        
        CuentaApp2 cu2 = new CuentaApp2();
        cu2.actualizarCuenta(cuenta2);
        System.out.println("-------------------");
        
        CuentaTO cuenta3 = new CuentaTO();
        cuenta3.setTipoDocumento("C.C");
        cuenta3.setNumeroDocumento("10230064587");
        CuentaApp2 cu3 = new CuentaApp2();
        cu3.eliminarCuenta(cuenta3);
        
        CuentaTO cuenta4 = new CuentaTO();
        cuenta4.setTipoDocumento("C.C");
        cuenta4.setNumeroDocumento("79298460");
        CuentaApp2 cu4 = new CuentaApp2();
        CuentaTO cuen2=cu4.buscarCuenta(cuenta4);
        System.out.println(cuen2.toString());
        

    }

    public void insertarCuenta(CuentaTO cuenta) throws SQLException {

        try {

            String sql = "INSERT INTO akuavida.cuenta"
                    + "(`Tipo_Documento`,"
                    + "`Numero_Documento`,"
                    + "`Primer_Nombre`,"
                    + "`Segundo_Nombre`,"
                    + "`Primer_Apellido`,"
                    + "`Segundo_Apellido`,"
                    + "`Contrasena`,"
                    + "`Correo`,"
                    + "`Direccion`,"
                    + "`Telefono`,"
                    + "`Rool`,"
                    + "`Activo`,"
                    + "`Ususario_idUsusario`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?)";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

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

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se insertaron " + resultado);
            } else {
                System.out.println("no se inserto");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

    public void actualizarCuenta(CuentaTO cuenta) throws SQLException {
        try {

            String sql = "UPDATE `akuavida`.`cuenta`"
                    + " SET"
                    + "`Direccion` = ?,"
                    + "`Telefono` = ?"
                    + " WHERE `Tipo_Documento` = ? AND `Numero_Documento` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, cuenta.getDireccion());
            sentencia.setString(2, cuenta.getTelefono());
            sentencia.setString(3, cuenta.getTipoDocumento());
            sentencia.setString(4, cuenta.getNumeroDocumento());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se borro la cuenta " + resultado);
            } else {
                System.out.println("No se borro la cuenta");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }

    }

    public void eliminarCuenta(CuentaTO cuenta) throws SQLException {
        try {

            String sql = "DELETE FROM `akuavida`.`cuenta`"
                    + " WHERE `Tipo_Documento` = ? AND `Numero_Documento` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se actualizaron " + resultado);
            } else {
                System.out.println("no se actualizo");
            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }

    }

    public CuentaTO buscarCuenta(CuentaTO cuenta) throws SQLException {

        CuentaTO cuen = new CuentaTO();

        try {

            String sql = "SELECT * "
                    + "FROM `akuavida`.`cuenta`"
                    + " WHERE `Tipo_Documento` = ? AND `Numero_Documento` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, cuenta.getTipoDocumento());
            sentencia.setString(2, cuenta.getNumeroDocumento());

            System.out.println("sentencia ejecutada " + sql);

            rs = sentencia.executeQuery();

            while (rs.next() == true) {
                cuen.setTipoDocumento(rs.getString("Tipo_Documento"));
                cuen.setNumeroDocumento(rs.getString("Numero_Documento"));
                cuen.setPrimerNombre(rs.getString("Primer_Nombre"));
                cuen.setSegundoNombre(rs.getString("Segundo_Nombre"));
                cuen.setPrimerApellido(rs.getString("Primer_Apellido"));
                cuen.setSegundoApellido(rs.getString("Segundo_Apellido"));
                cuen.setContrasena(rs.getString("Contrasena"));
                cuen.setCorreo(rs.getString("Correo"));
                cuen.setDireccion(rs.getString("Direccion"));
                cuen.setTelefono(rs.getString("Telefono"));
                cuen.setRool(rs.getString("Rool"));
                cuen.setActivo(rs.getShort("Activo"));
                cuen.setUsuarioIdUsuario(rs.getString("Ususario_idUsusario"));

            }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {

            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
return cuen;
    }
}
