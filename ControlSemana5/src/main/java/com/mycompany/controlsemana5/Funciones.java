package com.mycompany.controlsemana5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * *Usando recursividad, desarrolle un programa que reciba un número ingresado
 * por teclado y me lo devuelva invertido. * Ejemplo
 *
 * El usuario ingresa 2586 y debería retornar 6852
 */
public class Funciones {

    static Scanner scanner = new Scanner(System.in);

    public static void ingreso() {
        int entrada = 0;
        int numero;
        while (entrada == 0) {
            try {
                System.out.println("Ingrese numero: ");
                numero = scanner.nextInt();
                voltearNumero(numero,0);
                entrada = 1;
            } catch (InputMismatchException e) {
                System.out.println("Valor ingresado no valido. Ingrese un entero");
                entrada = 0;
                scanner.nextLine();
            }
        }
    }

    /*2425*/
    public static void voltearNumero(int numero, int invertido) {
        if (numero == 0) {
            System.out.println("Numero invertido: " + invertido);
            return;
        }
        int resto = numero % 10;
        invertido = invertido * 10 + resto;
        voltearNumero(numero / 10, invertido);
    }

}
