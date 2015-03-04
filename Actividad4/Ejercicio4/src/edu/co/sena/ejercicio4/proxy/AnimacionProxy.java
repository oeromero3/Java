/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio4.proxy;

/**
 *
 * @author ADMIN
 */
public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "Mostrar la foto:";

    public AnimacionProxy() {
    }
    

    @Override
    public void clic() {
        if (video == null) {
            video = new Video();
            video.carga();
        }
        video.reproduce();
    }

    @Override
    public void dibuja() {
        if (video != null) {
            video.dibuja();
        } else {
            dibuja(foto);
        }
    }

    public void dibuja(String foto) {
        System.out.println(foto);
    }

}
