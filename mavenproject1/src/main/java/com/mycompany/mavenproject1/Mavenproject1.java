package com.mycompany.mavenproject1;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Mavenproject1 {

    public static void main(String[] args) 
            throws IOExeption {
         InputStreamReader capturarteclado = new InputStreamReader(System.in);
         BufferedReader buffer = new BufferedReader(capturarteclado);
         
         System.out.println("Ingrese su nombre");
         String nombre = reader.readLine();
         System.out.println("Hola" + nombre);
        
    }
}
