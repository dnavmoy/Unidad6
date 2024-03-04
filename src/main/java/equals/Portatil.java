package equals;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Portatil extends Ordenador{
    
    private boolean tecladoExtraible;

    public Portatil(boolean tecladoExtraible, double precio, String marca) {
        super(precio, marca);
        this.tecladoExtraible = tecladoExtraible;
    }

    public Portatil(boolean tecladoExtraible) {
        this.tecladoExtraible = tecladoExtraible;
    }

    public boolean isTecladoExtraible() {
        return tecladoExtraible;
    }

    public void setTecladoExtraible(boolean tecladoExtraible) {
        this.tecladoExtraible = tecladoExtraible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.tecladoExtraible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Portatil other = (Portatil) obj;
        return this.tecladoExtraible == other.tecladoExtraible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Portatil{");
        sb.append("tecladoExtraible=").append(tecladoExtraible);
        sb.append('}');
        return sb.toString();
    }

  
    
    
}
