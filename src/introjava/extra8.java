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
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
       Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
      */
       
        
        ingresarNum();
        
        
       
    }
    
    public static void ingresarNum(){
        
           Scanner leer = new Scanner (System.in);
           boolean esMultiplo = true;
           int leidos = 0;
           int pares=0;
           int impares=0;
           
           System.out.println("INGRESE NUMEROS ENTEROS ");
          
             do{
            int num = leer.nextInt();
            if (num<0){
                
            }else{ 
            if(num%5==0){
                esMultiplo=false;
            }
            if (num%2==0){
                pares++;
            }else{
                impares++;
            }
            leidos++;
            }
            
             
         }while(esMultiplo);
           
             System.out.println("NUMEROS LEIDOS: "+leidos+"\n"
             +"NUMEROS PARES: "+pares+"\n"
             +"NUMEROS IMPARES: "+impares);
    } 
   
      
  }
