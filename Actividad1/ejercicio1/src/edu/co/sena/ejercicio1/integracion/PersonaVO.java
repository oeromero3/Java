/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio1.integracion;

/**
 *
 * @author ColsutecR
 */
public class PersonaVO implements  Comparable<PersonaVO>, Cloneable{
    private  String primerNombre;
    private  String segundoNombre;
    private  String primerApellido;
    private  String segundoApellido;
    private  String tipoDocumento;
    private  String numDocumento;
    private  String edad;
    private  String sexo;

    public PersonaVO() {
    }
    

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String seundoNombre) {
        this.segundoNombre = seundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
        public int compareTo(PersonaVO p) {
        int res = -1;
        if (this.numDocumento.equals(p.numDocumento)) {
            res = -2;
        }
        return res;
    }
    @Override
    public PersonaVO clone(){
    PersonaVO personaVOClone= new PersonaVO();
    personaVOClone.setPrimerNombre(this.primerNombre);
    personaVOClone.setSegundoNombre(this.segundoNombre);
    personaVOClone.setPrimerApellido(this.primerApellido);
    personaVOClone.setSegundoApellido(this.segundoApellido);
    personaVOClone.setTipoDocumento(this.tipoDocumento);
    personaVOClone.setNumDocumento(this.numDocumento);
    personaVOClone.setEdad(this.edad);
    personaVOClone.setSexo(this.sexo);
    
    return personaVOClone;       
    
    
    }

    @Override
    public String toString() {
        return "PersonaVO{" + "primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}
