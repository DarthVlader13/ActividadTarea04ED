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

		califica(reader, nota);

	}

	/**
	 * @param reader
	 * @param nota
	 * @deprecated Use {@link #califica(Scanner,int)} instead
	 */
	public static void cali(Scanner reader, int nota) {
		califica(reader, nota);
	}

	/**
	 * @param reader
	 * @param num_nota
	 */
	public static void califica(Scanner reader, int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";

		System.out.println(calificacion);
		reader.close();
	}
}