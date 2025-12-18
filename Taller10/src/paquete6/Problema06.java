/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/*
Diseñe un algoritmo que permita leer un número entero o real y, posteriormente,
ingresar los valores numéricos de una matriz de 5 filas y 6 columnas.

Una vez ingresados los datos, el algoritmo debe:

Multiplicar cada elemento de la matriz original por el número leído.

Almacenar el resultado de cada multiplicación en la misma posición de una nueva
matriz, llamada matriz resultante.

Mostrar en pantalla la matriz original.

Mostrar en pantalla la matriz resultante, producto de la multiplicación por el número ingresado.

Cada elemento de la matriz resultante debe corresponder al producto entre el
número ingresado y el valor ubicado en la misma fila y columna de la matriz original.
 */
public class Problema06 {
public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
         double numero;
        double[][] matrizOriginal = new double[5][6];
        double[][] matrizResultante = new double[5][6];

        String reporte = "";

        
        
        System.out.println("Ingrese un número entero o real: ");
        numero = entrada.nextDouble();

        System.out.println("\nIngrese los valores de la matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Valor [%d][%d]: ", i, j);
                matrizOriginal[i][j] = entrada.nextDouble();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * numero;
            }
        }

        reporte = String.format("%s\nMatriz Original:\n", reporte);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizOriginal[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }

        reporte = String.format("%s\nMatriz Resultante (multiplicada "
                + "por %.2f):\n",
                reporte, numero);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                reporte = String.format("%s%.2f ", reporte, 
                        matrizResultante[i][j]);
            }
            reporte = String.format("%s\n", reporte);
        }
        System.out.println("\n\n --- Resultados de las matrices ---");
        System.out.println(reporte);
    }
}

        
        
        