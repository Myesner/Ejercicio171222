
package circunferen;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class CircunFeren {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Circunferencia a3=new Circunferencia();
        
        System.out.println("El Radio es");
        a3.setRadio(leer.nextDouble());
        System.out.println("La longitud es");
        a3.longitud();
        System.out.println("El area es");
        a3.area();
        a3.imprimirDatos();
    }
    
}
