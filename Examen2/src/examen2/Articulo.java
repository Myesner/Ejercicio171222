
package examen2;


public class Articulo {
private float CostoBase;
  
    

    public Articulo() {
    }

    public Articulo(float CostoBase, double precio1, double precio2) {
        this.CostoBase = CostoBase;
        
    }

    
    public float getCostoBase() {
        return CostoBase;
    }

    public void setCostoBase(float CostoBase) {
        this.CostoBase = CostoBase;
    }

    public float pvpmayor(){
    if(getCostoBase()>1000){
      float pvpmayor = (float) ((getCostoBase()*0.15));
    
    return pvpmayor;
    }
    return 0;
    
}
   
   public float pvpdelta(){
   if(getCostoBase()<1000){
   float pvpdelta = (float) ((getCostoBase()*0.30));
   
   return pvpdelta;
   }
    return 0;
   
}
    
    
   

}
    
  
