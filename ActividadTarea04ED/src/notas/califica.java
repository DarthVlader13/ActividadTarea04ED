package notas;

import java.util.Scanner;

public class califica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
