package com.mycompany.palindromo;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    
    public static void menu(){
        int op = 0;
        do{
            System.out.println("================================");
            System.out.println("Validar palabra palindromo");
            System.out.println("1. Verificar");
            System.out.println("2. Salir del programa");
            System.out.println("================================");
            System.out.println("Ingrese su opcion: ");
            op = scanner.nextInt();
            switch(op){
                case 1:
                    Funciones.validarPalindromo();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Ingrese una opcioón valida");
            }
        }while(op != 2);
        System.out.println("Hasta pronto.");
    }
}
