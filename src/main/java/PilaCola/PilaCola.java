/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PilaCola;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class PilaCola<T> {
    
    private final int tamMaximo;
    private final ArrayList<T> Pila;

    public PilaCola(int tamMaximo) {
        this.tamMaximo = tamMaximo;
        this.Pila = new ArrayList<>();
    }

    public int getTamMaximo() {
        return tamMaximo;
    }

    public ArrayList<T> getPila() {
        return Pila;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.tamMaximo;
        hash = 47 * hash + Objects.hashCode(this.Pila);
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
        final PilaCola<?> other = (PilaCola<?>) obj;
        if (this.tamMaximo != other.tamMaximo) {
            return false;
        }
        return Objects.equals(this.Pila, other.Pila);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PilaCola{");
        sb.append("tamMaximo=").append(tamMaximo);
        sb.append(", Pila=").append(Pila);
        sb.append('}');
        return sb.toString();
    }
    
    public boolean estaVacia() {
        return Pila.isEmpty();

    }
    
     public boolean estaLlena() {        
        if (this.Pila.size() >= tamMaximo) {
            return true;
        }
        return false;
    }

    public int numeroElementos() {
        return this.Pila.size();
    }

    public int numeroMaximo() {
        return tamMaximo;
    }
    
    public boolean add(T t) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(t);
            return true;
        }
        return false;
    }
    
    public abstract  T pop();
    
    
}
