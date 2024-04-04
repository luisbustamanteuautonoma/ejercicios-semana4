package com.mycompany.controlsemana5;

public class sfsafsa {

    public static void funcion(int numero) {
        int resto;
        int invertido = 0;
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println("Número invertido: " + invertido);
    }
}
/*Este codigo lo hice para poner cambiarlo a funcion recursiva :)*/
