/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

/**
 *
 * @author estudiantes
 */
public abstract class Chaqueta implements Cloneable{
    
    private String tipo;
    private String talla;
    private String color;
    private String material;
    private String datosaMostrar;
  
    
  
    
    public String getTipo(){
    return tipo;
    }
    
    public void setTipo(String tipo){
    this.tipo=tipo;
    }
    public String getTalla(){
    return talla;
    }
    
    public void setTalla(String talla){
    this.talla=talla;
    }
    public String getColor(){
    return color;
    }
    
    public void setColor(String color){
    this.color=color;
    }
    public String getMaterial(){
    return material;
    }
    
    public void setMaterial(String material){
    this.material=material;
    }    
    
 
        @Override

    public Chaqueta clone() {

        Chaqueta pChaqueta = null;

        try {

            pChaqueta=(Chaqueta) super.clone();
        pChaqueta.setTipo(tipo);
        pChaqueta.setColor(color);
        pChaqueta.setMaterial(material);
        pChaqueta.setTalla(talla);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        } // catch	

        return pChaqueta;

    }
    
       public String DatosChaqueta() {
           

        return "Tipo: " + getTipo() + "\nTalla: " + getTalla() + 
                "\nMaterial: "+ getMaterial()+"\nColor: "+ getColor();
               

          
    }
        public String DatosChaquetaSola(int caracteristica) {
           
            switch (caracteristica){
                case 1: 
                    return "Tipo: " + getTipo() + "\nTalla: " + getTalla();
                case 2:    
                    return "Tipo: " + getTipo() + "\nMaterial: "+ getMaterial();
                case 3:
                    return "Tipo: " + getTipo() +"\nColor: "+ getColor();
                default:
                     return "Informacion no valida.Terminado";    
            }
        
               

          
    }
   
}
