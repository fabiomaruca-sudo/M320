/**
 * Esercizio Esempio in classe
 * Programma che permette di scrivere un numero in diversi formati
 *
 * @author Fabio Maruca
 * @version 10.09.2025
*/

public class FormatNumber {
	public static void main(String[] args) {
		double numero = 123456.78f;
		
		String numero1 = String.format("%6f", numero);
		int numero3 = (int)numero;
		String numero4 = String.format("%,.2f", numero);
		String numero5 = String.format("%.2e", numero);
		
		System.out.println(numero1);
		System.out.println(numero);
		System.out.println(numero3);
		System.out.println(numero4);
		
	}
}