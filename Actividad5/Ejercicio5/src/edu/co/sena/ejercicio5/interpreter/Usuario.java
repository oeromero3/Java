/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejercicio5.interpreter;

import java.util.Scanner;

/**rojo
 *
 * @author toshiba_
 */
public class Usuario {
    public static void main(String[] args) {
        
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su consulta: ");
        String consulta = reader.nextLine();
        try {
            expresionConsulta = Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            expresionConsulta = null;
        }
        
        if (expresionConsulta != null) {
            System.out.println("Introduzca la descripcion de un vehiculo: ");
            String descripcion = reader.nextLine();
            if (expresionConsulta.evalua(descripcion))
                System.out.println("La descripcion responde a la consulta");
            else 
                System.out.println("La descripcion no responde a la consulta");
        }
    }
}
