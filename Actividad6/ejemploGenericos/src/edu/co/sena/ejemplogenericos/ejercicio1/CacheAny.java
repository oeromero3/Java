/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplogenericos.ejercicio1;

/**
 *
 * @author ColsutecR
 */
public class CacheAny<T> {

    private T t;

    public void add(T t) {

        this.t = t;

    }

    public T getT() {
        return this.t;
    }

}
