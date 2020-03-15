/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.Scanner;

/**
 *
 * @author ageep
 */
public class Prototipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Bienvenido \n Si desea ver todas las chaquetas con sus datos ingrese 0 si desea ver una chaqueta en particular ingrese 1");
        Scanner sc = new Scanner(System.in);
        CrearChaquetas crearChaquetas= new CrearChaquetas();
        Chaqueta[] chaqueta=new Chaqueta[4];
        for (int i = 0; i <= 3; i++) {
            chaqueta[i]=crearChaquetas.clonarChaquetas(i+1);
           }
        int todos=sc.nextInt();
        if(todos==0){
       for (int i = 0; i <= 3; i++) {

            System.out.println(chaqueta[i].DatosChaqueta());

        }
        }else if (todos==1){
         System.out.println("Ingrese el tipo de chaqueta para el que quiere ver los datos. Ingrese un numero de 1 a 4 ");
         int tipo =sc.nextInt();
         if(tipo>=1 & tipo<=4){
               
        System.out.println("Desea ver todos los datos o solo 1?. Ingrese 0 para todos y 1 para una sola");
        int cdatos =sc.nextInt();
        if(cdatos==0){
        System.out.println(chaqueta[tipo-1].DatosChaqueta());  
        }else if(cdatos==1){ 
        System.out.println("Ingrese el dato que quiere ver. Ingrese:\n1 para ver la talla\n2 para ver el material\n3 para ver el color");
        int caracteristica =sc.nextInt();
        System.out.println(chaqueta[tipo-1].DatosChaquetaSola(caracteristica));
        }else{
        System.out.println("No ingreso un dato valido. Terminado");  
        System.exit(0); 
        
        }
         }else{
        System.out.println("No ingreso un dato valido. Terminado");  
        System.exit(0); 
       
        } 
        
        }else{
        System.out.println("No ingreso un dato valido. Terminado");  
        System.exit(0);
            
        }
    }
    
}
