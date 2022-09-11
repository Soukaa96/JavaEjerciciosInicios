package ejmplo1.ej1;

import java.util.Scanner;

public class ej2Mayor {
//Programa que lea dos números pasados por teclado y muestre el mayor en pantalla. Si son iguales deberá mostrar un mensaje indicándolo.
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		// Declaration de los variables
		int n1 = 0;
		int n2 = 0;

		System.out.println("Entra el primer número por favor: ");
		n1 = Keyboard.nextInt();
		System.out.println("Entra el segundo número por favor: ");
		n2 = Keyboard.nextInt();

		if (n1 > n2)
			System.out.println("El primer numero que es " + n1 + " es mayor que el segundo numero que es " + n2);
		else if (n1 == n2)
			System.out.println("El primer numero que es " + n1 + " es igual que el segundo numero que es " + n2);
		else
			System.out.println("El segundo numero que es " + n2 + " es mayor que el primer numero que es " + n1);
	}

}
