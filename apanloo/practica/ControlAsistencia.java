package Practica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ControlAsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> asistencias = new HashMap<>(); 
        String name; 

        System.out.println("Registro de asistencia del gym.");
        System.out.println("Escribe 'fin' para mostrar el resumen de las asistencias.");

        while (true) {
            System.out.println("Ingresa tu nombre: ");
            name = sc.nextLine().trim(); 

            if (name.equalsIgnoreCase("fin")) {
                break;
            }

            asistencias.put(name.toUpperCase(), asistencias.getOrDefault(name.toUpperCase(), 0) + 1);
        }

        System.out.println("Resumen final de asistencia: ");
        for (String x : asistencias.keySet()) {
            System.out.println(x + ": " + asistencias.get(x) + " asistencias");
        }
        System.out.println("Total de personas que asistieron: " + asistencias.size());
        /*Consolas, 'Courier New', monospace */ 
        sc.close();
    }
}
