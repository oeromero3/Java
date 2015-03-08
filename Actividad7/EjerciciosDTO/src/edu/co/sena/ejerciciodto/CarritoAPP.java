/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejerciciodto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Invitado
 */
public class CarritoAPP {

    /**
     * @param args the command line arguments
     */
    public Connection conexion = null;
    public PreparedStatement sentencia = null;
    public ResultSet rs = null;
    String servidor = "jdbc:mysql://localhost/akuavida";
    String usuarioDB = "root";
    String passwordDB = "123456789";

    public static void main(String[] args) throws SQLException {

//        CarritoTO carrito1 = new CarritoTO();
//        carrito1.setIdCarrito(4);
//        carrito1.setTotal(0);
//        carrito1.setSubtotal(0);
//
//        CarritoAPP carritoApp = new CarritoAPP();
//        carritoApp.insertarCarrito(carrito1);
//        System.out.println("--------------------------");
//        CarritoTO carritoAct = new CarritoTO();
//        carritoAct.setSubtotal(100);
//        carritoAct.setTotal(100);
//        carritoAct.setIdCarrito(4);
//
//        CarritoAPP carritoActApp = new CarritoAPP();
//        carritoActApp.actualizarCarrito(carritoAct);
//        System.out.println("--------------");
//
//        CarritoTO carritoElim = new CarritoTO();
//        carritoElim.setIdCarrito(4);
//
//        CarritoAPP carritoElimApp = new CarritoAPP();
//        carritoElimApp.eliminarCarrito(carritoElim);
//        System.out.println("---------------");
        
        CarritoTO carritoBusc = new CarritoTO();
        carritoBusc.setIdCarrito(1);
        CarritoAPP carritoBuscApp = new CarritoAPP();
        CarritoTO carr2 =carritoBuscApp.buscarCarrito(carritoBusc);
        System.out.println(carr2.toString());

    }

    public void insertarCarrito(CarritoTO carrito) throws SQLException {

        try {

            String sql = "INSERT INTO `akuavida`.`carrito_de_compras`"
                    + "(`ID_Carrito`,"
                    + "`Total`,"
                    + "`Subtotal`)"
                    + "VALUES"
                    + "(?,"
                    + "?,"
                    + "?);";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, carrito.getIdCarrito());
            sentencia.setDouble(2, carrito.getTotal());
            sentencia.setDouble(3, carrito.getSubtotal());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se inserto un carrito " + resultado);
            } else {
                System.out.println("no se inserto el carrito");
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

    public void actualizarCarrito(CarritoTO carrito) throws SQLException {
        try {

            String sql = "UPDATE `akuavida`.`carrito_de_compras`"
                    + "SET"
                    + "`Total` = ?,"
                    + "`Subtotal` = ?"
                    + "WHERE `ID_Carrito` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setDouble(1, carrito.getSubtotal());
            sentencia.setDouble(2, carrito.getTotal());
            sentencia.setInt(3, carrito.getIdCarrito());

            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("Se actualizo el carrito " + resultado);
            } else {
                System.out.println("No se borro el carrito");
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

    public void eliminarCarrito(CarritoTO carrito) throws SQLException {
        try {

            String sql = "DELETE FROM `akuavida`.`carrito_de_compras`"
                    + "WHERE `ID_Carrito` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);

            sentencia.setInt(1, carrito.getIdCarrito());
            System.out.println("sentencia ejecutada " + sql);

            int resultado = sentencia.executeUpdate();

            if (resultado > 0) {
                System.out.println("se elimino el carrito " + resultado);
            } else {
                System.out.println("no se elimino el carrito ");
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

    public CarritoTO buscarCarrito(CarritoTO carrito) throws SQLException {

        CarritoTO carr = new CarritoTO();

        try {

            String sql = "SELECT * "
                    + "FROM `akuavida`.`carrito_de_compras`"
                    + "WHERE `ID_Carrito` = ?;";

            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto ");
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, carrito.getIdCarrito());
            

            System.out.println("sentencia ejecutada " + sql);

            rs = sentencia.executeQuery();

            while (rs.next() == true) {

                carrito.setIdCarrito(rs.getInt("ID_Carrito"));
                carrito.setTotal(rs.getDouble("Total"));
                carrito.setSubtotal(rs.getDouble("Subtotal"));

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
return carr;
    }

}
