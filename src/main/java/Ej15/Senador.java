/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej15;

/**
 *
 * @author daniel
 */
public class Senador extends Legislador{
    
    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }
    
    
    

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.complemento) ^ (Double.doubleToLongBits(this.complemento) >>> 32));
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
        final Senador other = (Senador) obj;
        return Double.doubleToLongBits(this.complemento) == Double.doubleToLongBits(other.complemento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNombre()+ " " + super.getApellidos() );
        sb.append(" " + super.getPartidoPolitico() +"  por " + super.getProvincia());
        sb.append(" complemento=").append(complemento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return " Senador ";
    }
    
    
    
    
    
}
