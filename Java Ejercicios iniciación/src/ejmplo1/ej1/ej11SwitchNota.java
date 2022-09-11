package ejmplo1.ej1;

import java.util.Scanner;

public class ej11SwitchNota {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int nota = 0;

		System.out.println("Entra tu nota por favor: ");
		nota = Keyboard.nextInt();

		switch (nota) {
		case 5:
			System.out.println("tu nota" + nota + " tiene el valor de Suficiente");
			break;
		case 6:
			System.out.println("tu nota" + nota + " tiene el valor de Bien");
			break;
		case 7:
			System.out.println("tu nota" + nota + " tiene el valor de Notable bajo");
			break;
		case 8:
			System.out.println("tu nota" + nota + " tiene el valor de Notable alto");
			break;
		case 9:
			System.out.println("tu nota" + nota + " tiene el valor de Sobresaliente");
			break;
		case 10:
			System.out.println("tu nota" + nota + " tiene el valor de Matricula de honor");
			break;
		default:
			if(nota<5)
			System.out.println("Lo siento has suspendido");
			else 
				System.out.println("Notaza");
		}

	}

}
