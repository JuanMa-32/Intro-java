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
public class extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
         */
        Scanner leer= new Scanner (System.in,"ISO-8859-1");
        String salida = "si";
        do{
            System.out.println(ingresarDatos());
            System.out.println("----------------------------------------");
            System.out.println("¿Desea seguir ingresando personas?SI/NO");
            salida=leer.next();
        }while (salida.equalsIgnoreCase("si"));
    }
    
    public static String ingresarDatos(){
        
         Scanner leer= new Scanner (System.in,"ISO-8859-1");
         String validacion;
         
         System.out.println("NOMBRE COMPLETO: ");
         String nombre = leer.nextLine();
         System.out.println("EDAD: ");
         int edad = leer.nextInt();
         
         if (edad<18){
             validacion=" Es menor de edad";
         }else{
             validacion=" Es mayor de edad";
         }
         System.out.println("Nombre:"+nombre+"\n"
         +"Edad: "+edad);
         return validacion;
    }
    
}
