
package bienesraices;

import java.util.Scanner;


public class Bienesraices {

   
    public static void main(String[] args) {
       double ingreso, costoC, enganche , parcial;
       Scanner leer=new Scanner(System.in);
        System.out.println("Escriba sus ingreso :");
        ingreso=leer.nextDouble();
        System.out.println("El costo de la casa es :");
        costoC=leer.nextDouble();
        
        
        if(ingreso<8000){
               enganche=costoC*0.15;
               parcial=(costoC-enganche)/(12*10);
        }else{
               enganche=costoC*0.30;
               parcial=(costoC-enganche)/(12*7);
        }
        System.out.println("El enganche a pagar es: " +enganche);
        System.out.println("El pago de cada parcial es: " +parcial);
    }
    
}
