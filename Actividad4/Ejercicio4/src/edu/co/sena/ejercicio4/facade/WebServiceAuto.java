/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.facade;

import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface WebServiceAuto {
    String documento(int indice);
    List<String> buscaVehiculos(int precioMedio, int desviacionMax);
    
    
}
