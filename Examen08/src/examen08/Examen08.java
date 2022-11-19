
package examen08;

import java.util.Scanner;

/**
 *
 * @author Yesner Mejía
 */
public class Examen08 {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Smartphone s=new Smartphone();
        //Smartphone
        System.out.println("Datos Smartphone");
        System.out.println("Que marca es:"); s.setMarca(sc.next());
        System.out.println("que sistema tiene"); s.setTipo(sc.next());
        System.out.println("que modelo es"); s.setModelo(sc.next());
        System.out.println("que color es"); s.setColor(sc.next());
        s.llamar();
        s.colgar();
        s.buscar();
        s.ubicar();
        s.foto();
        
        //Notebook
        Notebook n=new Notebook();
        System.out.println("***Datos Notebook***");
        System.out.println("Que marca es:"); n.setMarca(sc.next());
        System.out.println("que sistema tiene"); n.setTipo(sc.next());
        System.out.println("que modelo es"); n.setModelo(sc.next());
        System.out.println("que color es"); n.setColor(sc.next());
        n.llamar();
        n.colgar();
        n.buscar();
        n.ubicar();
        n.foto();
       
        
    }
    
}
