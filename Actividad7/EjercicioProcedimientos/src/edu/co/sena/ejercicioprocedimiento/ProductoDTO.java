/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicioprocedimiento;

import java.io.Serializable;

/**
 *
 * @author ColsutecR
 */
public class ProductoDTO implements Serializable {

    private String id_Producto;
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;
    private short activo;
    private double impuesto;
    private int id_Categoria;

    public ProductoDTO() {
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id_Producto=" + id_Producto + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", activo=" + activo + ", impuesto=" + impuesto + ", id_Categoria=" + id_Categoria + '}';
    }

}
