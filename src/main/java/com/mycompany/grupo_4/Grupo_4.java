/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_4;

/**
 *
 * @author DAVID
 */
public class Grupo_4 {
import java.util.Scanner;

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n1. Calcular factorial");
            System.out.println("2. Tabla de multiplicar");
            System.out.println("3. Números amigos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Número: ");
            int n = sc.nextInt();
            int resultado = 1;
            for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
    System.out.println("Factorial: " + resultado);
    }
            else if (opcion == 2) {
            System.out.print("Número: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
            else if (opcion == 3) {
            System.out.print("Primer número: ");
            int a = sc.nextInt();
            System.out.print("Segundo número: ");
            int b = sc.nextInt();

            int suma1 = 0;
            for (int i = 1; i < a; i++) {
            if (a % i == 0) {
            suma1 += i;
        }
    }
            int suma2 = 0;
            for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                suma2 += i;
        }
    }

            if (suma1 == b && suma2 == a) {
                System.out.println("Son amigos.");
            } else {
                System.out.println("No son amigos.");
        }
    }
            else if (opcion == 0) {
                System.out.println("Fin del programa.");
        }

            else {
                System.out.println("Opción inválida.");
            }
        }
    }
}
