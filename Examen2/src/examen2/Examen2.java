
package examen2;

import java.util.Scanner;

// Yesner Mejia
public class Examen2 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Articulo a=new Articulo();
        
        System.out.println("Cual es el costo base");
        a.setCostoBase(sc.nextFloat());
        System.out.println("El incremetndo del PVPMAYOR es" +a.pvpmayor());
        System.out.println("El incremento del PVPDETAL es" +a.pvpdelta());
    }
    
}
