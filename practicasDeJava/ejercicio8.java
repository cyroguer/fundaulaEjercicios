package practicasdejava;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        //Scanner tecladito= new Scanner(System.in);
        //System.out.println("introduce un numero:");
        //String cadenita= String.valueOf(tecladito.next());
        //System.out.print("el numero tiene: " + cadenita.length() +" cifras" );

        Scanner tecladito = new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=tecladito.nextInt();
        }while(numero<0); int contador=0;
        for (int i=numero;i>0;i/=10) contador++;
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }






    }
}
