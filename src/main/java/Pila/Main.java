/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;



/**
 *
 * @author daniel
 */
public class Main {
    
    //constructor con tamaño maximo
    //añadir elementos
    //sacar elementos
    //saber si esta vacia
    //saber si esta llena
    // to string
    //saber nº de elementos
    //saber nº max de elementos
    
  
   
    public static void main(String[] args) {
        
        ClasePila pila = new ClasePila(6);
        
        pila.add("hola");
        pila.add("hole");
        pila.add("holi");
        pila.add("holo");
        pila.add("holu");
        pila.add("holaa");
        pila.add("holae");
        pila.add("holai");
        pila.add("holao");
        
        
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
         System.out.println("pila esta llena?:" + pila.estaLlena());
        
        String devuelto = pila.pop();
        
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("pila esta vacia?:" + pila.estaVacia());
        System.out.println("pila esta llena?:" + pila.estaLlena());
        
        System.out.println("to string: ");
        System.out.println(pila);
     
        
        System.out.println("numero maximo de elementos : " + pila.numeroMaximo());
        System.out.println("numero de eleentos : " + pila.numeroElementos());
        
        
    }
   
    
    
}
