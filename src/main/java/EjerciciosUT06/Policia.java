/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT06;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public class Policia extends Trabajador{
    
    private String numeroPlaca;

    public Policia(String numeroPlaca, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.numeroPlaca);
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
        final Policia other = (Policia) obj;
        return Objects.equals(this.numeroPlaca, other.numeroPlaca);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Policia{");
        sb.append("numeroPlaca=").append(numeroPlaca);
        sb.append("nombre=").append(this.getNombre());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void cotizar() {
        System.out.println("cotizando como policia");
    }
    
    public void ponerDenuncia(){
        System.out.println("El policia esta poniendo una denuncia");
    }
    

    
    
}
