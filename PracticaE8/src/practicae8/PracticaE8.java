
package practicae8;

import java.util.Scanner;

/**
 *
 * @author Yesner Mejía
 */
public class PracticaE8 {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       
        Cuadrado c=new Cuadrado();
        Triangulo t=new Triangulo();
        Rectangulo r=new Rectangulo();
        
        //calcular el area y el perimetro del cuadrado
        System.out.println("Digite el lado del cuadrado");
        c.setLado(sc.nextDouble());
        System.out.println("El area del cuadrado es:" +c.area());
        System.out.println("El perimetro del cuadrado es:" +c.perimetro());
        
        
        //calcular el area y el perimetro del triangulo
        System.out.println("Digite la base del triangulo");
        t.setBase(sc.nextDouble());
        System.out.println("Digite la altura del triangulo");
        t.setAltura(sc.nextDouble());
        System.out.println("Digite el lado #1 del triangulo");
        t.setLado(sc.nextDouble());
        System.out.println("Digite el lado #2 del triangulo");
        t.setLado(sc.nextDouble());
        System.out.println("Digite el lado #3 del triangulo");
        t.setLado(sc.nextDouble());
        System.out.println("El area del triangulo es:" +t.area());
        System.out.println("El perimetro del triangulo es: " +t.perimetro());
        
        //calcular el area y perimetro del rectangulo
        System.out.println("Digite la base del Rectangulo");
        r.setBase(sc.nextDouble());
        System.out.println("Digite la altura del Rectangulo");
        r.setAltura(sc.nextDouble());
        System.out.println("El area del triangulo es:" +r.area());
        System.out.println("el perimetro del rectangulo es: " +r.perimetro());
        
    }
    
}
