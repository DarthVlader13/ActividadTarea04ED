/**
 * Esta clase define si una nota es suspensa o aprobada
 * @version 1.0
 */
package notas;

import java.util.Scanner;

/**
 * 
 * @author José Francisco Hernández Allen
 *
 */
public class Notas {

	/**
	 * @author José Francisco Hernández Allen
	 *
	 */

	/**
	 * 
	 * @param args 
	 * Esta es la clase main donde se pedirá que se introduzca una nota.
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0; // Se declara la variable nota como entero y se inicia a 0.
		String calificacion = "";
		System.out.println("Introduzca una nota: ");
		// Se imprime "Introduzca una nota" y pide leer el número a introducir.
		nota = reader.nextInt();

		notas.califica.califica(reader, nota);

	}

	/**
	 * @param reader lo usaremos para leer la nota
	 * @param nota variable donde se guardará la nota introducida
	 * @deprecated este metodo queda obseloteo por califica
	 * Con el deprecated se está dejando claro que el método cali está en desuso
	 */
	public static void cali(Scanner reader, int nota) {
		notas.califica.califica(reader, nota); }
	
	 /**
	 * 
	 * @param reader lo usaremos para leer la nota
	 * @param num_nota variable donde se guardará la nota introducida
	 * @deprecated este método queda obsoleto ya que lo hemos movido a la clase califica
	 * Con el deprecated se está dejando claro que el método cali está en desuso
	 */
	public static void califica(Scanner reader, int num_nota) {
		califica.califica(reader, num_nota);
	 /**
	  * Este método está depreciado también porque lo hemos movido a la clase califica que creamos.
	  */
	}
}