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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
         */
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer valor: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int num2 = leer.nextInt();
        String opc2 = "N";
        int opc = 0;
        
        do{
            System.out.println("MENU");
            System.out.println("1.Sumar"); 
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion: ");
             opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("SUMA: "+(num1+num2));
                    continue;
                case 2:
                     System.out.println("RESTA: "+(num1-num2));
                     continue;
                case 3:
                     System.out.println("MULTIPLICACION: "+(num1*num2));
                     continue;
                case 4:
                     System.out.println("DIVICION: "+(num1/num2));
                     continue;
            }
            if (opc==5){
                System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                opc2 = leer.next();
                
            }
            
        }while ( opc2.equals("N") || opc2.equals("n")  );
        
        
    }
    
}
