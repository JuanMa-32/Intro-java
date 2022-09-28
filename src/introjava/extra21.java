/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 
 */
public class extra21 {

    /**
     * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        
        int cont=0;
        double promedio=0;
        double [] vecProm = new double [10];
        
        
        System.out.println("------------INGRESAR NOTAS------------");
        while (cont<10){
            System.out.println("ALUMNO "+(cont+1)+":");
            System.out.println("primer tp evaluativo: ");
            double tpEvaluativo=leer.nextDouble();
            
            System.out.println("primer tp evaluativo: ");
            double tpEvaluativo2=leer.nextDouble();
            
            System.out.println("primer integrador: ");
            double integrador=leer.nextDouble();
            
              System.out.println("segundo integrador: ");
            double integrador2=leer.nextDouble();
            
            double total = ( (tpEvaluativo*0.10)+(tpEvaluativo2*0.15)+(integrador*0.25)+(integrador2*0.50) );
            vecProm[cont]=total;
            cont++;
        }
        
        for (int i = 0; i < 10; i++) {
            if(vecProm[i]<7){
                System.out.println("ALUMNO "+(i+1));
                System.out.println("DESAPROBO CON UN PROMEDIO DE: "+vecProm[i]);
            }else{
                 System.out.println("ALUMNO "+(i+1));
                System.out.println("APROBO CON UN PROMEDIO DE: "+vecProm[i]);
            }
                
        }
    }
    
}
