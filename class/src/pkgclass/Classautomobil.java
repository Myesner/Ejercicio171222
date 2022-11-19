
package pkgclass;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class Classautomobil {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //Uso del constructor vacio
        autoMovil a1=new autoMovil();
        a1.setMarca("Toyota");
        a1.setModelo("Hilux");
        a1.setColor("Blanco");
        a1.setVelocidad(100);
        //Uso del constructor vacio
        
        a1.imprimirDatos();
        
        //Uso del constructor parametrizado
        
        autoMovil a2=new autoMovil("Audi", "R8", "Rojo", 120);
        
        a2.imprimirDatos();
        
        //Uso Dinamico del constructor vacio
        
        autoMovil a3=new autoMovil();
        
        System.out.println("Deme la marca del vehiculo");
        a3.setMarca(leer.next());
        System.out.println("Deme el modelo del vehiculo");
        a3.setModelo(leer.next());
        System.out.println("Deme el color del vehiculo");
        a3.setColor(leer.next());
        System.out.println("Deme la velcidad del vehiculo");
        a3.setVelocidad(leer.nextInt());
        a3.imprimirDatos();
        
       
    }
    
}
