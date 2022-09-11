package ejmplo1.ej1;

import java.util.Scanner;

public class ej5ForEj4 {
//Realiza el programa anterior con <<for>>
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		// Declaration de los variables
		int num = 0;
		int suma = 0;
		int i = 0;
		int nMax = 10;

		for (i = 0; i < nMax; i++) {
			System.out.println("Entra un número por favor: ");
			num = Keyboard.nextInt();

			suma = suma + num;
			System.out.println("Otra vez ");
		}

		System.out.println("La suma de los 10 numeros es : " + suma);

	}
}
