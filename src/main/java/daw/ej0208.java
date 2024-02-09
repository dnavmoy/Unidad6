/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ej0208 {

//    2 versiones: iterativa y recursiva
//->pedir palabra y ver si es palindromo 
//-> version iterativa: recorrer la palabra por la izquiera y derecha y juntar en el centro
//-> idem en version recursiva
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("introduce palabra");
        JOptionPane.showMessageDialog(null, palabra + " es palindromo: " + palindromoReiterativo(palabra));
        palindromoRecursivo(palabra, 0);

    }

    public static boolean palindromoReiterativo(String palabra) {
        boolean devolver = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == palabra.charAt(palabra.length() - i - 1)) {
                devolver = true;
            } else {
                devolver = false;
                i = palabra.length();
            }
        }
        return devolver;
    }

    public static int palindromoRecursivo(String palabra, int posicion) {

        if (palabra.charAt(posicion) != palabra.charAt(palabra.length() - posicion - 1)) {

            JOptionPane.showMessageDialog(null, "la palabra : " + palabra + " no es palindromo");

        } else if (posicion < palabra.length()-1) {
            palindromoRecursivo(palabra, ++posicion);
            //return posicion;
        } else {
            JOptionPane.showMessageDialog(null, "la palabra es palindromo");
        }

        return posicion;
    }

}
