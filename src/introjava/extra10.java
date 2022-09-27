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
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
         */
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese el resultado de una multiplicacion aleatoria");
        int resp = leer.nextInt();
        int retorno = generarNum();
        
        while (retorno!=resp){
            System.out.println("ingrese otro resultado");
            resp=leer.nextInt();
        }
        
        System.out.println("FELICITACIONES \n"
        +"el resultado es: "+resp); 
        
        
        
    }
    
    public static int generarNum(){
        
        int num1 = (int) (Math.random()*(10-1)) + 1;
        int num2 = (int) (Math.random()*(10-1)) + 1;
        
        

        int result = num1*num2;
        return result;
    }
    
}
