/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Dan_n
 */
public class Ejemplo {
    
    // Muestra los datos de los productos usando un foreach. 
    //la lista tiene un metodo para recorrerla: foreach.
    //con una expresion lamda podemos por ejemplo mostrar los valores
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());
        });

    //for para recorrer listas. expresion que no me acuerdo del nombre, tipo/clase
    //nombre que le das, dos puntos y la lista que recorres
    
    for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p);
            }

        }
    
    
    // expersion lamda para ahorrarse crear una clase nueva, se comparan productos p1 y p2
    // y se guarda en un objeto comparator que se puede usar en otras cosas como el sort o el 
    // binarySearch
    
    Comparator<Producto> comparadorPrecio = ((Producto p1, Producto p2)
                -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        listaProductos.sort(comparadorPrecio);
        System.out.println("ordenado por precio");
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());
        });
    
    // busqueda binaria, devuelve un entero con la posicion, segun la lista, un objeto ejemplo con lo que 
        //quieras encontrar y una forma de ordenarlo al ser busqueda binaria. -> debe estar ordenador segun
        //el atributo que quieras encontrar
        
        int encontrar = Collections.binarySearch(listaProductos,
                new LibroDigital(0, "", 1004, 0, 0, ""),
                comparadorCodigo);

        System.out.println(encontrar);
        
        
        // añade ejemplo con arraylist set y maps!!
        
        
        
        
        //implmementa el comparador por defecto en la clase -> 
        
        implements Comparable<Libro>
        
        
         @Override
    public int compareTo(Libro o) {
        return this.getISBN().compareTo(o.getISBN());
        
        //se puede usar directamente: (un array de libros: listaLibros)
        Collections.sort(listaLibros);
    }
    
    
        
}
