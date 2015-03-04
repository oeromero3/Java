/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplogenericos.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Estudiante estu1 = new Estudiante();
        estu1.setId(1);
        estu1.setNombre("Andres");
        Estudiante estu2 = new Estudiante();
        estu2.setId(2);
        estu2.setNombre("Juan");
        Estudiante estu3 = new Estudiante();
        estu3.setId(3);
        estu3.setNombre("Oscar");
        
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estu1);
        listaEstudiantes.add(estu2);
        listaEstudiantes.add(estu3);
        
        ListaUtilidades.imprimirLista(listaEstudiantes);
        
        
    }
    
}
