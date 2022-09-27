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
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
         */
        Scanner leer = new Scanner (System.in);
        
        System.out.println("¿Cuantos numeros ingresara?");
        int n = leer.nextInt();
       
        System.out.println("-----------------VERSION A-----------------");
        versionA(n);
        System.out.println("-----------------VERSION B-----------------");
        versionB(n);
    }
    
    public static void versionA(int n){
          Scanner leer = new Scanner (System.in);
         
         int max = -214748364;
         int min = 214748364;
         int cont =0;
         double promedio=0;
         
         while (cont<n){
             
             System.out.println("ingrese un numero");
              int num = leer.nextInt();
             if (num>max){
                 max=num;
             }
             if(num<min) {
                 min=num;
             }
             promedio=promedio+num;
             cont++;
         }
         System.out.println("NUMERO MAYOR: "+max+"\n"
         +"NUMERO MENOR: "+min+"\n"
         +"PROMEDIO: "+promedio/n);
         }
    
    public static void versionB(int n){
          Scanner leer = new Scanner (System.in);
        
        int max = -214748364;
         int min = 214748364;
         int cont =0;
         double prom=0;
         
         do{
            System.out.println("ingrese un numero");
              int num = leer.nextInt();
             if (num>max){
                 max=num;
             }
             if(num<min) {
                 min=num;
             }
             prom=prom+num;
             cont++; 
         }while (cont<3);
         System.out.println("NUMERO MAYOR: "+max+"\n"
         +"NUMERO MENOR: "+min+"\n"
         +"PROMEDIO: "+prom/n);
        
    }
   
         
}
