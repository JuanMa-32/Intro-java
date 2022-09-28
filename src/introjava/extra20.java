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
public class extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
         */
        
        int [] vec = new int [10];
        
        vec=rellenarVec(vec);
        
        imprimirVec(vec);
    }
    public static int [] rellenarVec(int vec[]){
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese valores a su vector");
        for (int i = 0; i < 10; i++) {
            
            vec[i]=leer.nextInt();
        }
        return vec;
    }
    
    public static void imprimirVec(int vec[]){
        
        for (int i = 0; i < 10; i++) {
            System.out.println("["+vec[i]+"]");
        }
    }
    
}
