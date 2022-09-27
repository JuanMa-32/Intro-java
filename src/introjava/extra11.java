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
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
        */
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese un numero para saber la cantidad de digitos que tiene ");
        int num = leer.nextInt();
        System.out.println(num+" tiene "+devolverDigitos( num)+" digitos");
        
    }
    public static int devolverDigitos(int num){
        
       int digitos = (int)(Math.log10(num)+1);
        
        
          return digitos;      
    }
    
}
