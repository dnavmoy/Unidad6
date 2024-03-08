/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCola;



/**
 *
 * @author daniel
 */
public class ClaseCola<T> extends PilaCola<T>{

    public ClaseCola(int tamMaximo) {
        super(tamMaximo);
    }

   
    @Override
    public T pop() {
        if (!estaVacia()) {
            T devolver = super.getPila().get(0);
            super.getPila().remove(0);
            return devolver;

        }
        return null;

    }

}
