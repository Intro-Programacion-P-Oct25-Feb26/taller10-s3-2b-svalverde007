/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/*
Dado el siguiente arreglo

String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
Imprima en pantalla a través de una variable acumuladora solo los estudiantes que tienen como primera letra S,P,T
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";

        System.out.println("--- Estudiantes con iniciales S,P,T  ---\n");

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String nombre = estudiantes[i][j];
                char letra = nombre.charAt(0);
                if (letra == 'S' || letra == 'P' || letra == 'T') {
                    cadena += nombre + ".\n";
                }
            }
        }
        System.out.println(cadena);
    }
}
