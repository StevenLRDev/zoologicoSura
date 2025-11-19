package org.example.Felinos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MaferHernandez {
    static void main() {
        // FELINOS-LISTA
        Scanner tecladoUsuario = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> animales = new ArrayList<>();

        while (true) {
            // Crear un nuevo diccionario por cada felino
            HashMap<String, Object> felino = new HashMap<>();

            // --- SALIR ---
            System.out.print("Ingresa el nombre de un felino (o escribe SALIR para terminar): ");
            String nombre = tecladoUsuario.nextLine();

            if (nombre.equals("SALIR")) {
                break; // sale del while
            }

            felino.put("nombre", nombre);

            System.out.print("Ingresa el alimento del felino: ");
            String alimento = tecladoUsuario.nextLine();
            felino.put("alimento", alimento);

            System.out.print("Ingresa la edad del felino: ");
            int edad = tecladoUsuario.nextInt();
            felino.put("edad", edad);

            System.out.print("Ingresa la fecha de entrada al zoologico del felino: ");
            int fechaEntrada = tecladoUsuario.nextInt();
            felino.put("fecha de entrada", fechaEntrada);

            tecladoUsuario.nextLine(); // salto de linea

            // Guardar el diccionario dentro del ArrayList
            animales.add(felino);
            System.out.println("\n=== FELINOS GUARDADOS ===");
            System.out.println(animales);
        }
        tecladoUsuario.close();


    }

}
