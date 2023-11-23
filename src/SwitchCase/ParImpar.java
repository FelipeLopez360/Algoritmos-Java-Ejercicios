package SwitchCase;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// Uso de Switch case para saber si un número es par o impar.

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entre 0 y 9.");

        int numero = scanner.nextInt();

        switch (numero){
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            {
                System.out.println("El número es Par!");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            {
                System.out.println("El número es Impar!");
                break;
            }
            default:
            {
                System.out.println("Número invalido... ingresa un digito entre 0 y 9");
            }
        }
    }
}
