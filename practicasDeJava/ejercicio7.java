package practicasdejava;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner tecladito = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String diasdelasemana = tecladito.next();

        switch (diasdelasemana) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" ->
                    System.out.println(diasdelasemana + " es un dia laboral ");
            case "sabado", "domingo" -> System.out.println(diasdelasemana + "  es un dia no laboral ");
            default -> System.out.println("Escribe un dia de la semana");
        }
    }
}
