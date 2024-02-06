/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Ej0206 {
    
    public static void main(String[] args) {
        
        ArrayList<Character> listaChar=new ArrayList<>();
        for(int i =65; i<91;i++){
            listaChar.add((char)i);
        }
        
        int[] listaInt=new int[50];
        for(int i =0; i<50;i++){
            listaInt[i]=i;
        }
        
        recorrerArray(listaChar,-5);
        System.out.println("suma lista " + sumarArray(listaInt, 0));
        
        
    }
    
    public static void recorrerArray(ArrayList lista,int posicion){
        if(posicion>=lista.size()){
            System.out.println(" fin de lista");
        }else if (posicion<0){
            posicion=0;
            System.out.println("posicion menor a 0 -> la pongo en 0");
            recorrerArray(lista, posicion);
        }else {
            
            System.out.println(lista.get(posicion++));
            recorrerArray(lista, posicion);
            
        }
        
        
        
    }
    
    public static int sumarArray(int[] lista,int posicion){
        
        if(posicion<0||posicion==lista.length){
            System.out.println("fuera de lista");
            
        } else{
           
           return lista[posicion++]+sumarArray(lista, posicion);
            
        }
        return 0;
    }
    
    
    
}
