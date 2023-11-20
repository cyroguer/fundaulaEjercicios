package practicasdejava;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {

        imprimirDatos(pedirDatos());
    }

    private static int pedirDatos(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingresa un número del 1 al 7: ");
        return teclado.nextInt();
    }

    private static void imprimirDatos(int numero){
        String[] diadelasemana= {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        System.out.println
                ("El dia de la semana correspondiente al valor " + numero + " es : " + diadelasemana[numero-1]);
    }
}
