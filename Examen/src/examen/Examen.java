
package examen;

import java.util.Scanner;

/**
 *
 * @author yesner fecha 27/08/2022
 */
public class Examen {

 static Scanner leer=new Scanner(System.in);   
    public static void main(String[] args) {
        int op;
        
        do{
            System.out.println("1. Monto de compra");
            System.out.println("2. Vendedor");
            System.out.println("3. Promedio");
            System.out.println("4. Salir");
            op=leer.nextInt();
            switch (op){
                case 1 -> montoC();
                case 2 -> vendedor();
                case 3 -> calcularP();
                case 4 -> System.out.println("Gracias por utilizar el programa");
                default -> System.out.println("**Ingrese un numero valido**");
            
            }
        
        }while(op!=4);
        
        
    }
    
    
    public static void montoC(){
        //pedir el monto
        System.out.println("ingrese el monto de la compra");
        int com=leer.nextInt();
        
        if(com<=50){  
          System.out.println("No hay descuento");
            System.out.println("Total a pagar" +com);
        }else{
        if(com>100){
          double des=com*0.10;
          System.out.println("su descuento es " +des);
            System.out.println("Total a pagar" +(com-des));
        }else if(com>50 || com<=100){
          double des=com*0.20;
           System.out.println("su descuento es " +des);
            System.out.println("Total a pagar" +(com-des));
        }
     }
  }  
    
    public static void vendedor(){
          //Pedir el sueldo base
        System.out.println("Su sueldo base es:");
             double sb=leer.nextDouble();
        //Pedir las 3 ventas que hace al mes    
        System.out.println("***Escriba las tres ventas que realiza al mes***");
        System.out.println("Venta 1");
             double v1=leer.nextDouble();
        System.out.println("Venta 2");     
            double v2=leer.nextDouble();
        System.out.println("Venta 3"); 
            double v3=leer.nextDouble();
        //sumar el total de ventas    
        double TotalVta=v1+v2+v3;
        //total de venta por la tasa del 10% es igual a la comision
        double com=TotalVta*0.10;
        //sumar el sueldo base a la comision que es igual a el total q recibira
        double tpag=sb+com;
        
        System.out.println("El total que recibirá en el mes " +"$"+tpag);
    }
    
    public static void calcularP() {
        //declarar variables
       int i;
       double cali,suma = 0,promedio;
       //hacer el bucle for pidiendo que i se imprima 7 veces
       for(i=1;i<=7;i++){
           System.out.println("ingrese una calificcion\n");
               cali=leer.nextDouble();
           suma=suma+cali;
       }
       //calcular el promedio de total de las suma de las cali entre el numero de cali 
       promedio = suma/i;
        System.out.println("el promedio es"+" "+promedio);
       
    }
}

