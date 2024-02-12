/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Ej0209 {
//    
//    -{7,9,10,5,3,7,7,9,10,1,5,4}
//lista de numeros
//a.- obtener una estructura de datos que indique,para cada nº cuantas veces se repite
//b.- metodo que devuelve la lista sin duplicados
//c.- metodo recursivo que devuelve la posicion del elemento que estoy buscando o 
//        un -1 si no está (una busqueda vamos) sobre la lista sin duplicados
    
    public static void main(String[] args) {
        
        int[] listaNumeros={7,9,10,5,3,7,7,9,10,1,5,4};
                
        Map<Integer,Integer> repetidos=metodoA(listaNumeros);
        repetidos.forEach((k,v)->System.out.println("numero " + k + " repetido "+ v+ " veces"));
        ArrayList<Integer> sinRepetidos = metodoB(listaNumeros);
        System.out.println("lista metodos b");
        sinRepetidos.forEach((k)->System.out.println(k));
        System.out.println("metodo c");
        System.out.println(metodosC(sinRepetidos,11, 0));
        
    }
    

    
    public static Map metodoA(int[] lista){
        
        Map<Integer,Integer> repetidos=new HashMap<>();
        for(int i=0;i<lista.length;i++){
            if(repetidos.containsKey(lista[i])){
                repetidos.replace(lista[i], (repetidos.get(lista[i])+1));
            }else{
                repetidos.put(lista[i], 1);
            }
        }
        
        return repetidos;
    }
    
    public static ArrayList metodoB(int[] lista){
        
        Set<Integer> repetidos = new HashSet<>();
        
        for(int i =0; i<lista.length;i++){
            for(int j=0;j<lista.length;j++){
                if(lista[i]==lista[j]){
                    repetidos.add(lista[i]);
                }
            }
            
        }   
        ArrayList<Integer> array= new ArrayList<>();
        repetidos.forEach((k)->array.add(k));
        
        
        return array;
    }
    
    public static int metodosC(ArrayList<Integer> lista,int numero,int posicion){
        
        
        if(lista.get(posicion)==numero){            
            return posicion;
        }    else if (posicion==lista.size()-1){
            return -1;
        }else{
            return metodosC(lista,numero,++posicion);
        }
        
        
            
        
    }
    
}
