
package javaapplication8.java;

import java.util.Scanner;

public class javaapplication8 {
    // Declarar variables globales
   static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args) {//inicio del metodo
      
       PreciosIVA();
      PromedioNOTAS();
     
        
    }//Fin de metodo main\
    
    public void Calculadora(){//declarar variables locales al metodo main
      float n1,n2,s=0,m=0,r=0,d=0;
        System.out.println("deme el primer numero");
        n1=leer.nextFloat();
        System.out.println("deme el segundo numero");
        n2=leer.nextFloat();
        
        s=n1+n2;
       System.out.println("La suma es: "+s );
        
       r=n1-n2;
       System.out.println("La resta es: "+r);
        
       m=n1*n2;
       System.out.println("La multipicacion es: "+m);
       
       if(n2==0) {
           System.out.println("Error de sintaxis");
       }
       else {
       d=n1/n2;
        System.out.println("La division es: "+d);
       }
            
    }
    
    
    public static void PreciosIVA(){
        float precio;
        double PIVA =0,IVA;
        System.out.println("deme el precio del producto");
        precio=leer.nextFloat();
        IVA=precio*0.15;
        PIVA=precio+IVA;
        System.out.println("El precio del producto: "+precio);
        System.out.println("El IVA " + IVA);
        System.out.println("El precio con IVA "+ PIVA);
    
    }
    
    public static void PromedioNOTAS(){
    
        
        //pedir los puntos de cada nota
        System.out.println("ingrese la nota practica");
        int np=leer.nextInt();
        System.out.println("ingrese la nota teorica");
        int nt=leer.nextInt();
        System.out.println("ingrese la nota de participacion");
        int nc=leer.nextInt();
        //pasar los puntos de las notas a una base de dato 'promedio' y aplicar el porcentaje
        double promedio;
         promedio=((np*0.3)+(nt*0.6)+(nc*0.1));
       //imprimir el mesaje y el resultado de su nota final
           System.out.println("Su nota final es " + promedio);
       
    
    }
    
}
            
            
