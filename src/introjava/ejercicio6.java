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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Crear un programa que dado un numero determine si es par o impar.
        */
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese un numero para saber si es par/impar");
        int num = leer.nextInt();
        
        if (num==0){
            System.out.println("Este numero no es par ni imar ");
            
        }else if (num%2==0){
            System.out.println("Este numero es PAR");
        }else{
            System.out.println("Este numero es IMPAR");
        }
    }
    
}
