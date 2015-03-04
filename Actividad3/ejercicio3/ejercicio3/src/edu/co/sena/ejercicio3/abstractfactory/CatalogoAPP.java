/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejercicio3.abstractfactory;

import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilElectricidadDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.AutomovilGasolinaDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterElectricidadDTO;
import edu.co.sena.ejercicio3.abstractfactory.modelo.ScooterGasolinaDTO;

/**
 *
 * @author colsutec21
 */
public class CatalogoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaVehiculo fabrica1 = new FabricaDeVehiculoElectriidad();
        AutomovilElectricidadDTO auto1 = (AutomovilElectricidadDTO) fabrica1.creaAutomovil();
        auto1.setAmperaje("100.6A");
        auto1.setVoltaje("110V");
        auto1.setColor("Rojo");
        auto1.setModelo("2014");
        auto1.setPasajero(6);
        auto1.setPlaca("VDF-456");        
        System.out.println(auto1.toString());
        System.out.println("--------------------------------------");
        ScooterElectricidadDTO scooter1 = (ScooterElectricidadDTO) fabrica1.creaScooter();
        scooter1.setAmperaje("110.7A");
        scooter1.setVoltaje("120v");
        scooter1.setColor("Azul");
        scooter1.setModelo("2015");
        scooter1.setPasajero(6);
        scooter1.setPlaca("ORM-678");        
        System.out.println(scooter1.toString());
        System.out.println("---------------------------------------------");
        
        FabricaVehiculo fabrica2 = new FabricaVehiculoGasolina();
        AutomovilGasolinaDTO auto2 = (AutomovilGasolinaDTO) fabrica2.creaAutomovil();
        auto2.setCapacidadDeTanque("10G");
        auto2.setColor("Amarillo");
        auto2.setModelo("2016");
        auto2.setPasajero(9);
        auto2.setPlaca("JMB-987");
        System.out.println(auto2.toString());
        System.out.println("-----------------------------------------------");
        
        ScooterGasolinaDTO scooter2= (ScooterGasolinaDTO) fabrica2.creaScooter();
        scooter2.setCapacidadDeTanque("5G");
        scooter2.setColor("Negro");
        scooter2.setModelo("2015");
        scooter2.setPasajero(8);
        scooter2.setPlaca("OEM-694");
        System.out.println(scooter2.toString());
        System.out.println("-----------------------------------------------");
        
        
    }
    
}
