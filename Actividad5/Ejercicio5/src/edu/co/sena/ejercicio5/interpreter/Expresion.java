/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.interpreter;

/**
 *
 * @author toshiba_
 */
public abstract class Expresion {

    public abstract boolean evalua(String descripcion);
    
    //parte analisis sintactico
    protected static String fuente;
    protected static int indice;
    protected static String pieza;

    protected static void siguientePieza() {
        while ((indice < fuente.length()) && (fuente.charAt(indice) == ')')) 
            indice++;
        
        if (indice == fuente.length()) 
            pieza = null;
         else if ((fuente.charAt(indice) == '(') || (fuente.charAt(indice) == ')')) {
            pieza = fuente.substring(indice, indice + 1);
            indice++;
         }
         else
         {

            int inicio = indice;
            while ((indice < fuente.length()) && (fuente.charAt(indice) != ' ') && (fuente.charAt(indice) != ')')) 
                indice++;
            
            pieza = fuente.substring(inicio, indice);

         }
    }

    public static Expresion analiza(String fuente) throws Exception {
        Expresion.fuente = fuente;
        indice = 0;
        siguientePieza();
        return OperadorO.parsea();
    }

    public static Expresion parsea() throws Exception
    {
        Expresion resultado;
        if (pieza.equals("(")) 
        {
            siguientePieza();
            resultado = OperadorO.parsea();
            if (pieza == null) 
                throw new Exception("Error de sintaxis");
            
            if (!pieza.equals(")")) 
                throw new Exception("Error de sintaxis");           
            siguientePieza();
        } 
        else 
        resultado = PalabraClave.parsea();  
//            resultado = PalabraClave.analiza(fuente);
        
        return resultado;
    }
}
