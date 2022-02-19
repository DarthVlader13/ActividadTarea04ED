/**
 * @version 1.0
 */
package notas;

import java.util.Scanner;

public class Notas {

	/**
	 * @author Vlader
	 *
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.println("Introduzca una nota: ");
		nota = reader.nextInt();

		cali(reader, nota);

	}

	/**
	 * @param reader
	 * @param nota
	 */
	public static void cali(Scanner reader, int nota) {
		String calificacion;
		if (nota >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (nota >= 5 && nota < 7)
			calificacion = "Aprobado";
		else if (nota >= 7 && nota < 9)
			calificacion = "Notable";
		else if (nota >= 9 && nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";

		System.out.println(calificacion);
		reader.close();
	}
}