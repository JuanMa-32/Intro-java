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
public class extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
         */
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese la dimension del vector");
        int n = leer.nextInt();
        int [] vec1= new int [n];
        int [] vec2= new int [n];
        
        llenarVec(vec1,vec2,n);
        System.out.println(validacion(vec1,vec2,n));
    }
    
    public static void llenarVec(int vec1[],int vec2[],int n){
         Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese valores para el primer vector");
        for (int i = 0; i < n; i++) {
            System.out.println("posicion "+(i+1));
            vec1[i] = leer.nextInt();
        }
        
        System.out.println("ingrese valores para el segundo vector");
        for (int i = 0; i < n; i++) {
            System.out.println("posicion "+(i+1));
            vec2[i] = leer.nextInt();
        }
    }
    
    
    public static boolean validacion(int vec1[],int vec2[],int n){
        
        boolean resp=true;
        for (int i = 0; i < n; i++) {
            if (vec1[i]!= vec2[i]){
                resp=false;
               break;
                
            }
            
        }
        return resp;
    }
    
    
}
