package javabasicoo;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        int radio;

        Scanner teclado = new Scanner (System.in);
        System.out.println("radio:");
        radio = teclado.nextInt();

        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("el area del circulo es: " +area);



    }
}
