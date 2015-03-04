/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class EstudianteAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante est1= new Estudiante();
        est1.setNombre("Andres");
        est1.setId(1);
        Estudiante est2= new Estudiante();
        est2.setNombre("Oscar");
        est2.setId(2);
        Estudiante est3= new Estudiante();
        est3.setNombre("Juan");
        est3.setId(3);
                
               
        
        List<Estudiante> listaEstudiantes = new ArrayList<>();
    
        Comparator<Estudiante> sortNombre= new EstudiantePorNombre();
        listaEstudiantes.add(est3);
        listaEstudiantes.add(est2);
        listaEstudiantes.add(est1);
        Comparator<Estudiante> sortId= new EstudiantePorId();
      
        Collections.sort(listaEstudiantes, sortNombre);
        for (Estudiante listaEstudiante : listaEstudiantes) {
            System.out.println(listaEstudiante.toString());
            
        }
        System.out.println("---------------------------");
        Collections.sort(listaEstudiantes, sortId);
        for (Estudiante listaEstudiante : listaEstudiantes) {
            System.out.println(listaEstudiante.toString());
        }      
        
        
    }
    
}
