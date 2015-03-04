/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplogenericos.ejercicio1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shirt cam1 = new Shirt();
        cam1.setMarca("Pat Primo");
        cam1.setMaterial("Algodon");
        cam1.setTalla("M");
        
        CacheAny<Shirt> objeto1 = new CacheAny<>();
        CacheAny<String> objeto2 = new CacheAny<>();
        objeto1.add(cam1);
        objeto2.add("Ola K Ase");

        System.out.println(objeto1.getT().toString());
        System.out.println(objeto2.getT());
        List<Integer> parlist = new ArrayList<>(3);
        parlist.add(1);
        parlist.add(2);
        parlist.add(3);
        parlist.add(4);
        parlist.add(5);
        
        for (Integer parlist1 : parlist) {
            
            System.out.println(parlist1);           
            
        }
        System.out.println("----------------------");
        
        Deque <Integer> numeros = new ArrayDeque<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
        numeros.remove();
        numeros.remove();
        System.out.println("----------------------");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("--------------------------------------");
        Deque <Integer> numeros2 = new ArrayDeque<>();
        numeros2.push(1);
        numeros2.push(2);
        numeros2.push(3);
        numeros2.push(4);
        numeros2.push(5);
        numeros2.push(6);
           
        for (Integer numeros21 : numeros2) {
            
            System.out.println(numeros21);
        }
        System.out.println("--------");
        
        numeros2.pop();
        numeros2.pop();
        
        for (Integer numeros21 : numeros2) {
            System.out.println(numeros21);
        }
        
    }
    
}
