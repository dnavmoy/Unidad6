/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej12;

import java.util.HashSet;
import java.util.Random;
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
        
        HashSet listadoCuentas = new HashSet();
        
        Persona pepe = new Persona("pepe", "garcia", "123");
        String prueba = obtenerNumeroCuenta(listadoCuentas);
        CuentaCorriente primera=new CuentaCorriente(pepe, obtenerNumeroCuenta(listadoCuentas));
        CuentaCorriente segunda=new CuentaCorriente(pepe,obtenerNumeroCuenta(listadoCuentas));
        CuentaCorriente tercera=new CuentaCorriente(pepe,obtenerNumeroCuenta(listadoCuentas));
        
        CuentaAhorro ahorroPrimera= new CuentaAhorro(0.02, 0.001, pepe, obtenerNumeroCuenta(listadoCuentas));
        CuentaAhorro ahorroSegunda= new CuentaAhorro(0.02, 0.001, pepe, obtenerNumeroCuenta(listadoCuentas));      
        System.out.println(primera);
        System.out.println(segunda);
        System.out.println(tercera);
        System.out.println(ahorroPrimera);
        System.out.println(ahorroSegunda);
        primera.ingresar(15000);
        primera.setSaldoMin(500);
        primera.retirar(150);
        System.out.println(primera);
        primera.actualizarSaldo();
        System.out.println("actualizar saldo "+ primera);
        
        
    
  

        
    }
       public static String obtenerNumeroCuenta(HashSet listadoCuentas) {
        Random r = new Random();
        String numeroTexto = "";
        
        
        do{
        numeroTexto=numeroTexto.concat("ES");
        for (int i = 0; i < 18; i++) {
           numeroTexto = numeroTexto.concat(String.valueOf((char) r.nextInt(48, 58)));
                   }
        }while(listadoCuentas.contains(numeroTexto));
        return numeroTexto;
    }
}
