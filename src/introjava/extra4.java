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
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
   Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.

         */
        Scanner leer = new Scanner (System.in);
        
            System.out.println("ingrese un numero entre 1 y 10 ");
            int num = leer.nextInt();
            
           while(num<1 || num>10){
               System.out.println("ERROR. ingrese nuevamente el numero");
               num = leer.nextInt();
           }
           
            switch(num){
                case 1:
                    System.out.println(num+" En romano: I");
                    break;
                case 2:
                     System.out.println(num+" En romano: II");
                    break;
                case 3:
                     System.out.println(num+" En romano: III");
                    break;
                case 4:
                     System.out.println(num+" En romano: IV");
                    break;
                case 5:
                     System.out.println(num+" En romano: V");
                    break;
                case 6:
                     System.out.println(num+" En romano: VI");
                    break;
                case 7:
                     System.out.println(num+" En romano: VII");
                    break;
                case 8:
                     System.out.println(num+" En romano: VIII");
                    break;
                case 9:
                     System.out.println(num+" En romano: IX");
                    break;
                case 10:
                     System.out.println(num+" En romano: X");
                    break;
                    
                
                
            }    
 
    }

    
}
