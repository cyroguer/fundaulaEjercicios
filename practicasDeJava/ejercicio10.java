package practicasdejava;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner tecladito=new Scanner(System.in);
        System.out.println("escribe una frase: ");

        String frasesita=tecladito.nextLine();
        char caracter[]=new char[frasesita.length()];
        for (int i=0; i<frasesita.length(); i++){
            caracter[i]=frasesita.charAt(i);
            System.out.println(caracter[i]);

        }



    }
}
