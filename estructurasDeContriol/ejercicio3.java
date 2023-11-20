package estructurasdecontriol;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        boolean incorrecto= true;

        do {
            System.out.println("introduce un numero");
            numero =teclado.nextInt();
            if (numero>0) {
                System.out.println("el numero es correcto");
                incorrecto=false;
            } else{
                    System.out.println("el numero es no correcto");
                }
        } while (incorrecto);
    }
}
