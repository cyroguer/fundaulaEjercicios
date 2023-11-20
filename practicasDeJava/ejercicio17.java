package practicasdejava;

import java.util.Scanner;
public class ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero entero:");
            numeros[i] = teclado.nextInt();
        }
        System.out.println();

    }

}


