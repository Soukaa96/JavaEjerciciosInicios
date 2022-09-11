package ejmplo1.ej1;

import java.util.Scanner;

public class ej1Suma {
//Realiza un programa en Java que lea dos números pasados por teclado y muestre la suma por pantalla.
	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);

		// Declation de los variables
		int n1 = 0;
		int n2 = 0;
		int suma = 0;
		// preguntamos el usuario por los dos numeros que quiere sumar
		System.out.println("Entra el primer número por favor: ");
		n1 = Keyboard.nextInt();
		System.out.println("Entra el segundo número por favor: ");
		n2 = Keyboard.nextInt();

		// la condition para realisar la suma
		suma = n1 + n2;

		// mostramos por la pantalla el resultado
		System.out.println("La suma de " + n1 + " + " + n2 + " es: " + suma);
	}

}
