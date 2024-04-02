package com.mycompany.palindromo;

import java.util.Scanner;

public class Funciones {
    static Scanner scanner = new Scanner(System.in);
    public static void validarPalindromo(){
        String palabra;
        int entrada = 0;
        while(entrada == 0){
            System.out.println("Ingrese la palabra");
            palabra = scanner.nextLine();
            if(validarEspacios(palabra)==false){
                System.out.println("Debe ingresar una palabra, no una frase/oracion con espacios. Intente nuevamente.");
            }
            else{
                System.out.println("================================");
                palindrome(palabra, 0, palabra.length()-1);
                System.out.println("================================");
                entrada = 1;
            }
        }   
    }
    
    public static boolean validarEspacios(String palabra){
        if(palabra.contains(" ")){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static void palindrome(String palabra,int inicio,int fin){
        if (inicio >= fin){
            System.out.println("Es un palindromo");
        }else if (palabra.charAt(inicio) == palabra.charAt(fin)){
            palindrome(palabra, inicio + 1 , fin - 1);
        } else{
            System.out.println("No es Palindromo");
        }
    }
}
