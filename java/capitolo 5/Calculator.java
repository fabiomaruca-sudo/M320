/**
 * Esercizio Esempio in classe
 * Programma che permette di usare una mini calcolatrice
 *
 * @author Fabio Maruca
 * @version 18.09.2025
*/

public class Calculator {
	public static void main(String[] args) {
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[1]);
		char operator = args[2].charAt(0);
		
		double result = 0;
		if (operator == '+') {
			result = number1 + number2;
		}else if (operator == '-') {
			result = number1 - number2;
		}else if (operator == '+') {
			result = number1 + number2;
		}else if (operator == '*') {
			result = number1 * number2;
		}else if (operator == '/') {
			result = number1 / number2;
		}else {
			System.out.println("Operatore non adatto");
			System.exit(0);
		}
		String risulato = String.format("%.2f", result);
		
		
		System.out.println(number1 + " " + operator + " " + number2 + " = " + risulato);
	}
}