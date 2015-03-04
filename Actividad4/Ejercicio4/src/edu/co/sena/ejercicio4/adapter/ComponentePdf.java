/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.adapter;

/**
 *
 * @author ColsutecR
 */
public class ComponentePdf {

    protected String contenido;

    public void pdfFijaContenido(String contenido) {

        this.contenido = contenido;

    }

    public void pdfPreparaVisualizacion() {
        System.out.println("Visuliza PDF: Comienzo");

    }

    public void pdfRefresca() {
        System.out.println("Visualiza contenido PDF: " + contenido);
    }

    public void pdfFinalizaVisualizacion() {
        System.out.println("Visualiza PDF: Fin");
    }

    public void pdfEnviaImpresora() {
        System.out.println("Impresión PDF: " + contenido);
    }
}


