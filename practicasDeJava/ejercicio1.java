package practicasdejava;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner tecladito = new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero");
        numero = tecladito.nextInt();
        int sobrante = numero % 2;
        if ( sobrante ==0 )
        {
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero no es par");
        }
    }
}
