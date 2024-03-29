package com.mycompany.calculadora;

import java.util.Scanner;


public class Menu {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void menu(){
        int op = 0;
        
        do{
            System.out.println("=====================");
            System.out.println("Calculadora Laboratorio 4");
            System.out.println("=====================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Division");
            System.out.println("5. Cerrar programa");
            System.out.println("Digite su opcion:");
            op = scanner.nextInt();
            switch(op){
                case 1:
                    System.out.println("========Suma========");
                    Funciones.sumar();
                    break;
                case 2:
                    System.out.println("========Resta========");
                    Funciones.restar();
                    break;
                case 3:
                    System.out.println("========Multiplicacion========");
                    Funciones.multiplicar();
                    break;
                case 4:
                    System.out.println("========Division========");
                    Funciones.dividir();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
                    break;
            }
        }while(op !=5);
        System.out.println("Hasta prontoo");
    }
    
}
