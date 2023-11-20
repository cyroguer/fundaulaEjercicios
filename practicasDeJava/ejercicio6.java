package practicasdejava;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        int numero;
        Scanner tecladito=new Scanner(System.in);
        do{
            System.out.println("introduce un numero mayor que 0");
            numero=tecladito.nextInt();
        }while(numero<=0);
        System.out.println("el numero qu introduciste es "+numero+ " y es mayor o igual a 0");

    }
}
