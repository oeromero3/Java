/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio5.observer;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public abstract class Sujeto {

    protected List<Observador> observadores = new ArrayList();

    public void agrega(Observador observador) {

        observadores.add(observador);

    }

    public void suprime(Observador observador) {

        observadores.remove(observador);

    }

    public void notifica() {

        for (Observador observador : observadores) {

            observador.actualiza();
        }

    }

}
