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
public class extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
         */
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Primer numero: ");
        int num1=leer.nextInt();
        System.out.println("Segundo numero: ");
        int num2=leer.nextInt();
        
        System.out.println("¿Que operacion matematica desea ver? \n"
                + "1-suma \n"
        +         "2-resta \n"
        +         "3-multiplicacion \n"
        +         "4-division");
        int menu = leer.nextInt();
        
        switch (menu){
            case 1:
                System.out.println(num1+" + "+num2+" = "+suma(num1,num2));
                break;
            case 2:
                 System.out.println(num1+" - "+num2+" = "+resta(num1,num2));
                break;
            case 3:
                 System.out.println(num1+" x "+num2+" = "+mult(num1,num2));
                break;
            case 4:
                 System.out.println(num1+" / "+num2+" = "+div(num1,num2));
                break;
            default:
                System.out.println("el numero ingresado no corresponde a una operacion");
        }
        
    }
    
    public static int suma(int a,int b){
        
        int result = a+b;
        
        return result;
    }
    
     public static int resta(int a,int b){
        
        int result = a-b;
        
        return result;
    }
     
     public static int mult(int a,int b){
        
        int result = a*b;
        
        return result;
    }
     
     public static double div(int a,int b){
        
        double result = a/b;
        
        return result;
    }
    
}
