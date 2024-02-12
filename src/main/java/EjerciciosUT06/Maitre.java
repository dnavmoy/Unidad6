/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT06;

/**
 *
 * @author daniel
 */
public class Maitre extends Camarero {
    
    private int antiguedad;

    public Maitre(int antiguedad, String rango, String nombre, String apellido1, String NIF) {
        super(rango, nombre, apellido1, NIF);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.antiguedad;
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
        final Maitre other = (Maitre) obj;
        return this.antiguedad == other.antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Maitre{");
        sb.append("antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }


     @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Maitre");
    }
    
    
    
    
}
