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
public class extra23 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        String [][] sopa = new String [20][20];
        int [] comparar = new int [5];
       int F=0;
        String palabra;
           int largo=0;
           
           //ingreso palabras
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("ingrese una palabra entre 3 y 5 caracteres");
                  palabra = leer.nextLine();
                  largo = palabra.length();
            }while(largo<3 || largo>5);
            
           
                   F = (int)(Math.random()*20);
                   
                 
            
            
            
                //lleno la matriz con las palabras ingresadas
                for (int k = 0; k < largo; k++) {
                    sopa[F][k]= palabra.substring(k,k+1);
                }
            }
        
        //lenado de la matriz con numeros aleatorios
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j]==null){
                    int azar = (int)(Math.random()*10);
                    String azarCadena = String.valueOf(azar);
                    sopa[i][j]=azarCadena;
                }
            }
        }
        
        //imprimir la matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+sopa[i][j]+"]"+"");
            }
            System.out.println("");
        }
        
    }
}
    

