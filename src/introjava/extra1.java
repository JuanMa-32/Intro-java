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
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        Scanner leer = new Scanner (System.in);
        
        double hora= 1;
        double dia=0;
        
        System.out.println("ingrese un tiempo en minutos. Para mostrar su equivalente en dias y horas: ");
        int min = leer.nextInt();
        
        hora = (min*hora/60);
        dia = hora/24;
        
        
        double decimal = dia%1;
        hora= decimal*24;
        dia=dia-decimal;
        
        
        System.out.println("DIA: "+Math.floor(dia)+" HORAS: "+Math.floor(hora));
    }
    
}
