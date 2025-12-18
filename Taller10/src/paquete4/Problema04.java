/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/*
Elabore una solución que permita ingresar valores numéricos para dos matrices 
llamadas A y B, cada una de 3 filas y 2 columnas.

La solución debe realizar las siguientes acciones:

Leer y almacenar los valores de la matriz A.
Leer y almacenar los valores de la matriz B.
Mostrar en pantalla todos los elementos de la matriz A, organizados por filas y columnas.
Mostrar en pantalla todos los elementos de la matriz B, organizados por filas y columnas.
Comparar ambas matrices elemento por elemento, considerando únicamente los valores
que se encuentran en la misma fila y columna.
Se debe indicar que la matriz A es mayor que la matriz B únicamente si se cumplen
ambas condiciones:

En todas las posiciones, el valor almacenado en A es mayor o igual que el valor
correspondiente almacenado en B.
Existe al menos una posición en la que el valor de A es estrictamente mayor que el
valor correspondiente de B.
Si alguna de estas condiciones no se cumple, el algoritmo debe mostrar el mensaje:
“La matriz A no es mayor que la matriz B”. Caso contrario, debe mostrar: “La matriz A es mayor que la matriz B”.
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] matriz1 = new double[3][2];
        double[][] matriz2 = new double[3][2];
        String reporte = "";

        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                matriz2[i][j] = entrada.nextInt();
            }
        }
        reporte = String.format("%s\n Matriz A:\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s %d ", reporte, matriz1[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\n Matriz B:\n", reporte);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                reporte = String.format("%s %d ", reporte, matriz2[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        int contadorMenores = 0;
        int contadorMayores = 0;
        int contadorIguales = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (matriz1[i][j] < matriz2[i][j]) {
                    contadorMenores++;
                }
                if (matriz1[i][j] > matriz2[i][j]) {
                    contadorMayores++;
                }
                if (matriz1[i][j] == matriz2[i][j]) {
                    contadorIguales++;
                }
            }
        }

        if (contadorIguales == 6) {
            reporte = String.format("%s\nLa matriz A es igual a la matriz B", reporte);

        } else if (contadorMenores == 0 && contadorMayores > 0) {
            reporte = String.format("%s\nLa matriz A es mayor que la matriz B", reporte);

        } else {
            reporte = String.format("%s\nLa matriz A no es mayor que la matriz B", reporte);
        }
        System.out.println("\n--- Reporte ---\n");
        System.out.println(reporte);
    }
}


