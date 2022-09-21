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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
     Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
       */
        
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        digitos(n);
        
    }
    public static void digitos(int n){
        
       Scanner leer = new Scanner (System.in);
        int vector[] = new int[n];
        int uno =0;
        int dos =0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        System.out.println("INGRESE VALORES");
        for (int i=0; i < n; i++){
            vector[i]=leer.nextInt();
            
            if(vector[i] >= 0 && vector[i] <= 9){
                uno = uno + 1;
                
            } else if(vector[i] >= 10 && vector[i] <= 99){
                dos = dos + 1;
                
            } else if(vector[i] >= 100 && vector[i] <= 999){
                tres = tres + 1;
                
            } else if(vector[i] >= 1000 && vector[i] <= 9999){
                cuatro = cuatro + 1;
                
            } else if(vector[i] >= 10000 && vector[i] <= 99999){
                cinco = cinco + 1;
                
            }
        }
        System.out.println("---------------------------");
        System.out.println("Numeros de 1 digito: "+uno);
        System.out.println("Numeros de 2 digito: "+dos);
        System.out.println("Numeros de 3 digito: "+tres);
        System.out.println("Numeros de 4 digito: "+cuatro);
        System.out.println("Numeros de 5 digito: "+cinco);

        
    }
    
}
