
package com.mycompany.promedio;

import java.util.Scanner;

public class Promedio {
    
  
    public static void main(String[] args) {
         Scanner leer= new  Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("ngrese el segundo numero");
        int num2=leer.nextInt();
        System.out.println("ngrese el tercer numero");
        int num3=leer.nextInt();
        
        int sumatoria = num1 + num2 + num3;
        Double promedio = Double.valueOf(sumatoria) /3;
        
        System.out.println("Su promedio es " + promedio );
    }
}
