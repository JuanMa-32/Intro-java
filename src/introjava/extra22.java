/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author NALDO
 */
public class extra22 {

    /**
     * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz = new int [4][4];
        int sumaMat = 0;
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random()*20);
                sumaMat+=matriz[i][j];
            }
            
        }
        
        System.out.println("la suma de la matriz: "+sumaMat);
    }
    
}
