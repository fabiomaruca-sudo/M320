/**
 * Esercizio Esempio in classe
 * Programma che permette di calcolare un fattoriale
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

public class Factorial {
	public static void main(String[] args) {
		
		
		int factorialResult = 1;
		int factorialNumber = Integer.parseInt(args[0]);
		for (int n = 1; n <= factorialNumber; n++) {
			factorialResult *= n;
		}
		
		System.out.println("factorialNumber = " + factorialNumber);
		System.out.println("factorialResult = " + factorialResult);
	}
}