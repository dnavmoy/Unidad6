/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author daniel
 */
public class paraProbar {
 
    
    public static void main(String[] args) {
        
        System.out.println("factorial de 4 "+ factorial(4));
    }
    
    public static int factorial(int numero){
        int total=1;
        for(int i=1;i<=numero;i++){
            total*=i;
        }
        return total;
    }
    
    
    public static int factorialRecursivo(int numero){
        
        
        return numero;
    }
    
    
}
