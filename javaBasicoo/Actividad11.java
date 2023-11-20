package javabasicoo;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("introduce el enunciado: ");
        //String cadena=teclado.nextLine();

        //String []partes= cadena.split(" ");
       // System.out.println(Arrays.toString(partes));


        // yo
        while (teclado.hasNext()) {
            System.out.println(teclado.next());

        }
    }
}
