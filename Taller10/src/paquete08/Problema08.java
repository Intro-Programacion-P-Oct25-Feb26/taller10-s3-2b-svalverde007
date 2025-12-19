/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

import java.util.Locale;
import java.util.Scanner;

/*
Dado el siguiente código

public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double[][] dato2 = {{10, 1, 2},{10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
    }
Genere una solución
 */
public class Problema08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        String reporte = "";

        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (j <= i) {
                    reporte = String.format("%s%.0f\t", reporte, dato1[i][j]);
                } else {
                    reporte = String.format("%s%.0f\t", reporte, dato2[i][j]);
                }
            }
            reporte = String.format("%s\n", reporte);
        }
        System.out.println(reporte);
    }
}


