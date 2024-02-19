/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej15;

/**
 *
 * @author daniel
 */
public class Diputado extends Legislador{
    
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.numeroAsiento;
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
        final Diputado other = (Diputado) obj;
        return this.numeroAsiento == other.numeroAsiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("numeroAsiento=").append(numeroAsiento);
        sb.append(super.getNombre()+ " " + super.getApellidos() );
        sb.append(" " + super.getPartidoPolitico() +"  por " + super.getProvincia());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
    }
    
    
    
}
