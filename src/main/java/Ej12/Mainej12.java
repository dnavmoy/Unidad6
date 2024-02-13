/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Mainej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Persona pepe = new Persona("pepe", "garcia", "123");
        CuentaCorriente primera=new CuentaCorriente(pepe);
        CuentaCorriente segunda=new CuentaCorriente(pepe);
        CuentaCorriente tercera=new CuentaCorriente(pepe);
       
        System.out.println(primera);
        System.out.println(segunda);
        System.out.println(tercera);
        
        
        
//        boolean repetir = true;
//        Set<String> listadoCuentas = new HashSet();
//        do {
//            if (!listadoCuentas.contains(numeroTexto)) {
//                listadoCuentas.add(numeroTexto);
//                repetir = false;
//            }
//        } while (repetir);

        
    }
    
}
