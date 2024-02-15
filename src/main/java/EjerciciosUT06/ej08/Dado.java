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
public class Dado extends Azar{

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    
    
    @Override
    public int lanzar() {
        Random r = new Random();
     return r.nextInt(posibilidades+1);
    }
    
}
