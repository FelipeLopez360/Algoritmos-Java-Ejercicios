package SwitchCase;

import java.util.Scanner;

// Uso de Switch case
public class DiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana: ");

        String diaSemana = scanner.nextLine();

        switch (diaSemana){
            case "Lunes":{
                System.out.println("Hoy se estudia Java");
                break;
            }
            case "Martes":{
                System.out.println("Hoy se estudia Spring Boot");
                break;
            }
            case "Miercoles":{
                System.out.println("Hoy se entrena en el gym");
                break;
            }
            case "Jueves":{
                System.out.println("Hoy se estudia Cloud");
                break;
            }
            case "Viernes":{
                System.out.println("Hoy se estudia JavaScript");
                break;
            }
            case "Sabado":{
                System.out.println("Hoy se entrena en el gimnasio");
                break;
            }
            case "Domingo":{
                System.out.println("Hoy se dedica a la familia");
                break;
            }
            default: {
                System.out.println("Escribe la primera letra en mayuscula! 'obligatorio debe ser un dia de la semana'");

            }
        }
    }
}
