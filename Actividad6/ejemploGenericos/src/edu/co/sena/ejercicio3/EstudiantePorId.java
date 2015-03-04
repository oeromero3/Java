/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3;

import java.util.Comparator;

/**
 *
 * @author ColsutecR
 */
public class EstudiantePorId implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        if (o1.getId() < o2.getId()) {
            
            return -1;
        }else if (o1.getId() > o2.getId()) {
            return 1;
        }else{
        
            return 0;
        
        }
        
    }
    
}
