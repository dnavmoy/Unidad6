/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

/**
 *
 * @author daniel
 */
public abstract class Figura {
    
    private double base;
    private double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public abstract double calcularArea();
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.base) ^ (Double.doubleToLongBits(this.base) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (Double.doubleToLongBits(this.base) != Double.doubleToLongBits(other.base)) {
            return false;
        }
        return Double.doubleToLongBits(this.altura) == Double.doubleToLongBits(other.altura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
