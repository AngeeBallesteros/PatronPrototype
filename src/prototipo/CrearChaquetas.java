/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;


public class CrearChaquetas {
    
   
    
    private Tipo1 tipo1;
    private Tipo2 tipo2;
    private Tipo3 tipo3;
    private Tipo4 tipo4;
    
    public CrearChaquetas(){
    tipo1=new Tipo1();
    tipo2=new Tipo2();
    tipo3=new Tipo3();
    tipo4=new Tipo4();
    
    tipo1.setTipo("Tipo 1");
    tipo1.setColor("Azul");
    tipo1.setMaterial("Cuerina");
    tipo1.setTalla("XS");
    
    
    tipo2.setTipo("Tipo 2");
    tipo2.setColor("Negro");
    tipo2.setMaterial("Cuero");
    tipo2.setTalla("S");
    
    tipo3.setTipo("Tipo 3");
    tipo3.setColor("Verde");
    tipo3.setMaterial("Paño");
    tipo3.setTalla("M");
    
    tipo4.setTipo("Tipo 4");
    tipo4.setColor("Amarillo");
    tipo4.setMaterial("Impermeable");
    tipo4.setTalla("L");
    }
    
     public Chaqueta clonarChaquetas(Integer tipoChaqueta) {
         
            switch (tipoChaqueta){
         case 1: 
           
             return (Chaqueta) tipo1.clone();
             
         case 2:  
             return (Chaqueta) tipo2.clone();
             
             
          case 3:  
             return (Chaqueta) tipo3.clone();
            
             
           case 4:  
             return (Chaqueta) tipo4.clone();
            
             
           default:
            return null;
            
     }
      
        

}

  
    
    
}
