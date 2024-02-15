/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosUT06.ej08;

/**
 *
 * @author daniel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Moneda euro = new Moneda(2);
        Dado blanco = new Dado(6);
        System.out.println(euro.lanzar());
        System.out.println(blanco.lanzar());
        
        
        
    }
    
}
