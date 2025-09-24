/**
 * Esercizio Esempio in classe
 * Programma che permette di calcolare la sequenza di fibonacci
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

public class FibonacciSequence {
	public static void main(String[] args) {
		long F0 = 1;
		long F1 = 0;
		long ris = 0;
		
		for (int num = 0; num <= 1000; num++) {
			ris = F0 + F1;
			F1 = F0;
			F0 = ris;
			
			System.out.println("F(" + num + ") = " + F0);
		}
	}
}