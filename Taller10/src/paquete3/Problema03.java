/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Locale;
import java.util.Scanner;

/*
Sensores de seguridad instalados en 4 zonas durante 6 revisiones.

boolean[][] sensores = {
    {true, true, true, true, true, true},
    {true, false, true, false, true, false},
    {false, false, false, false, false, false},
    {true, true, false, true, true, false}
};
Actividades:

Determine cuántas zonas funcionan sin fallos.

Indique qué zonas presentan al menos un fallo (false).

 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        int zona = 0;
        String reporte = "";

        System.out.println("--- Reporte de funcionamiento ---\n");

        for (int i = 0; i < sensores.length; i++) {
            boolean zonaFuncional = true;
            
            for (int b = 0; b < sensores[i].length; b++) {
                if (!sensores[i][b]) {
                    zonaFuncional = false;
                }
            }
            if (zonaFuncional) {
                zona++;
                System.out.println("Zona " + (i + 1) + ": Funciona correctamente.");
            } else {
                System.out.println("Zona " + (i + 1) + ": Presenta uno o mas fallos.");
            }
        }
        reporte = String.format("%s\nTotal de zonas sin fallos: %d.",
                reporte, zona);
        System.out.println(reporte);
    }
}
