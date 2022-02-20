package notas;

import java.util.Scanner;

/**
 * 
 * @author José Francisco Hernández Allen
 *
 */
public class califica {

	/**
	 * @param reader lo usaremos para leer la nota
	 * @param num_nota variable donde se guardará la nota introducida
	 * Esta clase ejecutará el método califica que nos dirá si la nota es aprobada,
	 * suspensa, notable, sobresaliente o que no es correcta.
	 */
	public static void califica(Scanner reader, int num_nota) {
		String calificacion;
		/**
		 * Este método ejecutará un else if si se cumplen los requisitos del número introducido.
		 * Si es mayor o igual a 0 y menor que 5 será suspenso.
		 * Si es mayor o igual a 5 y menor que 7 será aprobado.
		 * Si es mayor o igual a 7 y menor que 9 será notable.
		 * Si es mayor o igual a 9 y menor o igual que 10 será sobresaliente.
		 * Si no se cumple ninguna de las anteriores el programa dirá que la nota no es correcta.
		 */
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
		
		/**
		 * Una vez hechas las comprobaciones del if else, se imprimirá el resultado.
		 */
	
		System.out.println(calificacion);
		reader.close();
	}

}
