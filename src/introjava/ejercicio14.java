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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
         */
        Scanner leer = new Scanner (System.in);
        System.out.println("cantidad de euros que cambiara: ");
        double eur = leer.nextDouble();
        System.out.println("ingrese a que moneda lo convertira");
        String cambio = leer.next();
        convertir(eur,cambio);
        
    }
    public static void convertir(double eur,String cambio){
        double total = 0;
         Scanner leer = new Scanner (System.in);
        String salida = "s";
        do{
        switch (cambio){
            case "libras":
                total=0.86*eur;
                break;
            case "dolares":
                total=1.28611*eur;
                break;
            case "yanes":
                total=129.852*eur;
                break;
            default:
                System.out.println("la moneda a la que quiere cambiar no existe.");
               
        }
            System.out.println("desea hacer otra convercion S/N");
            salida=leer.next();
            if (salida.equalsIgnoreCase("s")){
                 System.out.println("cantidad de euros que cambiara: ");
                 eur = leer.nextDouble();
                 System.out.println("ingrese a que moneda lo convertira");
                 cambio = leer.next();
            }
            
            
        }while (salida.equalsIgnoreCase("s"));
        System.out.println("su cambio es : "+total);
    }
    
}
