/**
 * Esercizio Esempio in classe
 * Programma che permette printare una linea
 *
 * @author Fabio Maruca
 * @version 25.09.2025
*/

public class LinePrinter {
	public static void main(String[] args) {
		int length = 0;
		int direction = 0;
		try {
			length = Integer.parseInt(args[0]);
			direction = Integer.parseInt(args[1]);
			if (direction > 1) {
				direction = 1;
			}
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Immettere un valore");
			return;
		}catch(java.lang.NumberFormatException e) {
			System.out.println("Inserire un valore numerico intero");
			return;
		}

		for (int i = 0; i < length; i++) {
			System.out.print("*");
			System.out.print("     ");
			
			if (direction == 1) {
				System.out.println("\n\n\n");
			}
		}
	}
}