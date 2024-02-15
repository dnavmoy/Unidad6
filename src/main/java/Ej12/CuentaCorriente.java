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
    
    private final double INTERES=0.015;
    private double saldoMin;

    public CuentaCorriente(double saldo, Persona cliente) {
        super(saldo, cliente);
        
    }
    
    public CuentaCorriente(Persona cliente){
        super(cliente);
        this.saldoMin=0;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.INTERES) ^ (Double.doubleToLongBits(this.INTERES) >>> 32));
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
        if (Double.doubleToLongBits(this.INTERES) != Double.doubleToLongBits(other.INTERES)) {
            return false;
        }
        return Double.doubleToLongBits(this.saldoMin) == Double.doubleToLongBits(other.saldoMin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCorriente{");
        sb.append("INTERES=").append(INTERES);
        sb.append(", saldoMin=").append(saldoMin);
        sb.append(", saldo=").append(getSaldo());
        sb.append('}');
        return sb.toString();
    }


    
    
    
    
    
    
    @Override
    public void actualizarSaldo() {
    if(this.getSaldo()<1000){
         this.setSaldo(this.getSaldo()+this.getSaldo()*INTERES);
    }else{
        this.setSaldo(this.getSaldo()+saldoMin*INTERES);
    }
    }

    @Override
    public void retirar(double cantidad) {
        if((this.getSaldo()-cantidad)<saldoMin){
            System.out.println("saldo inferior al minimo, no se puede retirar");
        }else{
            //this.saldo+=this.saldo-cantidad;
        this.setSaldo(this.getSaldo()-cantidad);
            System.out.println(cantidad+"€ retirados, saldo nuevo: " + this.getSaldo());
        }
    }
    
    
     @Override
    public void ingresar(double cantidad) {
        this.setSaldo(this.getSaldo()+cantidad);
        System.out.println(cantidad+"€ ingresados, saldo nuevo: " + this.getSaldo());
    }

    public double getInteres() {
        return INTERES;
    }

  
    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }
    
}
