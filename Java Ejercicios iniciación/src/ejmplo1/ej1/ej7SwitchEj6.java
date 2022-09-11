package ejmplo1.ej1;

import java.util.Scanner;

public class ej7SwitchEj6 {
//Realiza el ejercicio 6 con <<switch-case>>
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int num = 0;

		System.out.println("Entra un número por favor: ");
		num = Keyboard.nextInt();

		switch (num) {
		case 1:
			System.out.println("El numero " + num + " coresponde al dia Lunes");
			break;
		case 2:
			System.out.println("El numero " + num + " coresponde al dia Martes");
			break;
		case 3:
			System.out.println("El numero " + num + " coresponde al dia Miercoles");
			break;
		case 4:
			System.out.println("El numero " + num + " coresponde al dia Jueves");
			break;
		case 5:
			System.out.println("El numero " + num + " coresponde al dia Viernes");
			break;
		case 6:
			System.out.println("El numero " + num + " coresponde al dia Sabado");
			break;
		case 7:
			System.out.println("El numero " + num + " coresponde al dia Domingo");
			break;
		default:
			System.out.println("El numero que has introcido no corresponde a ningun dia, no es valido ");
		}

	}

}