package ejmplo1.ej1;

import java.util.Scanner;

public class ej6DiaDeSemanaElseIf {
//Realiza un programa en Java que lea un número por teclado y muestre a qué día de la semana corresponde.
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		int num = 0;

		System.out.println("Entra un número por favor: ");
		num = Keyboard.nextInt();

		if (num == 1)
			System.out.println("El numero " + num + " coresponde al dia Lunes");
		else if (num == 2)
			System.out.println("El numero " + num + " coresponde al dia Martes");
		else if (num == 3)
			System.out.println("El numero " + num + " coresponde al dia Miercoles");
		else if (num == 4)
			System.out.println("El numero " + num + " coresponde al dia Jueves");
		else if (num == 5)
			System.out.println("El numero " + num + " coresponde al dia Viernes");
		else if (num == 6)
			System.out.println("El numero " + num + " coresponde al dia Sabado");
		else if (num == 7)
			System.out.println("El numero " + num + " coresponde al dia Domingo");
		else
			System.out.println("El numero que has introcido no corresponde a ningun dia, no es valido ");

	}

}
