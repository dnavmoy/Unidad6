/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUT06;

/**
 *
 * @author daniel
 */
public class Profesor extends Trabajador implements CursoReciclado{

    public Profesor(String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
    }

    
    
    
    @Override
    public void cotizar() {
        System.out.println("profesor");
    }

    @Override
    public void hacerCurso(int numeroHoras) {
        System.out.println("Muy bien aunque sea de dos horas te voy a subir 1000€");
    }
    
    
}
