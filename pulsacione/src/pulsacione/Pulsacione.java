
package pulsacione;

import java.util.Scanner;


public class Pulsacione {
 static Scanner leer=new Scanner(System.in);
 
    public static void main(String[] args) {
      int sexo;
         do {
            System.out.println("ingrese su sexo");
            System.out.println("1. Masculino");
            System.out.println("2. Femenino");
            System.out.println("3. Salir");
            sexo=leer.nextInt();
            switch (sexo) {
                case 1 -> masculino();
                case 2 -> femenino();
                case 3 -> System.out.println("Gracias por usar el sistema");
                default -> System.out.println("Digite un numero valido");
            }
            
         } while (sexo!=1);
    
 }

    
    public static void masculino(){
       System.out.println("Ingrese su edad:");
        double edad=leer.nextInt();
         double pulsacion  ;
          pulsacion=(210-edad)/10;
          System.out.println("su pulsacion es : " +pulsacion);
    
    }
    public static void femenino(){
        System.out.println("Ingrese su edad:");
        double edad=leer.nextInt();
        double pulsacion  ;
        pulsacion=(220-edad)/10;
        System.out.println("su pulsacion es : " +pulsacion);
    }
}
