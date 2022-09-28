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
public class extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
         */
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la dimension del vector ");
        int n = leer.nextInt();
        
        int [] vec = new int [n];
        
        System.out.println("suma del vector: "+sumaVector(vec,n));
    }
    public static int sumaVector(int vec[],int n ){
        
         Scanner leer = new Scanner (System.in);
        int sumatoria = 0;
        System.out.println("ingrese valores al vector");
        for (int i = 0; i < n; i++) {
            System.out.println("posicion "+(i+1));
            vec[i]=leer.nextInt();
            sumatoria=sumatoria+vec[i];
        }
        return sumatoria;
    }
    
}
