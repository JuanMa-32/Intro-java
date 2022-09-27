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
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
       * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
       */
         Scanner leer = new Scanner (System.in);
          
         
        System.out.println(" bienvenido a OBRA SOCIAL \n"
        +"clase de socio: ");
        
        String socio=leer.next();
        
        while(! (socio.equalsIgnoreCase("a") ||  socio.equalsIgnoreCase("b") ||  socio.equalsIgnoreCase("c")) ){
            System.out.println("CLASE NO VALIDA \n"
            +" vuelva a ingresar su clase: ");
            socio = leer.next();
        }
         System.out.println("VALOR TRATAMIENTO: ");
         double precio = leer.nextDouble();
         
         tratamiento(socio,precio);
  }

     public static void tratamiento(String socio,double precio){
         
         double aPagar =0;
         double desc =0;
         
         switch (socio.toUpperCase()){
             case "A":
                 desc=precio*0.50;
                 aPagar=precio-desc;
                 break;
             case "B":
                  desc=precio*0.35;
                 aPagar=precio-desc;
                 break;
             case "C":
                 aPagar=precio;
                 break;
         }
         System.out.println("SOCIO: "+socio+"\n"
         +"VALOR DEL TRATAMIENTO: $"+precio+"\n"
         +"DESCUENTO: $"+desc+"\n"
         +"VALOR FINAL: $"+aPagar);
     }   

}   

