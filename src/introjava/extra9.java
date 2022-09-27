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
public class extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

  */
        Scanner leer = new Scanner (System.in);
        System.out.println("-------DIVISION CON RESTA SUCESIVA---------");
        System.out.println("ingrese el dividendo ");
        int dividendo = leer.nextInt();
        System.out.println("ingrese el divisor");
        int divisor = leer.nextInt();
        
        System.out.println("el resultado de la division es: "+restaSucesiva(dividendo,divisor));
        
    }
    public static int restaSucesiva(int dividendo,int divisor){
        
        int result=0;
        if (dividendo<divisor){
            result=0;
        }else{
            result= 1+restaSucesiva(dividendo-divisor,divisor);
        }
        return result;
    }
}
