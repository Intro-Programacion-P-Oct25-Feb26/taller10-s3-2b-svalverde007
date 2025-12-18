/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/*
Elabore una solución que permita ingresar valores numéricos para una matriz X de 3 filas y 3 columnas.

Una vez ingresados los datos, se debe realizar las siguientes acciones:

Para cada valor de la matriz X, calcular el resultado de la expresión:

(x + 1) * (x + 1)
y guardar estos resultados en una nueva matriz llamada A.

Para los mismos valores de la matriz X, calcular el resultado de la expresión:

x * x + 2 * x + 1
y guardar estos resultados en otra matriz llamada B.

Comparar las matrices A y B, posición por posición (misma fila y misma columna).

Verificar si en todas las posiciones los valores de la matriz A son iguales a los
valores de la matriz B.

Mostrar un mensaje indicando: que la identidad algebraica se cumple, si todos
los valores coinciden, o que la identidad algebraica no se cumple, si existe al menos
una posición donde los valores sean diferentes.
 */
public class Problema07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int[][] matriz = new int[3][3];
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int numero;
        int igual = 0;
        String reporte = "";

        System.out.println("Ingrese los valores de la matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.printf("Matriz[%d][%d]: ", fila, col);
                numero = entrada.nextInt();
                matriz[fila][col] = numero;

            }
        }
        
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                matrizA[fila][col] = (matriz[fila][col] + 1) * (matriz[fila][col] + 1);
            }
        }
        
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                matrizB[fila][col] = (matriz[fila][col] * matriz[fila][col]) + 
                                (2 * matriz[fila][col]) + 1;
            }
        }
        reporte = String.format("%s\nMatriz Original:\n", reporte);
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                reporte = String.format("%s%d ", reporte, matriz[fila][col]);
            }
            reporte = String.format("%s\n", reporte);
        }
        reporte = String.format("%s\nMatriz A:\n", reporte);
        
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                reporte = String.format("%s%d ", reporte, matrizA[fila][col]);
            }
            reporte = String.format("%s\n", reporte);
        }
        reporte = String.format("%s\nMatriz B:\n", reporte);
        
        for (int fila = 0; fila < matrizB.length; fila++) {
            for (int col = 0; col < matrizB[fila].length; col++) {
                reporte = String.format("%s%d ", reporte, matrizB[fila][col]);
            }

            reporte = String.format("%s\n", reporte);
        }
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int col = 0; col < matrizA[fila].length; col++) {
                if (matrizA[fila][col] == matrizB[fila][col]) {
                    igual = igual + 1;
                }

            }
        }
        if (igual == 9) {
            reporte = String.format("%sLa identidad algebraica es igual\n", reporte);
        } else {
            reporte = String.format("%sLa identidad algefraica no es igual\n", reporte);
        }

        System.out.println("\n\n --- Resultados de las matrices ---");
        System.out.println(reporte);
    }

}
