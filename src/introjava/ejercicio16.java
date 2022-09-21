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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
        */
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el tamaño del vector a rellenar");
        int tamaño = leer.nextInt();
        System.out.println("ingrese el numero que desea buscar dentro del vector");
        int num = leer.nextInt();
        
        buscarNum(tamaño,num);
    }
    public static void buscarNum(int tamaño,int num){
        
        int [] vec = new int [tamaño];
       int rep = 0;
        
        for (int i = 0; i < tamaño; i++) {
            vec[i]= (int) (Math.random() * 100);
            if (vec[i]==num && rep==0){
                System.out.println(num+" fue encontrado, POSICION: "+i);
                rep ++;
            }else if (rep>=0 && vec[i]==num){
                System.out.println("se encontro repetido, POSICION:"+i);
            }
        }
        
        
    }
    
}
