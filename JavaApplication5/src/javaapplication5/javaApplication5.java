
package javaapplication5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yesner
 */
public class javaApplication5 {

    public static void main(String[] args)  throws IOExeption, IOException {
         InputStreamReader capturarteclado = new InputStreamReader(System.in);
         BufferedReader buffer = new BufferedReader(capturarteclado);
         
         System.out.println("Ingrese su nombre");
         String nombre = buffer.readLine();
         System.out.println("Hola" + nombre);
    }

    
    
    
}
