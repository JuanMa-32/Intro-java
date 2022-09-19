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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().         
         */
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("DISPOSITIVO RS232");
        System.out.println("ingrese cadenas ");
        System.out.println("para terminar ingrese la secuencia FDE");
        System.out.println("--------------------------------------");
         String rs232 = "";
         String salida = " ";
         int correct = 0;
         int incorrect = 0;
        
        do{
             rs232 = leer.next();
             if (rs232.equals("&&&&&")){
                 salida = rs232;
             }
             int largo = rs232.length();
             String prim = rs232.substring(0,1);
             String ult = rs232.substring(largo-1, largo);
            if (largo==5 && prim.equals("X") && ult.equals("O")){
                correct = correct+1;
            } else if (salida.equals("&&&&&")){
                
            }else{
                incorrect = incorrect+1;
            }
             
        }while (rs232!=salida);
        System.out.println("-------------------------------------");
        System.out.println("INFORME");
        System.out.println("LECTURAS CORRECTAS: "+correct);
        System.out.println("LECTURAS INCORRECTAS: "+incorrect);
        
        
    }
    
}
