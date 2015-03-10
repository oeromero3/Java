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
public class EjercicioProcedimientos {

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
        ProductoDTO producto1 = new ProductoDTO();
        producto1.setId_Producto("155");
        producto1.setId_Categoria(1);
        producto1.setNombre("Purific las lajas");
        producto1.setPrecio(170000.0);
        producto1.setDescripcion("lodsfsdkl jdfldsjf sdlfhañdffj fdhahf ñoudsjhna fauhf");
        producto1.setCantidad(8);
        producto1.setActivo(new Short("1"));
        producto1.setImpuesto(16);
        EjercicioProcedimientos proced1 = new EjercicioProcedimientos();
        proced1.insertarProducto(producto1);

    }

    public void insertarProducto(ProductoDTO producto) throws SQLException {
        String sql = "call akuavida.insertPro(?,?,?,?,?,?,?,?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setString(1, producto.getId_Producto());
            sentencia.setString(2, producto.getNombre());
            sentencia.setDouble(3, producto.getPrecio());
            sentencia.setString(4, producto.getDescripcion());
            sentencia.setInt(5, producto.getCantidad());
            sentencia.setShort(6, producto.getActivo());
            sentencia.setDouble(7, producto.getImpuesto());
            sentencia.setInt(8, producto.getId_Categoria());

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
