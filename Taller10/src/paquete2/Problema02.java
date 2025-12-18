/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Se registran las edades de personas en 3 familias (4 integrantes cada una).
 *
 * int[][] edades = { {5, 12, 35, 40}, {8, 15, 33, 38}, {6, 10, 30, 36} };
 * Actividades:
 *
 * Cuente cuántos menores de edad existen en total. A través de un arreglo
 * adecuado, almacene y presente cuántos adultos hay por familia.
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        int menores = 0;
        int[] adultosFamilia = new int[edades.length];

        System.out.println("--- Reporte ---\n");

        for (int i = 0; i < edades.length; i++){
        
        int adultos = 0;
            // System.out.println("Familia 1:" + familia[i]);

            for (int b = 0; b < edades[i].length; b++) {
                if (edades[i][b] < 18) {
                    menores++;
                } else {
                    adultos++;
                }
            }
            adultosFamilia[i] = adultos;
        }
        System.out.println("Total de menores de edad: " + menores);
        for (int i = 0; i < adultosFamilia.length; i++) {
            System.out.println("Familia " + (i + 1) + ": " + adultosFamilia[i] 
                    + " adultos.");
            
        }
    }
}
  