/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCola;



/**
 *
 * @author daniel
 */
public class ClasePila<T> extends PilaCola<T>{

    public ClasePila(int tamMaximo) {
        super(tamMaximo);
    }

     

    

    @Override
    public T pop() {
        if(!estaVacia()){
            return super.getPila().remove(super.getPila().size()-1);     
        }
        return null;

    }

   
}
