package Funciones;

import java.util.Scanner;
// implementacion de funcion y libreria Math para calcular indice de masa corporal
public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la estatura en centimetros: ");
        double alturaCentimetros = scanner.nextDouble();
        System.out.println("Ingresa el peso en kilogramos: ");
        int pesoKg = scanner.nextInt();

        System.out.println("Tu indice de masa corporal es de: " +indiceMasaCorporal(alturaCentimetros,pesoKg));

    }

    public static double indiceMasaCorporal(double alturaCentimetros, int pesoKg){
        return pesoKg / (Math.pow(alturaCentimetros, 2));
    }


}
