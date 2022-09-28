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
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
        */
       Scanner leer = new Scanner (System.in);
       
        System.out.println("cantidad de familias: ");
        int n = leer.nextInt();
        
        System.out.println("LA MEDIA DE EDAD DE LOS HIJOS ES: "+mediaEdad(n));
    }
    
    public static int mediaEdad(int n){
        
         Scanner leer = new Scanner (System.in);
         int sumaHijos=0;
         int sumaEdad=0;
         int media;
         
         
         System.out.println("-----PRIMERO INGRESAR CANTIDAD DE HIJOS,LUEGO LAS EDADES CORRESPONDIENTES-----");
        for (int i = 0; i < n; i++) {
            System.out.println("cantidad hijos familia "+(i+1));
            int hijos = leer.nextInt();
            sumaHijos=sumaHijos+hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("edad hijo "+(j+1));
                int edad = leer.nextInt();
                sumaEdad=sumaEdad+edad;
            }
        }
        media = sumaEdad/sumaHijos;
        
        
        return media;
    }
    
}
