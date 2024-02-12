/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ComposicionVehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //como es clase abstracta no puedo crearlo
        //Vehiculo v1 = new Vehiculo("123", "456Y", "citroen", 23.56);
        //System.out.println(v1);
        
                      
        
        Turismo t1= new Turismo(8, "888", "999P", "Renault", 10.6);
        System.out.println(t1);
        
        Furgoneta f1 = new Furgoneta(100.0, "333", "333E", "Peugeot", 12.9);
        System.out.println(f1);
        //cuando uso la variable dela subclase 
        //tengo acceso a metodos publicos de la superclase
        
        t1.descontarTarifa(0);//este metodo es de vehiculo
        t1.añadirRuedaRepuesto();//este metodo es de turismo
        f1.aumentarCarga(10);
        //v1.descontarTarifa(0);//metodo de vehiculo
        //v1 no tiene acceso a los metodos de turismo
        
        List<Vehiculo> lista= new ArrayList<>();
        //conversiones implicitas. Casting Implicito
        //aunque la variable sea turismo o furgoneta, la estoy apuntando por vehiculo
        //lo que implica que solo tengo acceso a los metodos de vehiculo
        //lista.add(v1);
        lista.add(t1);
        lista.add(f1);
        
        System.out.println("lista de vehiculos---------------");
       for(Vehiculo v:lista){
           //metodo polimorfico toString
           //En funcion del tipo al que apunte se ejecunta un codigo u otro
           System.out.println(v.toString());
           if(v instanceof Turismo){
               ((Turismo) v).añadirRuedaRepuesto();
           }
           v.pasarItv();
        
        
          }
    }
}
