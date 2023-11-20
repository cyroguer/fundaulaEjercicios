package practicasdejava;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero + " es múltiplo de 10.");
        } else {
            System.out.println(numero + " no es múltiplo de 10.");
        }

    }
}
