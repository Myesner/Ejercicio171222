
package practica1;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class Practica1 {

  static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        
        do{
            System.out.println("1. funcion pnn");
            System.out.println("2. numeromenormayor");
            System.out.println("3. porct");
            System.out.println("4. salir");
            op=leer.nextInt();
            switch (op){
                case 1 -> {
                    System.out.println("Digite un numero");
                    double n=leer.nextInt();
                    System.out.println("el numero es " +NUM(n));
                }
                case 2 -> nMnm();
                case 3 -> porct();
                default -> System.out.println("ingrese un numero valido");
                
             }
        }while (op!=4);
            
        
       
    }
    
    public static int NUM(double n){
     
        if(n==0){
             return 0;
        }else 
             if (n>0){
                return 1;
        }else{
            return -1;
        }
        
    }
    
    public static void nMnm(){
        System.out.println("Digite el primer numero");
        int a=leer.nextInt();
        System.out.println("Digite el segundo numero");
        int b=leer.nextInt();
        
        
        if(a<b){
            System.out.println("el numero menor es" +a);
        }else {
            System.out.println("el numero menor es" +b);
        
        }
        if(a>b){
            System.out.println("el numero mayor es" +a);
        }else {
            System.out.println("el numero mayor es" +b);
        }
           
    
    
    }
    
    public static void porct(){
    double pc,pp;
    double desc,total;
    
        System.out.println("ingrese la cantidad comprada");
        int cp=leer.nextInt();
        System.out.println("el precio de la compra");
        pc=leer.nextDouble();
        
        pp=(pc*3.1416);
        
        desc=(pc/pp)*100;
        total=desc-pp;
       
        System.out.println("el porcentaje descontado de su compra es " + desc);
        System.out.println("total a pagar " +total);
    }
    
}
 System.out.println("calificacion 1");
        int cf1=leer.nextInt();
        System.out.println("calicicacion 2");
        int cf2=leer.nextInt();
        System.out.println("calicicacion 3");
        int cf3=leer.nextInt();
        System.out.println("calicicacion 4");
        int cf4=leer.nextInt();
        System.out.println("calicicacion 5");
        int cf5=leer.nextInt();
        System.out.println("calicicacion 6");
        int cf6=leer.nextInt();
        System.out.println("calicicacion 7");
        int cf7=leer.nextInt();
        
        
        double sumatoria=(cf1+cf2+cf3+cf4+cf5+cf6+cf7);
        Double prom = sumatoria /7;
        
        System.out.println("su promedios es" +prom);