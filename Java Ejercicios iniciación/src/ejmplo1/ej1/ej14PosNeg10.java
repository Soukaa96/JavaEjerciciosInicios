package ejmplo1.ej1;

import java.util.Scanner;

//Realiza un programa en Java al que le introduzcas 10 números por teclado. Cuente el número de números positivos introducidos por teclado, cuente el número de números negativos introducidos por teclado y realice la suma de todos ellos.
public class ej14PosNeg10 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		// Declaration de los variables
				int num = 0;
				int suma = 0;
				int i = 0;
				int nMax = 10;
				int pos = 0, neg = 0;

				do {
					System.out.println("Entra un número por favor: ");
					num = Keyboard.nextInt();
					i++;
					if (num >= 0) {
						pos++;
					} else
						neg--;
					suma = suma + num;

					System.out.println("Otra vez ");

				} while (i < nMax);

				System.out.println("La suma de los 10 numeros es : " + suma);
				System.out.println("Los positivos de los 10 numeros son : " + pos);
				System.out.println("Los negativos de los 10 numeros son : " + neg);

	}

}
