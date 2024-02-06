/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComposicionClases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Museo {  //clase contenedora
    
    
    //clases contenidas
    private String nombre;
    private String direccionPostal;
    private Director director;
    private List<ObraArte> listaObras;
    
    public Museo(){
               
        this.nombre="Reina Sofia";
        this.direccionPostal="Castellana, 23";
        
        this.director= new Director("periquito de los palotes", "123",2000);
        this.listaObras= new ArrayList();
        rellenarListaObras();
    }

    
    //principio solid para evitar errores si cambian las clases, se inicializan
    //las clases metiendo los parametros creando los nuevos objetos fuera de la clase
    public Museo(String nombre, String direccionPostal, Director director, List<ObraArte> listaObras) {
        this.nombre = nombre;
        this.direccionPostal = direccionPostal;
        this.director = director;
        this.listaObras = listaObras;
    }
    
    
    
    
    
    //composicion fuerte el director y la lista de obras solo exiten en el museo
    //a haber sido creadas en su constructor
    public Museo(String nombre, String direccion){
        
        this.nombre=nombre;
        this.direccionPostal=direccion;
                
        //this.nombre="Reina Sofia";
        //this.direccionPostal="Castellana, 23";
        
        this.director= new Director("periquito de los palotes", "123",2000);
        this.listaObras= new ArrayList();
    }
    
    private void rellenarListaObras(){
        
        this.listaObras.add(new ObraArte("guernica","pintura"));
         this.listaObras.add(new ObraArte("cosa rara","escultura"));
    }
    
    
    public void añadirObra(ObraArte obra){
        this.listaObras.add(obra);
    }
    
    public void quitarObra(ObraArte obra){
        this.listaObras.remove(obra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccionPostal=").append(direccionPostal);
        sb.append(", director=").append(director);
        sb.append(", listaObras=").append(listaObras);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public Director getDirector() {
        return director;
    }

    public List<ObraArte> getListaObras() {
        return listaObras;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
    
}
