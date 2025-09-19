/**
 * Esercizio Esempio in classe
 * Programma che permette di usare le formule di pitagora
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

import java.lang.Math;
public class Pythagoras {
	public static void main(String[] args) {
		double leg1 = Double.parseDouble(args[0]);
		double leg2 = Double.parseDouble(args[1]);
		
		double hypotenuse = Math.hypot(leg1, leg2);
		String risultato = String.format("%.2f", hypotenuse);
		
		System.out.println("leg1 = " + leg1);
		System.out.println("leg2 = " + leg2);
		System.out.println("hypothenuse = " + risultato);
	}
}