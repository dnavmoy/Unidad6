/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCola;





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
        
        ClasePila<String> pila = new ClasePila(6);
        
        pila.add("hola");
        pila.add("hole");
        pila.add("holi");
        pila.add("holo");
        pila.add("holu");
        pila.add("holaa");
        pila.add("holae");
        pila.add("holai");
        pila.add("holao");
        
        System.out.println("Comprobar que se ha añadido los elementos a la pila de tamaño 6");
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("he tratado de añadir 9 elementos y solo ha añadido 6");
        
        
        System.out.println("pila esta llena?:" + pila.estaLlena());
        
        System.out.println("sacamos un elemento, comprogar cual es y como queda la "
                + "pila despues");
        String devuelto = pila.pop();
        System.out.println("Devuelto: " +devuelto);
        
        for(String p : pila.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("pila esta vacia?:" + pila.estaVacia());
        System.out.println("pila esta llena?:" + pila.estaLlena());
        
        System.out.println("to string: ");
        System.out.println(pila);
     
        
        System.out.println("numero maximo de elementos : " + pila.numeroMaximo());
        System.out.println("numero de eleentos : " + pila.numeroElementos());
        
        System.out.println("\n\nahora con lista FIFO\n\n");
        
        ClaseCola<String> pilaFIFO = new ClaseCola<>(6);
        
        
        pilaFIFO.add("hola");
        pilaFIFO.add("hole");
        pilaFIFO.add("holi");
        pilaFIFO.add("holo");
        pilaFIFO.add("holu");
        pilaFIFO.add("holaa");
        pilaFIFO.add("holae");
        pilaFIFO.add("holai");
        pilaFIFO.add("holao");
        
        
        System.out.println("Comprobar que se ha añadido los elementos a la pila de tamaño 6");
        for(String p : pilaFIFO.getPila()){
            System.out.println(p);
                    
        }
        System.out.println("he tratado de añadir 9 elementos y solo ha añadido 6");
        
         System.out.println("Cola esta llena?:" + pilaFIFO.estaLlena());
        
         
         System.out.println("sacamos un elemento, comprogar cual es y como queda la "
                + "pila despues");
         
        String devuelto2 = pilaFIFO.pop();
        System.out.println("devuelto 2 : " + devuelto2);
        
        for(String p : pilaFIFO.getPila()){
            System.out.println(p);
                    
        }
        
        System.out.println("pilaFIFO esta vacia?:" + pilaFIFO.estaVacia());
        System.out.println("pilaFIFO esta llena?:" + pilaFIFO.estaLlena());
        
        System.out.println("to string: ");
        System.out.println(pilaFIFO);
     
        
        System.out.println("numero maximo de elementos : " + pilaFIFO.numeroMaximo());
        System.out.println("numero de eleentos : " + pilaFIFO.numeroElementos());
        
        
    }
   
    
    
}
