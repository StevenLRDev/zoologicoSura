package org.example.mamiferosPequenios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class stevenRios {
    static void main(String[]args) {
        //Mamiferos Pequenios
     Scanner tecladoUsuario=new Scanner(System.in);

        ArrayList<HashMap<String,Object>>mamiferosPequenitos=new ArrayList<>();
        String opcionDigitadaUsuario;


        while(true) {
            HashMap<String, Object> mamiferosPequenios = new HashMap<>();
            System.out.println("🐻 Bienvenido al sistema de mamiferos 🐇 ");

            System.out.print("Digite cualquier cosa para continuar, de lo contrario (SALIR): ");
            opcionDigitadaUsuario= tecladoUsuario.nextLine();
            if (opcionDigitadaUsuario.equalsIgnoreCase("SALIR")){
                break;
            }

            System.out.print("Inserte el nombre del Mamifero 📝 : ");
            mamiferosPequenios.put(" Nombre Mamifero: " , tecladoUsuario.nextLine());

            System.out.print("Inserte la dieta alimenticia del Mamifero 🍽 :");
            mamiferosPequenios.put(" Alimentos Mamifero: " , tecladoUsuario.nextLine());

            System.out.print("Inserte el Id del mamifero #️⃣ : ");
            mamiferosPequenios.put (" ID Mamifero: ",tecladoUsuario.nextInt());

            System.out.print("Inserte la Edad del mamifero 🕰 : ");
            mamiferosPequenios.put(" Edad Mamifero:", tecladoUsuario.nextInt());

            System.out.print("Inserte la fecha de entrada del Mamifero 📆 : ");
            mamiferosPequenios.put(" Fecha Entrada: ", tecladoUsuario.nextInt());
            tecladoUsuario.nextLine();

            mamiferosPequenitos.add(mamiferosPequenios);

            System.out.print(" ___====MAMIFEROS PEQUEÑOS GUARDADOS====___ ");
            System.out.print("Lista: " + mamiferosPequenitos);


            tecladoUsuario.close();
        }

    }
}
