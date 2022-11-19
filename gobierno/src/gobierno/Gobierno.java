
package gobierno;

import java.util.Scanner;


public class Gobierno {
 static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
       double porcentaje, salario, sar ;
       int x;
        System.out.println("Ingresa tu salario");
        salario=leer.nextDouble();
        
 
        do{
            System.out.println("Ingresa una opcion:");
            System.out.println("1. Cuota fija");
            System.out.println("2. Porcentaje");
            x=leer.nextInt();
                  switch (x) { 
                      default -> System.out.println("Digite un numero valido");
                    }
        }  while ((x<1)||(x>2));
            if(x==1){
            System.out.println("Ingresa la cuota fija para el SAR");
            sar=leer.nextDouble();
        }else{
            System.out.println("Ingresa un porcentaje para SAR");
            porcentaje=leer.nextDouble();
            sar=(salario*porcentaje)/100;
        }
         System.out.println("La cantidad de dinero que deposita cada mes para SAR es: " +sar);
         System.out.println("Tu pago mensual es: " +(salario-sar));
    }
    
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        
        
        
        }
    
    
    
    }
}
