package Funciones;

import java.util.Scanner;

import static Funciones.MayorEdad.mayorEdad;

// Reutilizando el metodo mayorEdad
public class LicenciaConducir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (mayorEdad(edad)) {
            System.out.println("Tu edad es de " + edad + " cumples con los requisitos y puedes manejar");
        } else {
            System.out.println("Aun no cumples con los requisitos de edad para manejar.");
        }
    }
}
