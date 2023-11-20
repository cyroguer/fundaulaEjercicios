package javabasicoo;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner teclado =new Scanner(System.in);
        System.out.println("introduce el numero 1:");
        numero1= teclado.nextInt();

        System.out.println("introduce el numero 2:");
        numero2= teclado.nextInt();

        int resultado= numero1 + numero2;

        System.out.println("el resultado de la suma de : " + numero1 + " + " +numero2 + " = " + resultado);

    }
}
