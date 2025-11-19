package org.example.login;

import java.util.Scanner;

public class AdrianaMonterroza {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Datos quemados (base de datos)
        String usuarioBaseDatos = "Adri";
        String correoBaseDatos = "adri@gmail.com";
        Integer contraseñaBaseDatos = 12345;

        int intentos = 0;
        boolean acceso = false;

        while (intentos < 4 && !acceso) {

            System.out.println("LOGIN DEL ZOOLÓGICO");

            System.out.print("Ingrese el usuario: ");
            String usuario = entrada.nextLine();

            System.out.print("Ingrese el correo: ");
            String correo = entrada.nextLine();

            System.out.print("Ingrese la contraseña: ");
            Integer contraseña = Integer.parseInt(entrada.nextLine());

            if (usuario.equals(usuarioBaseDatos) &&
                    correo.equals(correoBaseDatos) &&
                    contraseña.equals(contraseñaBaseDatos)) {

                System.out.println("\n Bienvenido  💕");
                acceso = true;

            } else {
                intentos++;
                System.out.println("✖️ Auch Datos incorrectos. Intento " + intentos + " de 4\n");
            }
        }

        if (!acceso) {
            System.out.println("✖️ Lo siento, superaste los 4 intentos, intenta más tarde");
            System.exit(0);
        }

    }
}
