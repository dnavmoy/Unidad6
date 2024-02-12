/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComposicionVehiculos;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class  Vehiculo {

    private String matricula;
    private String bastidor;
    private String marca;
    private Double tarifa;

    public Vehiculo(String matricula, String bastidor, String marca, Double tarifa) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.tarifa = tarifa;
    }
    public Vehiculo(){
        
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + Objects.hashCode(this.bastidor);
        hash = 97 * hash + Objects.hashCode(this.marca);
        hash = 97 * hash + Objects.hashCode(this.tarifa);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.tarifa, other.tarifa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", bastidor=").append(bastidor);
        sb.append(", marca=").append(marca);
        sb.append(", tarifa=").append(tarifa);
        sb.append('}');
        return sb.toString();
    }
    
    protected void descontarTarifa(double cantidad){
        this.tarifa-=cantidad;
    }

    public void pasarItv(){
        System.out.println("soy un vehiculo y estoy pasando la itv");
    }
    
    
}
