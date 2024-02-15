/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej12;

/**
 *
 * @author daniel
 */
public class CuentaAhorro extends Cuenta{
    
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual,double saldo, Persona cliente) {
        super(saldo, cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo() {
        this.setSaldo(this.getSaldo()+(this.getSaldo()*interes)-comisionAnual);
    }

    @Override
    public void retirar(double cantidad) {
        if((this.getSaldo()-cantidad)<0){
            System.out.println("saldo inferior al minimo, no se puede retirar");
        }else{
        this.setSaldo(this.getSaldo()-cantidad);
            System.out.println(cantidad+"€ retirados, saldo nuevo: " + this.getSaldo());
        }
    }
    
    public void quitarComision(){
        this.comisionAnual=0;
    }

    @Override
    public void ingresar(double cantidad) {
        this.setSaldo(this.getSaldo()+cantidad);
        System.out.println(cantidad+"€ ingresados, saldo nuevo: " + this.getSaldo());
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.interes) ^ (Double.doubleToLongBits(this.interes) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.comisionAnual) ^ (Double.doubleToLongBits(this.comisionAnual) >>> 32));
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
        final CuentaAhorro other = (CuentaAhorro) obj;
        if (Double.doubleToLongBits(this.interes) != Double.doubleToLongBits(other.interes)) {
            return false;
        }
        return Double.doubleToLongBits(this.comisionAnual) == Double.doubleToLongBits(other.comisionAnual);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaAhorro{");
        sb.append("interes=").append(interes);
        sb.append(", comisionAnual=").append(comisionAnual);
        sb.append('}');
        return sb.toString();
    }
 
    
    
}
