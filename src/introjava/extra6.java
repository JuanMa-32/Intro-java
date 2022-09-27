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
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
       Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
       */
        Scanner leer =  new Scanner (System.in);
        
        System.out.println("cantidad de personas que ingresara su altura: ");
        int n = leer.nextInt();
        
        double [] alt = new double [n]; 
        int contMenor =0;
        double general=0;
        double promedioM=0;
        
        System.out.println("ingresar alturas: ");
        
        //llenar vector con las alturas
        for (int i = 0; i < n; i++) {
            alt[i] = leer.nextDouble();
             if (alt[i]<1.60){
                contMenor++;
                promedioM=promedioM+alt[i];
            }
        }
       
        //PROMEDIO MENORES A 1.60
        promedioM=promedioM/contMenor;
        
        //PROMEDIO GENERAL
        for (int i = 0; i < n; i++) {
            general=general+alt[i];
        }
        general=general/n;
        
        System.out.println("PROMEDIO GENERAL: "+general);
        System.out.println("PROMEDIO PERSONAS POR DEBAJO DE 1.60mts: "+promedioM);
        
    }
    
}
