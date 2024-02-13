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
public class Enfermera extends Trabajador{
    
    private String hospital;

    public Enfermera(String hospital, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.hospital = hospital;
    }

    
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.hospital);
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
        final Enfermera other = (Enfermera) obj;
        return Objects.equals(this.hospital, other.hospital);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enfermera{");
        sb.append("hospital=").append(hospital);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    //sobreescritura del metodo cotizar
    @Override
    public void cotizar(){
        System.out.println("cotizando como enfermera");
    }
    
    public void ponerVacuna(String nombreVacuna){
        System.out.println(super.getNombre()+ " esta poniendo "+ nombreVacuna);
    }
    
    
}
