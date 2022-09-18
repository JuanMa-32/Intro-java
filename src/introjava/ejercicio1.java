/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;






//esta es la clase
public class ejercicio1 {

    //este el metodo main
    public static void main(String[] args) {
     /*/Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
       Scanner leer = new Scanner (System.in);
       
        System.out.println("ingrese el primer valor a sumar ");
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo valor a sumar ");
        int num2 = leer.nextInt();
        
        int suma = num1+num2;
        
        System.out.println("El resultado es: "+suma);
    }
    
    
}




       
