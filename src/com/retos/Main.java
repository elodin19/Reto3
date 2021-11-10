package com.retos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fullName;
        Boolean again = false;
        String[] nameParts = new String[3];

        do {
            System.out.println("\nDigite un nombre completo: ");
            fullName = scanner.nextLine();
            nameParts = Name.splitName(fullName);

            if (Name.isSurename(nameParts)){
                System.out.println("Nombre: " + nameParts[0] + "\n"
                                    + "Apellido 1: " + nameParts[1] + "\n"
                                    + "Apellido 2: " + nameParts[2]);
            } else {
                System.out.println("Nombre: " + nameParts[0] + " " + nameParts[1] + "\n"
                                    + "Apellido: " + nameParts[2]);
            }

            System.out.println("\n¿Otra vez? (boolean) ");
            again = scanner.nextBoolean();
            scanner.nextLine(); // Eso si hace para limpiar el scanner
        } while (again);

        System.out.println("Bye");
    }
}
