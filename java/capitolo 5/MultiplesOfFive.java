/**
 * Esercizio Esempio in classe
 * Programma che permette di visualizzare se il numero immesso è un multiplo di 5
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

public class MultiplesOfFive {
	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);
		
		if (number % 5 == 0) {
			System.out.println("Il numero " + number + " è multiplo di 5");
		}else {
			System.out.println("Il numero " + number + " non è multiplo di 5");
		}
		
	}
}