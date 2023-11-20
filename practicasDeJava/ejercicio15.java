package practicasdejava;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class ejercicio15 {
    public static void main(String[] args) {

        int numero = pedirDatos();

        if (numero >= 1 && numero <= 30) {

            boolean siesprimo = checarSiEsPrimo(numero);

            if (siesprimo) {
                imprimirDatos(numero + " es un número primo.");
            } else {
                imprimirDatos(numero + " no es un número primo.");
            }
        } else {
            imprimirDatos("El número ingresado debe estar entre 1 y 30.");
        }
    }

    private static int pedirDatos(){
        Scanner tecladito = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 30: ");
        return tecladito.nextInt();
    }
    private static boolean checarSiEsPrimo(int numero) {
        AtomicBoolean resultado = new AtomicBoolean(true);
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            resultado.set(!(numero % i == 0));
        }
        return resultado.get();
    }

    private static void imprimirDatos(String value) {
        System.out.println(value);
    }
}