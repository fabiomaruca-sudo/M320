/**
 * Esercizio Esempio in classe
 * Programma che permette di visualizzare 7 numeri immessi e quante volte c'è lo 0
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

import java.util.Arrays;
public class ZeroCounter {
	public static void main(String[] args) {
		
		int quanti = 0;
		int[] numbers = new int[7];
		for (int val = 0; val <= 6; val++) {
			numbers[val] = Integer.parseInt(args[val]);
		if (numbers[val] == 0) {
		quanti++;
		}
		}
		
		System.out.println("numbers = " + Arrays.toString(numbers));
		System.out.println("The number 0 is present " + quanti + " times");
	}
}