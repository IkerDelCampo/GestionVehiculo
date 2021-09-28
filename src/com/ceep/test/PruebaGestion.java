/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;
import com.ceep.domain.Vehiculo;


/**
 *
 * @author Alumno Mañana
 */
public class PruebaGestion {
    public static void main(String[] args) {
        Vehiculo Coche1 = new Vehiculo("12345ABC","KIA","C2","AZUL",2000,true);
        System.out.println(Coche1);
        Coche1.setDisponible(false);
        System.out.println(Coche1);
    }
}
