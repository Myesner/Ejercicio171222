

package com.mycompany.ejercicio1;

import java.util.Scanner;



public class Ejercicio1 {

    public static void main(String[] args)  {
        //pedir numeros
        Scanner leer = new  Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3=leer.nextInt();
        
        calcularnumeromayor(num1,num2,num3);
        numerosdemenoramayor(num1,num2,num3);
        numeroRestante(num1,num2,num3);
        
 }
    
    public static void calcularnumeromayor(int num1, int num2, int num3){
    
         if(num1 > num2){
           if(num1 > num3)
               
            System.out.println("es mayor " + num1);
       }
        if(num2 > num1){
           if(num2 > num3)
             System.out.println("es mayor " + num2);
        }
        if(num3 > num1){
           if(num3 > num2)   
             System.out.println("es mayor " + num3);
        }else{
        if(num1==num2){
        if(num1==num3)
            if(num2==num1)
        if(num2==num3)
            if(num3==num1){
        if(num3==num2)
                System.out.println("Los numero " + num1 + "vson iguales");
           }
        }
     }
   }
    
    
    
   public static void numerosdemenoramayor(int num1, int num2, int num3){
     if (num1 <num2){
           if(num1 < num3)
               
            System.out.println("es menor " + num1);
                
       }
        if(num2 < num1){
           if(num2 < num3)
             System.out.println("es menor " + num2);
        }
        if(num3 < num1){
           if(num3 < num2)   
             System.out.println("es menor " + num3);
        }
    }
     
   
   public static void numeroRestante(int num1, int num2, int num3){
       if(num1>num3 && num2>num3){
           System.out.println("el numero " + num3 );
       }
        if(num1>num2 && num2>num2){
           System.out.println("el numero " + num2 );
        }
        }
   }
   

