package org.example.MamiferosGrandes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FannerysGuardia {
    static void main() {
        Scanner tecladoUsuario = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferos = new ArrayList<>();

        while (true) {

            // Crear un nuevo diccionario por cada mamífero
            HashMap<String, Object> mamiferoGrande = new HashMap<>();

            // --- SALIR ---
            System.out.print("Ingresa el nombre de un mamífero grande (o escribe SALIR para terminar): ");
            String nombre = tecladoUsuario.nextLine();

            if (nombre.equalsIgnoreCase("SALIR")) {
                break; // sale del while
            }

            mamiferoGrande.put("nombre", nombre);

            System.out.print("Ingresa el alimento del mamífero: ");
            String alimento = tecladoUsuario.nextLine();
            mamiferoGrande.put("alimento", alimento);

            System.out.print("Ingresa la edad del mamífero: ");
            int edad = tecladoUsuario.nextInt();
            mamiferoGrande.put("edad", edad);

            System.out.print("Ingresa la fecha de entrada al zoológico del mamífero: ");
            int fechaEntrada = tecladoUsuario.nextInt();
            mamiferoGrande.put("fechaEntrada", fechaEntrada);

            // Saltar linea
            tecladoUsuario.nextLine();

            // Guardar el diccionario dentro del ArrayList
            mamiferos.add(mamiferoGrande);

            System.out.println("\n=== MAMÍFEROS GUARDADOS ===");
            System.out.println(mamiferos);
        }

        tecladoUsuario.close();
    }
}