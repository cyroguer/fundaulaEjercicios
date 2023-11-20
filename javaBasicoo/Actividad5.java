package javabasicoo;
//import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;


public class Actividad5 {
    public static void main(String[] args) throws IOException {

        char letra;

        Scanner teclado = new Scanner (System.in);
        System.out.println ("introduce letras: ");
        //letra = (char) System.in.read();
        //letra = teclado.next().charAt(0);
        letra = teclado.next().toCharArray()[0];

        int codigo = letra;

        System.out.println("el numero es : " + codigo);






        //String texto= JOptionPane.showInputDialog("Introduce un carácter");

        //char caracter=texto.charAt(0);
       // int codigo= (int) caracter;
       // System.out.println(codigo);
    }
}
