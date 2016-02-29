/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salir=0;
        Utils util = new Utils();
        Libreria libreria = new Libreria();
        //Agregamos libros de prueba
        libreria.agregarprueba();
        //
        
        util.imprime("Bienvenido, aqui podrás mantener la gestion de tu libreria\nQue necesitas?\n Añadir libros (Opcion 1)\n Vender libros (Opcion 2)\n Mostrar los libros que tienes (Opcion 3)\n Borrar los libros que ya no tengas en stock (Opcion 4)\n Ver los detalles de un libro (Opcion 5)\n Salir del programa de gestion (Opcion 0)");
       do {
        util.imprime("Elige tu opcion");
        Scanner OpcionTeclado = new Scanner(System.in);
        int Opcion = OpcionTeclado.nextInt();
        switch (Opcion){
            case 1:
                util.imprime("Vamos a agregar un libro");
                libreria.agregar();
                break;
            case 2:
                util.imprime("Vamos a vender un libro");
                libreria.vender();
                break;
            case 3:
                libreria.mostrar();
                break;
            case 4:
                util.imprime("Se van a borrar todos los libros de los que ya no tengamos stock");
                libreria.borrarSS();
                break;
            case 5:
                util.imprime("Vamos a buscar un libro en concreto");
                libreria.buscar();
                break;
            case 0:
                util.imprime("Gracias por usar el programa de gesiton\nAdios!");
                salir = 1;
                break;
            default:     
                util.imprime("Opcion incorrecta, vuelve a probar gracias");
                break;    
                
            
        } } while (salir==0);        
    }
    
}
