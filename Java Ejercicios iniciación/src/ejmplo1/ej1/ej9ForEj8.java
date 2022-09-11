package ejmplo1.ej1;

import java.util.Scanner;

public class ej9ForEj8 {
//Realiza el ejercicio 8 con un for
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		// Declaration de los variables
		int num = 0;
		int suma = 0;
		int i = 0;
		int nMax = 10;
		int pos = 0, neg = 0;

		for (i = 0; i < nMax; i++) {
			System.out.println("Entra un número por favor: ");
			num = Keyboard.nextInt();

			if (num >= 0) {
				pos++;
			} else
				neg--;
			suma = suma + num;

			System.out.println("Otra vez ");
		}

		System.out.println("La suma de los 10 numeros es : " + suma);
		System.out.println("Los positivos de los 10 numeros son : " + pos);
		System.out.println("Los negativos de los 10 numeros son : " + neg);

	}

}
