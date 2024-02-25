/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author daniel
 */
public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo{");
        sb.append("base ").append(this.getBase());
        sb.append("altura ").append(this.getAltura());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularArea() {
        double area=0;
       return area=this.getBase()*this.getAltura();
        
    }

    
    
    
    
    
    
}
