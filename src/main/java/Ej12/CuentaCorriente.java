/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

/**
 *
 * @author daniel
 */
public class CuentaCorriente extends Cuenta{
    
    private double interes;
    private double saldoMin;

    public CuentaCorriente(String numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        
    }
    
    public CuentaCorriente(Persona cliente){
        super(cliente);
        this.interes=0.0;
        this.saldoMin=0;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.interes) ^ (Double.doubleToLongBits(this.interes) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.saldoMin) ^ (Double.doubleToLongBits(this.saldoMin) >>> 32));
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
        final CuentaCorriente other = (CuentaCorriente) obj;
        if (Double.doubleToLongBits(this.interes) != Double.doubleToLongBits(other.interes)) {
            return false;
        }
        return Double.doubleToLongBits(this.saldoMin) == Double.doubleToLongBits(other.saldoMin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("interes=").append(interes);
        sb.append(", saldoMin=").append(saldoMin);
        sb.append("numero cuenta" ).append(this.getNumeroCuenta());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    @Override
    public void actualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double retirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }
    
}
