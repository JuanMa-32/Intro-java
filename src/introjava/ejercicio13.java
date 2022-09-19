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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
        */
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la cantidad de elementos ");
        int cantidad = leer.nextInt();
        
      
        for (int i = 0; i < cantidad; i++) {
          
            System.out.print("*");
        }
           System.out.println(" ");
                 for (int i = 0; i < cantidad-2; i++) {
                System.out.print("*");
                for (int j = 0; j < cantidad-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
        }
           
            for (int i = 0; i < cantidad; i++) {
          
            System.out.print("*");
        }
            System.out.println("");
      
            
   }
           
}
    

