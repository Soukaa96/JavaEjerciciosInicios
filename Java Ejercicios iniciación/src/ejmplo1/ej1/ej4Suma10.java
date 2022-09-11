package ejmplo1.ej1;

import java.util.Scanner;

public class ej4Suma10 {
//Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma. Realizar el programa con <<do-while>>
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		// Declaration de los variables
		int num = 0;
		int suma = 0;
		int i = 0;
		int nMax=10;

		do {
			System.out.println("Entra un número por favor: ");
			num = Keyboard.nextInt();
			i++;
			suma = suma + num;
			System.out.println("Otra vez ");

		} while (i < nMax);

		System.out.println("La suma de los 10 numeros es : " + suma);

	}

}
