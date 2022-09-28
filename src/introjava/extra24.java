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
public class extra24 {

    /**
     * Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese cuantas sucesiones de fibonacci quiere realizar");
        int N = leer.nextInt();
        
        fibonacci(N);
     
       
    }
    public static void  fibonacci(int n){
        
          int [] fibo = new int [n+1];
         int y=1;
         int x=1;
         int suma=0;
         
         for (int i = 0; i < n; i++) {
          
             fibo[i]=x;
             fibo[i+1]=y;
                     
            suma=y+x;
             x=y;
            y=suma;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("["+fibo[i]+"]");
        }
      
    }
    
}
