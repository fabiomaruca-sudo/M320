/**
 * Esercizio Esempio in classe
 * Programma che permette di lanciare un dado virtuale
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

import java.util.Random;
public class Dice {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int x = 1; x < 6; x++) {
		int num = rand.nextInt(1, 7);
		System.out.println(x + ". Numero tirato: " + num);
		}
		
	}
}