/**
 * Esercizio Esempio in classe
 * Programma che permette printare un quadrato
 *
 * @author Fabio Maruca
 * @version 24.09.2025
*/

public class SquarePrinter {
	public static void main(String[] args) {
		int dimension = 0;
		try {
			dimension = Integer.parseInt(args[0]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Immettere un valore");
			return;
		}catch(java.lang.NumberFormatException e) {
			System.out.println("Inserire un valore numerico intero");
			return;
		}

		for (int y = 0; y < dimension; y++) {
			for (int x = 0; x < dimension; x++) {
				System.out.print("*      ");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}
}