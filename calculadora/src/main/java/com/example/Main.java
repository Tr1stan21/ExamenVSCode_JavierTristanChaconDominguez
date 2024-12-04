package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer operando: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresa el operador: ");
        char operador = scanner.next().charAt(0);

        System.out.println("Ingresa el segundo operando: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        int resultado;

        if (operador = '+') {
            resultado = numero1 + numero2;
        } else if (operador = '-') {
            resultado = numero1 + numero2;
        } else if (operador = '*') {
            resultado = numero1 * numero2;
        } else if (operador = '/') {
            resultado = numero1 / numero2;
        }

        System.out.println("El resutado es: " + resultado);

    }
}