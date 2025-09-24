/**
 * Esercizio Esempio in classe
 * Programma che permette di verificare numeri primi
 *
 * @author Fabio Maruca
 * @version 24.09.2025
*/

public class PrimeNumber {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		boolean primo = true;
		
		for (int a = 2; a < number; a++) {
			if (number % a == 0) {
				System.out.println("Il numero " + number + " non è primo, divisibile per " + a);
				primo = false;
			}
		}
		if (primo) {
			System.out.println("Il numero " + number + " è primo");
		}

	}
}