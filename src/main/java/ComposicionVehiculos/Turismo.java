/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComposicionVehiculos;

/**
 *
 * @author daniel
 */


//clase turismo hereda de vehiculo, Turismo es la subclase y vehiculo es la superclase

public class Turismo extends Vehiculo {
 
    
    //atributo de turismo, no lo tiene vehiculo
    private int numeroPuertas;

    public Turismo(int numeroPuertas, String matricula, String bastidor, String marca, Double tarifa) {
        //llamada al constructor de vehiculos(string,string,string,double)
        super(matricula, bastidor, marca, tarifa);
        //una vez creado se inicializan los atributos propios del turismo
        this.numeroPuertas = numeroPuertas;
    }
    
    public Turismo(){
        //la llamada al constructor sin parametros esta implicita
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numeroPuertas;
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
        final Turismo other = (Turismo) obj;
        return this.numeroPuertas == other.numeroPuertas;
    }

    @Override
    public String toString() {
        return "\nTurismo{" + "numeroPuertas=" + numeroPuertas +" " + super.getMarca() + " }";
    }
    
    public void añadirRuedaRepuesto(){
        System.out.println("añadiendo rueda");
    }
    
}
