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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
       
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el limite que desea superar sumando");
        int limit = leer.nextInt();
        int suma = 0;
        int num;
        System.out.println("INGRESE VALORES PARA SUMAR ");
        
        do {
           num = leer.nextInt();
           suma=suma+num;
        } while (limit>suma);
    }
    
}
