
package producto;

/**
 *
 * @author yesner
 */
public class Poductos {
    //caracteristica
    private String nombre;
    private int cantidad;
    private double precio;
    
    //Metodo Constructor Vacio y Parametrizado

    public Poductos() {
    }

    public Poductos(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Metodos de getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double descuento(){
       double totalp=getPrecio()*getCantidad();
       
       if(totalp>1000){
           return totalp*0.15;
       }else{
           return 0;
       }
    }
    
    public double pago(){
         double total=getCantidad()*getPrecio();
         double pago=total-descuento();
         return pago;
    
    }
    
    //Metodos personalizados
    
    public void imprimirDatos(){
        System.out.println("Los productos Usando constructor vacio:\n");
        System.out.println("El nombre del producto es:" +" " +getNombre());
        System.out.println("La cantidad de producto es:" +" "+getCantidad());
        System.out.println("el precio del producto es "+ " " +getPrecio());
        System.out.println("Tiene un descuento de:" +descuento());
        System.out.println("El total a pagar es:" +" "+pago());
       System.out.println("\n");
    
    }
 
}
