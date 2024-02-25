/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej15;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author daniel
 */
public class PruebaLegislador {
    
    public static void main(String[] args) {
        
        ArrayList<Legislador> listaLegisladores= new ArrayList<>();
        
        listaLegisladores.add(new Diputado(1, "malaga", "ppsoe", "pepe", "garcia"));
        listaLegisladores.add(new Diputado(2, "Sevilla", "ppsoe", "juan", "Alvarez"));
        listaLegisladores.add(new Diputado(1, "Huelva", "Box", "luis", "fernandez"));
        listaLegisladores.add(new Senador(250, "malaga", "restar", "Teresa", "salas"));
        listaLegisladores.add(new Senador(250, "Cadiz", "Falange", "Luisa", "Alcantara"));
        
        for (Iterator<Legislador> iterator = listaLegisladores.iterator(); iterator.hasNext();) {
            Legislador next = iterator.next();
            System.out.println(next.getCamaraEnQueTrabaja());
            System.out.println(next);
            
        }
        
    }
    
}
