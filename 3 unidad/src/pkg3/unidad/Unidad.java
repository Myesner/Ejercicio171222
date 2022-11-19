
package pkg3.unidad;

import java.util.Scanner;

/**
 *
 * @author yesner
 */
public class Unidad {

    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        int [] numeros={44,55,12,42,94,18,06,67};
        int op;
        
        do{
            System.out.println("\n\nMENU DE METODOS DE OREDNAMIENTOS");
            System.out.println("\n**digite una opcion**");
            System.out.println("--------------");
            System.out.println("1. Burbuja");
            System.out.println("2. Monticulos ");
            System.out.println("3. Seleccion");
            System.out.println("4. Insercion");
            System.out.println("5. Quicksort");
            System.out.println("6. Shell");
            System.out.println("7. Salir");
            System.out.println("--------------");
            op=leer.nextInt();
        switch(op){
            case 1 -> {
                System.out.println("\n\nNumeros desordenados");
                System.out.println("--------------");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print(numeros[i]+" ");
                }
                burbuja(numeros);
                System.out.println("\n\nNumeros ordenados");
                System.out.println("--------------");
                for (int i = 0; i <numeros.length; i++) {
                    System.out.print(" "+numeros[i]);
                }
            }
            case 2 -> {
                int i;
                System.out.println("\n\nNumeros Desordenados");
                System.out.println("--------------");
                   for (int numero : numeros){ 
                      System.out.print(" "+numero);}
                   for (i = numeros.length; i > 1; i--) {
                          fnSortHeap(numeros, i -1);
                      }
                
                  System.out.println("\n\nNumeros Ordenados");
                  System.out.println("---------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
            }
            case 3 -> {
                System.out.println("\n\nNumeros Desordenados");
                System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
                  seleccion(numeros);
                  System.out.println("\n\nNumeros Ordenados");
                  System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
            }
            case 4 -> {
                System.out.println("\n\nNumeros Desordenados");
                System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
                  insercion(numeros);
                  System.out.println("\n\nNumeros Ordenados");
                  System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
            }
            case 5 -> {
                System.out.println("\n\nNumeros Desordenados");
                System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                } 
                  quicksort(numeros, 0,numeros.length-1);
                  System.out.println("\n\nNumeros Ordenados");
                  System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
            }
            case 6 -> {
                System.out.println("\n\nNumeros Desordenados");
                System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                } 
                  ordenacionShell(numeros, 8);
                  System.out.println("\n\nNumeros Ordenados");
                  System.out.println("--------------");
                  for (int numero : numeros) {
                      System.out.print(" "+numero);
                }
            }
            case 7 -> System.out.println("\n**Gracias por usar el Sistema**");

            default -> System.out.println("**Digite un numero valido**");
        }
        
        }while(op!=7);
        
    }
  //Metodo de Ordenamiento por Burbuja
    public static void burbuja(int[] arrayN){
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN.length-1; j++) {
              if(arrayN[j]>arrayN[j+1]){
                  int temp=arrayN[j];
                    arrayN[j]=arrayN[j+1];
                    arrayN[j+1]=temp;
                    
                }
            }
            
        }
    
    }
    
  //Metodo de Ordenamiento por Insercion  
    public static void insercion(int[] arrayN){
        for (int i = 0; i < arrayN.length; i++) {
            int temp=arrayN[i];
            int j=i-1;
            while (j>=0 && arrayN[j]>temp) {                
                arrayN[j+1]=arrayN[j];
                j--;
            }
            arrayN[j+1]=temp;
        }
    
    }
    
  //Metodo de Ordenamiento por seleccion  
    public static void seleccion(int[] arrayN){
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN.length; j++) {
               if(arrayN[j]>arrayN[i]){
                   int temp=arrayN[j];
                   arrayN[j]=arrayN[i];
                   arrayN[i]=temp;
               } 
            }
        }
    }
    
    //Metodo de Ordenamiento rapido(quicksort)
    public static void quicksort(int[] arrayN, int izq, int der){
        
        double pivote=arrayN[(izq+der)/2];
        int i=izq;
        int j=der;
        int tem;
        
        do{
            while(arrayN[i]<pivote)i++;
            while(arrayN[j]>pivote)j--;
            
            if(i<=j){
                 tem=arrayN[i];
                 arrayN[i]=arrayN[j];
                 arrayN[j]=tem;
                 i++;
                 j--;
            }
           
        }while (i<=j);
        
        if(izq < j){
            quicksort(arrayN, izq, j);
        }
        if(i<der){
            quicksort(arrayN, i, der);
        }
    }
    
    //Metodo de Ordenamiento Monticulos
    public static void fnSortHeap(int arrayN[],int arrayN2){
     int i, o;
        int lCh, rCh, mCh, root, tmp;
          root = (arrayN2-1)/2;

            for(o = root; o >= 0; o--){
               for(i=root;i>=0;i--){
                   lCh = (2*i)+1;
                   rCh = (2*i)+2;
                if((lCh <= arrayN2) && (rCh <= arrayN2)){
                    if(arrayN[rCh] >= arrayN[lCh]){
                        mCh = rCh;
                    }
                    else{
                        mCh = lCh;
                    }
                }
                else{
                    if(rCh > arrayN2){
                       mCh = lCh;
                    }
                    else{
                       mCh = rCh;
                    }
                }

                if(arrayN[i] < arrayN[mCh]){
                    tmp = arrayN[i];
                    arrayN[i] = arrayN[mCh];
                    arrayN[mCh] = tmp;
                }
            }
        }
          tmp = arrayN[0];
          arrayN[0] = arrayN[arrayN2];
          arrayN[arrayN2] = tmp;
    }
    
    //Metodo de Ordenamiento shell
    public static void ordenacionShell(int arrayN[], int n){
        int intervalo, i, j, k;
           intervalo = n / 2;
             while (intervalo > 0){
                for (i = intervalo; i < n; i++){
                     j = i - intervalo;
             while (j >= 0){
                   k = j + intervalo;
            if (arrayN[j] <= arrayN[k])
              j = -1; 
           else{
               int temp;
               temp = arrayN[j];
               arrayN[j] = arrayN[k];
               arrayN[k] = temp;
              j -= intervalo;
            }
         }
       }
            intervalo = intervalo / 2;
     }
  }
}
