/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
Una institución registra la asistencia de 4 estudiantes durante 5 días (lunes a viernes).

boolean[][] asistencia = {
    {true, true, false, true, true},
    {true, false, false, true, false},
    {true, true, true, true, true},
    {false, true, true, false, true}
};

String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

Actividades:

Determine cuántos días asistió cada estudiante, usar un arreglo unidimensional para almacenar dicha información
Presentar información por cada estudiante
Indique si el estudiante cumple asistencia completa (5 días).
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        System.out.println("---Reporte de Asistencia---\n");

        for (int i = 0; i < estudiantes.length; i++) {
            int contador = 0;
            System.out.println("Estudiante:" + estudiantes[i]);

            for (int b = 0; b < dias.length; b++) {
                String estado = "";

                if (asistencia[i][b] == true) {
                    estado = "Presente";
                    contador = contador + 1;
                } else {
                    estado = "Ausente";
                }
                System.out.println("  " + dias[b] + ": " + estado);

            }
            System.out.println("Total asistencias: " + contador + " días\n");
        }
    }

}
