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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        boolean resp = transpuesta();
        if (resp){
            System.out.println("esta matriz NO es antisimetrica");
        }else{
            System.out.println("esta matriz es antisimetrica");
        }
    }
    
    public static boolean transpuesta (){
        
        Scanner leer = new Scanner (System.in);
        int [][] matriz = new int [3][3]; 
       
        boolean transpuesta = false;
        
        System.out.println("ingrese valores a su matriz: ");
        //llenado matriz A
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              matriz[i][j]=leer.nextInt();
             
            }
        }
        
        //comparacion para ver si son iguales en su transpuesta
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]+ matriz[j][i] !=0 ){
                       transpuesta=true;
                }       
            }
        }
        
        
        
        //imprimo la matriz A
        System.out.println("MATRIZ CARGADA: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]"+" ");
            }
            System.out.println("");
        }
        
        System.out.println("------------------------------");
        System.out.println("MATRIZ TRANSPUESTA : ");
         //imprimo la matriz B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[j][i]+"]"+" ");
            }
            System.out.println("");
        }
        
        return transpuesta;
    
    }
}
