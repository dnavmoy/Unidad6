/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComposicionVehiculos;

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("123", "456Y", "citroen", 23.56);
        System.out.println(v1);
        
        Turismo t1= new Turismo(8, "888", "999P", "Renault", 10.6);
        System.out.println(t1);
        
        t1.descontarTarifa(0);//este metodo es de vehiculo
        t1.añadirRuedaRepuesto();//este metodo es de turismo
        v1.descontarTarifa(0);//metodo de vehiculo
        //v1 no tiene acceso a los metodos de turismo
    }
    
}
