/**
 * Esercizio Esempio in classe
 * Programma che permette di scrivere un numero in diversi formati
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

public class HelloIterazioni {
	public static void main(String[] args) {
		String saluto = args[0];
		
		for (int n = 0; n<10; n++) {
			System.out.println(saluto + " " + n);
		}
		
		int m = 0;
		while (m <= 10) {
			System.out.println(saluto + " " + m);
			m++;
			
		int r = 0;
			do {
			System.out.println(saluto + " " + r);
			r++;
		}
		while (r <= 10);
		}
	}
}