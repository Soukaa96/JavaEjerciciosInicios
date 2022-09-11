package ejmplo1.ej1;

import java.util.Scanner;

public class ej3Bucle {
//Realiza un programa en Java que lea dos números pasados por teclado en un proceso repetitivo. Este proceso terminará cuando los números leídos sean iguales.
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		// Declaration de los variables
		int n1 = 0;
		int n2 = 0;

		do {
			System.out.println("Entra el primer número por favor: ");
			n1 = Keyboard.nextInt();
			System.out.println("Entra el segundo número por favor: ");
			n2 = Keyboard.nextInt();
			
			System.out.println("Intenta otra vez ");
			
		} while (n1 != n2);
		System.out.println("El processo esta terminado, has introcido dos numeros iguales");

	}

}
