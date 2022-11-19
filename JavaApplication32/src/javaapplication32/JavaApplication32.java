/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Arrays;

/**
 *
 * @author yesner
 */
public class JavaApplication32 {

    
    public static void main(int [] arrayN, int izq, int der) {
        int [] numeros={44,55,12,42,94,18,06,67}; 
        int i=izq;
      int j=der -1;
      int temp;
       int pivote=numeros[(i+j)/2];
      while(i<=j){
       while (arrayN[i]<= pivote && i<j) i++;
              while(arrayN[j]>pivote)  j--;
              if(i<j){
                  temp=arrayN[i];
                  arrayN[i]=arrayN[j];
                  arrayN[j]=temp;
                  i++;
                  j--;
              }
      } 
                   arrayN[izq]=arrayN[j];
      arrayN[j]=pivote;
      
                  if(izq<j){
          main(arrayN, izq, j);
      }
                if(j<der){
          main(arrayN, j, der);
     }    
                System.out.println("numeros ordenados" + Arrays.toString(arrayN));
            }
        
       
    }
      
           
      
 
    
    

