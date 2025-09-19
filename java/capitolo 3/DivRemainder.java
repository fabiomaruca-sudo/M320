/**
 * Esercizio Esempio in classe
 * Programma che permette di calcolare il resto di una divisione
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

public class DivRemainder {
	public static void main(String[] args) {
		double dividend = Double.parseDouble(args[0]);
		double divisor = Double.parseDouble(args[1]);
		
		double divRemainder = dividend % divisor;
		System.out.println("dividend = " + dividend);
		System.out.println("divisor = " + divisor);
		System.out.println("divRemainder = " + divRemainder);
	}
}