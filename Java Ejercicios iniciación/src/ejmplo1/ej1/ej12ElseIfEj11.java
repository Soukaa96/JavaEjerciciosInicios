package ejmplo1.ej1;

import java.util.Scanner;

public class ej12ElseIfEj11 {
//Realiza el ejercicio 11 con <<else if>>
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int nota = 0;

		System.out.println("Entra tu nota por favor: ");
		nota = Keyboard.nextInt();

		if (nota == 5)
			System.out.println("tu nota" + nota + " tiene el valor de Suficiente");

		else if (nota == 6)
			System.out.println("tu nota" + nota + " tiene el valor de Bien");

		else if (nota == 7)
			System.out.println("tu nota" + nota + " tiene el valor de Notable bajo");

		else if (nota == 8)
			System.out.println("tu nota" + nota + " tiene el valor de Notable alto");

		else if (nota == 9)
			System.out.println("tu nota" + nota + " tiene el valor de Sobresaliente");

		else if (nota == 10)
			System.out.println("tu nota" + nota + " tiene el valor de Matricula de honor");

		else
			System.out.println("Lo siento has suspendido");

	}

}
