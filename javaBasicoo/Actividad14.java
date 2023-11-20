package javabasicoo;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        double iva= 1.21;
        int precio;
        double precioFinal;

        Scanner teclado =new Scanner(System.in);
        System.out.println("introduce el precio del producto:");
        precio= teclado.nextInt();

        precioFinal= precio * iva;
        System.out.println("el precio final es: " +precioFinal);


    }
}
