package Funciones;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");

        int edad = scanner.nextInt();

        if (edad >=18 && edad < 54){
            System.out.println("Tienes " +edad+ " años de edad y eres un adulto!");
        } else if (edad >= 55) {
            System.out.println("Tienes " +edad+ " años de edad y eres un adulto mayor!");
        } else if (edad <= 17) {
            System.out.println("Tienes " +edad+ " años de edad y eres un adolecente!");
        } else if (edad <= 12) {
            System.out.println("Tienes " +edad+ " años de edad y eres un niño!");

        }
    }

    public static boolean mayorEdad(int mayoredad){
        boolean esMayorEdad = mayoredad >=18 && mayoredad <54;
        return esMayorEdad;
    }

}
