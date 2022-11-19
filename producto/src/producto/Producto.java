
package producto;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class Producto {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //uso del constructor vacio
        Poductos a3=new Poductos();
        
        System.out.println("El nombre del producto");
        a3.setNombre(leer.next());
        System.out.println("La cantidad de producto");
        a3.setCantidad(leer.nextInt());
        System.out.println("El precio del producto es");
        a3.setPrecio(leer.nextDouble());
        System.out.println("El descuento es");
        a3.descuento();
        System.out.println("Total apagar es");
        a3.pago();
        
        a3.imprimirDatos();
        
        
        //uso del constructor paratrizado
        
        Poductos a2=new Poductos("", 0, 0);
        
        System.out.println("El nombre del producto");
        a2.setNombre(leer.next());
        System.out.println("La cantidad de producto");
        a2.setCantidad(leer.nextInt());
        System.out.println("El precio del producto es");
        a2.setPrecio(leer.nextDouble());
        System.out.println("El descuento es");
        a2.descuento();
        System.out.println("Total apagar es");
        a2.pago();
        a2.imprimirDatos();
        
    }
    
}
