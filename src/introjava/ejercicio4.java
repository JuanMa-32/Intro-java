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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        double grados = leer.nextDouble();
        double far = 32 + (9 * grados / 5);
        
        System.out.println("la temperatura en grados fahrenheit es: "+far+"ºF");
    }
    
}
