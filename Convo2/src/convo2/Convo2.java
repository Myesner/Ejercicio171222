
package convo2;

import java.util.Scanner;

/**
 *
 * @author Freddy Lazo
 */
public class Convo2 {

    static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
       
        elevar();
        edadmedia();
        escuela();
       
		
    }
    
    private static void elevar(){
        System.out.println("Ingrese el Numero1");
        int numero1=sc.nextInt();
        System.out.println("Ingrese el Numero2");
        int numero2=sc.nextInt();
        double elevar = Math.pow(numero2, numero1);
        System.out.println( "El numero1" +numero1 + "elevado al numero2 es " + elevar);
    }
    
    private static void edadmedia(){
        int edad ;
        double altura = 0;
        int edadMedia ;
        double alturaMedia = 0;
        int sumaedad = 0;
        double sumaAltura = 0;
        
        
        for (int i = 1; i < 5; i++) {
            
            System.out.println("ingrese la edad del alumno");
            edad=sc.nextInt();
            System.out.println("ingrese la altura del alumno");
            altura=sc.nextDouble();
            
            sumaedad +=edad;
            sumaAltura +=altura;
            
        }
        
        edadMedia = sumaedad /5;
        alturaMedia = sumaAltura /5;
        
        System.out.println("La edad media de los alumnos es : " +edadMedia +"y su altura media es de :" +alturaMedia);
    
    
    }
    
    private static void escuela(){
    
        int materia;
        double costo;
        double promedio;
        double colegiatura;
        double descuento = 0 ;
        double total;
        
        System.out.println("Escribe el número de materias que cursas");
        materia=sc.nextInt();
        
        System.out.println("Escribe el costo de la materia");
        costo=sc.nextDouble();
        
        System.out.println("Escribe el promedio obtenido en el último periodo");
        promedio=sc.nextDouble();
        
        colegiatura = materia*costo;
        
        if(promedio>=9){
             descuento = colegiatura * 0.30;
             total = colegiatura - descuento;
             
        
        }else{
        
            total = colegiatura + (colegiatura*0.10);
        
        }
        
        
        System.out.println("usted de pagar " +total);
    
    }
}
    

