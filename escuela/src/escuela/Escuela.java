
package escuela;

import java.util.Scanner;


public class Escuela {

    
    public static void main(String[] args) {
       double materias, costo, promedio, colegiatura, descuento = 0, total;
       Scanner leer=new Scanner(System.in);
        System.out.println("Escribe el número de materias que cursas:");
        materias=leer.nextDouble();
        System.out.println("Escribe el costo de la materia");
        costo=leer.nextDouble();
        System.out.println("Escribe el promedio obtenido en el último periodo");
        promedio=leer.nextDouble();
        colegiatura=materias*costo;
        
        
        if(promedio>=90){
            descuento=colegiatura*0.3;
            total=colegiatura-descuento;
        }else{
           total=colegiatura+(colegiatura*0.1);
        }
        System.out.println("El descuento es :" + descuento);
        System.out.println("Total apagar es :" +total);
    }
    
}
