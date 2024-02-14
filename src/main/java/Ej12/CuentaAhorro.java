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

    public CuentaAhorro(double interes, double comisionAnual, String numeroCuenta, double saldo, Persona cliente) {
        super(numeroCuenta, saldo, cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente,String numeroCuenta) {
        super(cliente,numeroCuenta);
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

    @Override
    public void ingresar(double cantidad) {
        this.setSaldo(this.getSaldo()+cantidad);
        System.out.println(cantidad+"€ ingresados, saldo nuevo: " + this.getSaldo());
    }
 
    
    
}
