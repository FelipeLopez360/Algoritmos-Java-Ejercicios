package IfElse;

import java.util.Scanner;

//Evalua si eres mayor o menor de edad y te da un mensaje especial si tienes mas de 65 años.
public class Discoteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        int edad = scanner.nextInt();

        if (edad >= 18 && edad < 65){
            System.out.println("Tienes "+edad+ " Y eres mayor de edad!");
        } else if (edad >= 65){
            System.out.println("Tienes "+edad+ " Y te felicito por tener espiritu joven!");{
            }
        } else
            System.out.println("Tienes "+edad+ " Y eres menor de edad!");
    }
}
