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
public class Main {
    
    
    public static void main(String[] args) {
        
//        Museo museo=new Museo();
//        System.out.println(museo);
//        museo.añadirObra(new ObraArte("MonaLisa","Pintura"));
//         System.out.println(museo);

        List<ObraArte> listaObras
                =new ArrayList();

        listaObras.add(new ObraArte("guernica","pintura"));
        listaObras.add(new ObraArte("cosa rara","escultura"));
        
        Museo reinaSofia= new Museo(
                "reina Sofia", "Castellana 25", 
                new Director("pepe", "123", 10), 
                listaObras);
    }
}
