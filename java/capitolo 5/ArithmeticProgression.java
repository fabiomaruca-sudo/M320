/**
 * Esercizio Esempio in classe
 * Programma che permette di controllare progressioni aritmetiche
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

public class ArithmeticProgression {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int number3 = Integer.parseInt(args[2]);
		int const1 = number2 - number1;
		int const2 = number3 - number2;
		
		if (const1 == const2) {
		System.out.println(number1 + " " + number2 + " " + number3 + " are in arithmetic progression (constant difference of " + const1 + ")"); 
		}else{
			System.out.println(number1 + " " + number2 + " " + number3 + " are not in arithmetic progression");
		}
	}
}