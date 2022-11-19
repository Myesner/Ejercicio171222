
package com.mycompany.esparoimpar;

import java.util.Scanner;




public class Esparoimpar {
    
 
   public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("ingrese el numero");
       double numero=leer.nextDouble();
       
       boolean espar= numero % 2 ==0;
    
       if(espar){
           System.out.println("El numero " + numero + " es par");
       }
       else{
           System.out.println("El numero " + numero + " es impar");
       }
    
       
    
  }
    
}