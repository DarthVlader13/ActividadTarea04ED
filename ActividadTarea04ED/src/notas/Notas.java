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

		notas.califica.califica(reader, nota);

	}

	/**
	 * @param reader
	 * @param nota
	 * @deprecated Use {@link notas.califica#califica(Scanner,int)} instead
	 */
	public static void cali(Scanner reader, int nota) {
		notas.califica.califica(reader, nota);
	}

	/**
	 * @param reader
	 * @param num_nota
	 * @deprecated Use {@link califica#califica(Scanner,int)} instead
	 */
	public static void califica(Scanner reader, int num_nota) {
		califica.califica(reader, num_nota);
	}
}