
package matris;

import java.util.Scanner;


public class Matris {

    
    public static void main(String[] args) {
        
        double matriz[][] = new double [4][4];
        Scanner sc = new Scanner(System.in);
        double suma=0;
        
        
        //for para cargar la matriz
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                
                System.out.println("ingrese el alumno n" + f);
                matriz[f][c] = sc.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma /3;
            suma =0;
        }
        
        //for para recorrerla
        
        for (int f = 0; f < 4; f++) {
            System.out.println("las notas del alumno n " + f + "son:");
            for (int c = 0; c < 3; c++) {
                
                System.out.println("Notas n" + c + matriz[f][c]);
                
            }
            System.out.println("el promedio de las notas es:" +matriz[f][3]);
            
        }
    }
        
}
