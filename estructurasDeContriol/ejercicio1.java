package estructurasdecontriol;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero=teclado.nextInt();
        if (numero % 5==0){
            System.out.println("el numero es multiplo de 5");
        }
            else{
                System.out.println("el numero no es multiplo de 5");
        }




    }
}
