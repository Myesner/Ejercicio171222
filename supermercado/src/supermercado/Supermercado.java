
package supermercado;

import java.util.Scanner;

public class Supermercado {


    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("Compra :");
        int TotalCompra=leer.nextInt();
        System.out.println("Escribe un número :");
        int numdescuento=leer.nextInt();
        double  descuento;
   
        if(numdescuento < 74){
            descuento = TotalCompra*0.15;
        }else{ 
            descuento=TotalCompra*0.20;
        }
        double total = TotalCompra-descuento;
        System.out.println("Total Compra:" +TotalCompra);
        System.out.println("Valor de descuento: " + descuento);
        System.out.println("Total de la Compra con descuento : " + total);
        
    }
    
}
