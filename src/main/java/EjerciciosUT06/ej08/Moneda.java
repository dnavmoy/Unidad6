/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT06.ej08;

import java.util.Random;

/**
 *
 * @author daniel
 */
public class Moneda extends Azar{

    public Moneda(int posibilidades) {
        super(posibilidades);
    }



    
    @Override
    public int lanzar() {
        Random r = new Random();
        return r.nextInt(1,posibilidades+1);
    }
 
    
    
}
