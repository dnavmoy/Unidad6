/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComposicionClases;

/**
 *
 * @author daniel
 */
public class Director { //clase Contenedora
    
    
    private String nombre;//clases contenidas son dos atributos tipo string
    private String nif;
    private double sueldo;

    public Director(String nombre, String nif,double sueldo) {
        this.nombre = nombre;
        this.nif = nif;
        this.sueldo=sueldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director{");
        sb.append("nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
