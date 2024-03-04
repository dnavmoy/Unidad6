/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class ClasePila {

    private final int tamMaximo;
    private final ArrayList<String> Pila;

    public ClasePila(int tamMaximo) {
        this.tamMaximo=tamMaximo;
        this.Pila = new ArrayList<>(tamMaximo);
    }

    public ArrayList<String> getPila() {
        return Pila;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.tamMaximo;
        hash = 59 * hash + Objects.hashCode(this.Pila);
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
        final ClasePila other = (ClasePila) obj;
        if (this.tamMaximo != other.tamMaximo) {
            return false;
        }
        return Objects.equals(this.Pila, other.Pila);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClasePila{\n");
         for(String p : this.Pila){
            System.out.println(p);
            sb.append("objeto ").append(p+ "\n"); 
        }
        sb.append('}');
        return sb.toString();
    }

    public void add(String objeto) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(objeto);
        }

    }

    public void push(String objeto) {
        if (this.Pila.size() < tamMaximo) {
            this.Pila.add(objeto);
        }

    }

    public String pop() {
        String devolver = this.Pila.get(this.Pila.size() - 1);
        this.Pila.remove(this.Pila.size() - 1);
        return devolver;

    }

    public boolean estaVacia() {

        if (this.Pila.size() <= 0) {
            return true;
        }
        return false;
    }
    
    public boolean estaLlena() {

        if (this.Pila.size()>=tamMaximo) {
            return true;
        }
        return false;
    }

    
    public int numeroElementos(){
        return this.Pila.size();
    }
    
    public int numeroMaximo(){
        return tamMaximo;
    }
}
