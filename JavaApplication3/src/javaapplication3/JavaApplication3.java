
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int cantidadllanta,precio;
        System.out.print("ingrese el numero de llantas :");
        cantidadllanta=leer.nextInt();
        if (cantidadllanta<5){
            precio=cantidadllanta*800;  
        }
        else      
            precio=cantidadllanta*700;
        System.out.println("el precio a pagar es:"+ precio);
    
    }
    
}
