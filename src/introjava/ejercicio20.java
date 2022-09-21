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
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**
      * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
      */
     boolean resp;
     resp= magico();
        System.out.println("ESTE CUBO ES: "+resp);
    }
    
    public static boolean magico(){
        int [][] cubo = new int [3][3];
        
         Scanner leer = new Scanner (System.in);
         int sumaCo1=0;
         int sumaCo2=0;
         int sumaCo3=0;
         int sumaFi1=0;
         int sumaFi2=0;
         int sumaFi3=0;
         int diag1=0;
         int diag2=0;
         int columnas=0;
         int filas=0;
         int diagonales=0;
        boolean comparacion= true;
         
        //validacion de datos correctos
         System.out.println("ingrese valores a su cubo magico: ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                cubo[i][j]=leer.nextInt();
                do{
                    if (cubo[i][j]<1 || cubo[i][j]>9){
                        System.out.println("dato incorrecto");
                    System.out.println("vuelva a ingresa un valor VALIDO");
                    cubo[i][j]=leer.nextInt();
                    }
                }while (cubo[i][j]<1 || cubo[i][j]>9);
            }
        }
        
        //sumar COLUMNAS para despues comparar con las filas y diagonales
        
        for (int i = 0; i < 3; i++) {
            sumaCo1 = sumaCo1+cubo[i][0];
            sumaCo2 = sumaCo2+cubo[i][1];
            sumaCo3 = sumaCo3+cubo[i][2];
        }
        if (sumaCo1==sumaCo2 && sumaCo1==sumaCo3 && sumaCo3==sumaCo2){
               columnas = sumaCo1;
            }
        
        
        //sumar FILAS para despues comparar con las columnas y diagonales
         for (int j = 0; j < 3; j++) {
            sumaFi1 = sumaFi1+cubo[0][j];
            sumaFi2 = sumaFi2+cubo[1][j];
            sumaFi3 = sumaFi3+cubo[2][j];
        }
         if (sumaFi1==sumaFi2 && sumaFi1==sumaFi3 && sumaFi3==sumaFi2){
               filas=sumaFi1;
            }
         
         
         //sumar DIAGONALES para despues comparar con las columnas y filas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //primera diagonal
                if (i==j){
                    diag1=diag1+cubo[i][j];
                }
                //segunda diagonal
                if (i+j==2){
                    diag2=diag2+cubo[i][j];
                }
            }
        }
        if (diag1==diag2){
            diagonales=diag1;
        }
        
        
        
        //imprimir cubo magico
         for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+cubo[i][j]+"]"+" ");
            }
             System.out.println("");
         }    
      
         //retorno valor de la funcion
         if (columnas==filas && columnas==diagonales && filas==diagonales){
             comparacion=true;
         }else{
             comparacion=false;
         }
         
         return comparacion;
         
         
         
    }
}
