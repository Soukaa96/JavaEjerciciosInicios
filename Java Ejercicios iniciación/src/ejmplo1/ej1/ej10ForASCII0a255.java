package ejmplo1.ej1;

import java.util.Scanner;

//Realizar un programa con <<for>> que muestre los caracteres ASCII de 0 a 255
public class ej10ForASCII0a255 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);

		int i;

		for (i = 0; i < 255; i++) {
			System.out.println("El numero : " + i + " tiene el caracter " + (char) i + "en la tabla de ASCII");
		}
	}

}
