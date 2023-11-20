package javabasicoo;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellido;
		int edad;
		
		
		Scanner pantalla = new Scanner (System.in);
		System.out.print("nombre:");
		 nombre = pantalla.next();

		System.out.print("apellido:");
		apellido = pantalla.next();

		System.out.print("edad:");
		edad = pantalla.nextInt();
		
		
		
		System.out.println("su nombre es: " + nombre + " "+ apellido +" y tienes "+ edad+ " años");

	}

}
