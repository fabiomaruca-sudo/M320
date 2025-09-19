/**
 * Esercizio Esempio in classe
 * Programma utilizza diversi operatori e la classe Random
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

import java.util.Random;
import java.lang.Math;
public class HelloOperatori {
	public static void main(String[] args) {
		float somma = 5.5f + 2.77f + 5;
		int modulo = 8 % 2;
		int n = 0;
		float f = Float.parseFloat(args[0]);
		double d = Double.parseDouble(args[1]);
		
		double numero = Math.random();
		
		Random rnd = new Random();
		int numeroRandomico = rnd.nextInt(2,9);
		
		n++;
		System.out.println("Somma " + somma);
		System.out.println("Modulo " + modulo);
		System.out.println("Incremento " + n);
		System.out.println("Numero randomico " + numeroRandomico);
		System.out.println("Numero a virgola mobile " + f);
		System.out.println("Numero a virgola mobile " + d);
		System.out.println("Numero random " + numero);
	}
} 