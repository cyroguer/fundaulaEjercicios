package practicasdejava;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();


        if (numero % 2 == 0) {
            System.out.println("El numero " +numero + " es par.");
        } else {
            System.out.println("El numero " +numero + " es impar.");
        }

    }
}
