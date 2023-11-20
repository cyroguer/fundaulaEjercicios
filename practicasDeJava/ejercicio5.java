package practicasdejava;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner tecladito=new Scanner(System.in);
        System.out.println("ingresa numero 1 : ");
        a= tecladito.nextInt();
        System.out.println("ingresa numero 2 : ");
        b= tecladito.nextInt();
        if (a>=b)
        {
            if (a==b) {System.out.println("los numeros " + a + " y " + b + " son iguales");}
            else {System.out.println("el numero "+a+" es mayor que el numero "+b);}
        }
        else {System.out.println("el numero "+a+" es menor que el numero "+b);}
    }
}