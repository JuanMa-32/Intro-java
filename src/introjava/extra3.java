/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
         */
         Scanner leer = new Scanner (System.in);
    
        System.out.println("INGRESE UNA LETRA:");
        String letra = leer.next();
        
        switch (letra.toUpperCase()){
            case "A":
                System.out.println(letra+" ES VOCAL");
                break;
            case "E":
                System.out.println(letra+" ES VOCAL");
                break;
            case "I":
                System.out.println(letra+" ES VOCAL");
                break;
            case "O":
                System.out.println(letra+" ES VOCAL");
                break;
            case "U":
                System.out.println(letra+" ES VOCAL");
                break;
            default:
                System.out.println(letra+" NO ES VOCAL");
                
        }
        
    }
}


