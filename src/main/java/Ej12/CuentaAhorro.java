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

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double retirar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
    
}
