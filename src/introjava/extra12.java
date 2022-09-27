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
public class extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
         */
        /**
         * FORMULA PARA PASAR INT A STRING
         * //int numEntero = 4;    
        //String numCadena= String.valueOf(numEntero);

         */
        
        int uno=0;
        int dos=0;
        int tres=0;
        String cambioU="";
         String cambioD="";
          String cambioT="";
          String pal="E";
        
        for (int i = 0; i < 10; i++) {
            uno=i;
            
            for (int j = 0; j < 10; j++) {
                dos=j;
                for (int k = 0; k < 10; k++) {
                    tres=k;
                    
                    
                   if(uno==3){
                         cambioU= String.valueOf(uno);
                   }else{
                       cambioU="x";
                       
                   }
                    if(dos==3){
                         cambioD= String.valueOf(dos);
                   }else{
                       cambioD="x";
                       
                   }
                     if(tres==3){
                         cambioT= String.valueOf(tres);
                   }else{
                       cambioT="x";
                       
                   }
                     if (  (cambioU.equals("x") && cambioD.equals("x") && cambioT.equals("x"))  ){
                         System.out.println(uno+"-"+dos+"-"+tres);
                         
                     }else if (cambioU.equals("3") && cambioD.equals("3") && cambioT.equals("3")){
                         System.out.println(pal+"-"+pal+"-"+pal);
                         
                     }else if (cambioU.equals("3") && cambioD.equals("3")){
                        System.out.println(pal+"-"+pal+"-"+tres);
                        
                     }else if (cambioU.equals("3") && cambioT.equals("3")){
                         System.out.println(pal+"-"+dos+"-"+pal);
                        
                     }else if (cambioD.equals("3") && cambioT.equals("3")){
                         System.out.println(uno+"-"+pal+"-"+pal);
                       
                     }else if (cambioU.equals("3")){
                         System.out.println(pal+"-"+dos+"-"+tres);
                        
                     }else if (cambioD.equals("3")){
                          System.out.println(uno+"-"+pal+"-"+tres);
                       
                     }else if (cambioT.equals("3")){
                         System.out.println(uno+"-"+dos+"-"+pal);
                        
                     }
                    
                     
                }
   
            }
            
        }
      
        
    }
    
   
    
    
}
