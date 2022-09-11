package ejmplo1.ej1;

import java.util.Scanner;

public class ej15Diagrama {
//DFIAGRAMA Realiza el programa en JAVA del siguiente diagrama de flujo.
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		// Declaration de los variables
		String tema = "tema";
		String nombre;

		System.out.println("Hola Hoy se habla del tema, primero entra tu nombre por favor! ");
		nombre = Keyboard.nextLine();

		System.out.println("Si sabes el tema que se habla escribe Si si no No : ");
		tema = Keyboard.nextLine();
		tema = tema.toLowerCase();

		if (tema.equals("si")) {
			System.out.println("Estas informado(a), ya se puede hablar de la tema " + nombre);
		} else if (tema.equals("no")) {
			{
				System.out.println(nombre + " No estas informado(a), tienes que informar : ");

				System.out.println("Ahora estas informado(a) o No aun? ");
				tema = Keyboard.nextLine();
				tema = tema.toLowerCase();
			}
			while (tema.equals("no"))
				;
			System.out.println("Finalmente! Que bien!! ya puedes hablar del tema " + nombre + " estas informado(a).");
		}
	}
}