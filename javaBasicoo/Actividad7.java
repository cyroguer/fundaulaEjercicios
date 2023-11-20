package javabasicoo;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("palabra 1:");
        String palabra1 = teclado.next();
        System.out.println("palabra 2:");
        String palabra2 = teclado.next();

        if (palabra1.equals(palabra2)){
            System.out.println("son igualessss");
        }
        else
            System.out.println("no son igualesssss");







    }
}
