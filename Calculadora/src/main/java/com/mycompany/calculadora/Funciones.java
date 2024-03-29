package com.mycompany.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

    static Scanner scanner = new Scanner(System.in);

    static void sumar() {
        int numA, numB, suma;
        int entrada = 0;
        while (entrada == 0) {
            try {
                System.out.println("Ingrese un numero:");
                numA = scanner.nextInt();
                System.out.println("Ingrese el otro numero:");
                numB = scanner.nextInt();

                suma = numA + numB;
                System.out.println("=====================");
                System.out.println("La suma es: " + suma);
                System.out.println("=====================");
                entrada = 1;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese numeros enteros.");
                scanner.nextLine();
            }
        }
    }

    static void restar() {
        int numA, numB, resta;
        int entrada = 0;
        while (entrada == 0) {
            try {
                System.out.println("Ingrese un numero:");
                numA = scanner.nextInt();
                System.out.println("Ingrese el otro numero:");
                numB = scanner.nextInt();
                resta = numA - numB;
                System.out.println("=====================");
                System.out.println("La resta es: " + resta);
                System.out.println("=====================");
                entrada = 1;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese numeros enteros.");
                scanner.nextLine();
            }
        }
    }

    static void multiplicar() {
        int numA, numB, mult;
        int entrada = 0;
        while (entrada == 0) {
            try {
                System.out.println("Ingrese un numero:");
                numA = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                numB = scanner.nextInt();
                mult = numA * numB;
                System.out.println("=====================");
                System.out.println("El producto es " + mult);
                System.out.println("=====================");
                entrada = 1;
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese numeros enteros.");
                scanner.nextLine();
            }
        }
    }

    static void dividir() {
        int numA, numB, div;
        int entrada = 0;
        while (entrada == 0) {
            try {
                System.out.println("Ingrese un numero:");
                numA = scanner.nextInt();
                System.out.println("Ingrese otro numero:");
                numB = scanner.nextInt();
                if (numB == 0){
                    System.out.println("El segundo numero no puede ser cero (0), ingrese nuevamente.");
                    entrada = 0;
                }
                else{
                    div = numA/numB;
                    System.out.println("=====================");
                    System.out.println("La division es " + div);
                    System.out.println("=====================");
                    entrada = 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error. Ingrese numeros enteros.");
                scanner.nextLine();
            }
        }
    }
}
