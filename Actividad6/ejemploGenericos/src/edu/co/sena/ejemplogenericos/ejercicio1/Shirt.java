/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplogenericos.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class Shirt {
    
    private String marca;
    private String material;
    private String talla;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Shirt{" + "marca=" + marca + ", material=" + material + ", talla=" + talla + '}';
    }
    
    
    
    
    
    
}
