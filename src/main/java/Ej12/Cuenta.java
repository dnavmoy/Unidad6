/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author daniel
 */
public abstract class Cuenta {

   

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;
    private static Set<String> listaNumerosCuenta=new HashSet<>();

    public Cuenta(double saldo, Persona cliente) {
        this.numeroCuenta = obtenerNumeroCuenta();
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Cuenta(Persona cliente) {

        this.numeroCuenta = obtenerNumeroCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }



    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numeroCuenta);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.cliente);
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
        final Cuenta other = (Cuenta) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.numeroCuenta, other.numeroCuenta)) {
            return false;
        }
        return Objects.equals(this.cliente, other.cliente);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double cantidad);
    
    public abstract void ingresar(double cantidad);
    
     public static String obtenerNumeroCuenta() {
        Random r = new Random();
                       
        String numeroTexto = "";
        do {
            numeroTexto = numeroTexto.concat("ES");
            for (int i = 0; i < 18; i++) {
                numeroTexto = numeroTexto.concat(String.valueOf((char) r.nextInt(48, 58)));
            }
        } while (listaNumerosCuenta.contains(numeroTexto));
        listaNumerosCuenta.add(numeroTexto);
        return numeroTexto;
    }

}
