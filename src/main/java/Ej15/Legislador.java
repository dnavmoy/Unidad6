/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej15;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class Legislador extends Persona {
    
    private String provincia;
    private String partidoPolitico;

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.provincia);
        hash = 59 * hash + Objects.hashCode(this.partidoPolitico);
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
        final Legislador other = (Legislador) obj;
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return Objects.equals(this.partidoPolitico, other.partidoPolitico);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Legislador{");
        sb.append("provincia=").append(provincia);
        sb.append(", partidoPolitico=").append(partidoPolitico);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public abstract String getCamaraEnQueTrabaja();
    

}