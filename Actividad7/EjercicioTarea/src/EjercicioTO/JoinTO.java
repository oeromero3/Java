/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTO;

/**
 *
 * @author ColsutecR
 */
public class JoinTO {

    private int cantidad;
    private String nombre;
    private double costoUnitario;
    private double costoTotal;

    public JoinTO() {
    }

    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "JoinTO{" + "cantidad=" + cantidad + ", nombre=" + nombre + ", costoUnitario=" + costoUnitario + ", costoTotal=" + costoTotal + '}';
    }

    
    
 

}
