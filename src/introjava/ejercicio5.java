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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
         */
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un numero para calcular su DOBLE,TRIPLE y RAIZ CUADRADA");
        int num = leer.nextInt();
        System.out.println("DOBLE: "+num*2);
        System.out.println("TRIPLE: "+num*3);
        System.out.println("RAIZ CUADRADA: "+Math.sqrt(num));
        
    }
    
}
