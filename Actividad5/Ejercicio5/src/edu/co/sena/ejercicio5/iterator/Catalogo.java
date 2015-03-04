/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ColsutecR
 */
public abstract class Catalogo <TElemento extends Elemento, TIterator extends Iterator<TElemento>>{

    protected List<TElemento> contenido = new ArrayList();

   

    protected abstract TIterator creaIterador();

    public TIterator busqueda(String palabraClaveConsulta) {

        TIterator resultado = creaIterador();
        resultado.setPalabraClaveConsulta(palabraClaveConsulta, contenido);
        return resultado;

    }
}
