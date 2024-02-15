/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej12;

import java.util.ArrayList;




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
        
        CuentaAhorro ahorroPrimera= new CuentaAhorro(0.02, 0.001, pepe);
        CuentaAhorro ahorroSegunda= new CuentaAhorro(0.02, 0.001, pepe);      
        CuentaAhorro ahorroTercera= new CuentaAhorro(0.01, 0.01, 50, pepe);
        ArrayList<Cuenta> listadoCuentas= new ArrayList<>();
        listadoCuentas.add(primera);
        listadoCuentas.add(segunda);
        listadoCuentas.add(tercera);
        listadoCuentas.add(ahorroPrimera);
        listadoCuentas.add(ahorroSegunda);
        listadoCuentas.add(ahorroTercera);
        
        
        primera.ingresar(15000);
        primera.setSaldoMin(500);
        for(Cuenta cuenta: listadoCuentas){
            System.out.println(cuenta);
        }
        
        
        
        for(Cuenta cuenta: listadoCuentas){
            cuenta.actualizarSaldo();
            if(cuenta instanceof CuentaAhorro){
                ((CuentaAhorro) cuenta).quitarComision();
            }
        }
                
        

       
        
        primera.retirar(150);
        System.out.println(primera);
        primera.actualizarSaldo();
        System.out.println("actualizar saldo "+ primera);
        
        
    
  

        
    }
}
