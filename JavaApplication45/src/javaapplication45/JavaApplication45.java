
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class JavaApplication45 {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
       Rectangulo r=new Rectangulo();
        //calcular el area y el perimetro del rectabgulo
        System.out.println("Digite la base del Rectangulo");
        r.setBase(sc.nextDouble());
        System.out.println("Digite la altura del Rectangulo");
        r.setAltura(sc.nextDouble());
        System.out.println("El area del rectangulo es:" +r.area());
        System.out.println("el perimetro del rectangulo es: " +r.perimetro());
        
        Circulo c=new Circulo();
        //calcular el area y el perimetro del circulo
        System.out.println("Digite el radio del circulo");
        c.setRadio(sc.nextDouble());
        System.out.println("El area del circulo es:" +c.area());
        System.out.println("el perimetro del circulo es: " +c.perimetro());
        
    }
    
}
