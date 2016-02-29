/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author MotherFoquita
 */
public class Libreria {
    ArrayList<Libros> libreria = new ArrayList<>();
    Utils util = new Utils();
    
    public void agregar(){
        util.imprime("Titulo del libro");
        String titulo = util.qstring();
        util.imprime("Nombre del autor");
        String autor = util.qstring();
        util.imprime("ISBN del libro");
        String isbn = util.qstring();
        util.imprime("Precio del libro");
        int precio = util.qint();
        util.imprime("Numero de unidades del libro");
        int unidades = util.qint();
        libreria.add(new Libros(titulo, autor, isbn, precio, unidades));
    }
    public void vender(){
        util.imprime("Introduce el isbn del libro que vendes");
        String isbn = util.qstring();
        for (int i=0;i<libreria.size();i++){
            if (libreria.get(i).isbn.compareTo(isbn) == 0){
                if (libreria.get(i).unidades>0) {
                    int unidades = libreria.get(i).unidades;
                    unidades--;
                    libreria.set(i, new Libros(libreria.get(i).titulo,libreria.get(i).autor,libreria.get(i).isbn,libreria.get(i).precio,unidades));
                } else { 
                    util.imprime("Ya no tienes mas unidades de este libro\nNo puedes vender este libro");
                }
            }
        }
    }
    
    public void mostrar(){
        for (int i=0;i<libreria.size();i++){
            util.imprime(libreria.get(i).titulo +", " +libreria.get(i).autor + ", " +libreria.get(i).isbn + ", " +libreria.get(i).precio +", " +libreria.get(i).unidades );
        }
    }
    
        
    
    public void borrarSS(){
        for (int i=0;i<libreria.size();i++){
            if (libreria.get(i).unidades == 0){
                util.imprime("Se ha eliminado el libro: "+libreria.get(i).titulo);
                libreria.remove(i);
                
            }
        }
    }
    
    public void buscar(){
        util.imprime("Introduce el ISBN del libro que quieras buscar");
        String buscar = util.qstring();
        for (int i=0;i<libreria.size();i++){
            if (libreria.get(i).isbn.compareTo(buscar) == 0){
                util.imprime(libreria.get(i).titulo +", " +libreria.get(i).autor + ", " +libreria.get(i).isbn + ", " +libreria.get(i).precio +", " +libreria.get(i).unidades);
            } 
        }
    }  
    
    
    
       
    
    
    
    public void agregarprueba(){
       libreria.add(new Libros("Libro 1", "Autor 1", "ISBN1", 10, 2)); 
       libreria.add(new Libros("Libro 3", "Autor 3", "ISBN3", 50, 3)); 
       libreria.add(new Libros("Libro 2", "Autor 2", "ISBN2", 23, 1)); 
       libreria.add(new Libros("Libro 5", "Autor 5", "ISBN5", 15, 5)); 
    }
    
    
}
