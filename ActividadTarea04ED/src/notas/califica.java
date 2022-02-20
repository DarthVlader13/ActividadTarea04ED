package notas;

import java.util.Scanner;

/**
 * 
 * @author Jos� Francisco Hern�ndez Allen
 *
 */
public class califica {

	/**
	 * @param reader lo usaremos para leer la nota
	 * @param num_nota variable donde se guardar� la nota introducida
	 * Esta clase ejecutar� el m�todo califica que nos dir� si la nota es aprobada,
	 * suspensa, notable, sobresaliente o que no es correcta.
	 */
	public static void califica(Scanner reader, int num_nota) {
		String calificacion;
		/**
		 * Este m�todo ejecutar� un else if si se cumplen los requisitos del n�mero introducido.
		 * Si es mayor o igual a 0 y menor que 5 ser� suspenso.
		 * Si es mayor o igual a 5 y menor que 7 ser� aprobado.
		 * Si es mayor o igual a 7 y menor que 9 ser� notable.
		 * Si es mayor o igual a 9 y menor o igual que 10 ser� sobresaliente.
		 * Si no se cumple ninguna de las anteriores el programa dir� que la nota no es correcta.
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
		 * Una vez hechas las comprobaciones del if else, se imprimir� el resultado.
		 */
	
		System.out.println(calificacion);
		reader.close();
	}

}
