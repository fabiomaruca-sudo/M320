/**
 * Esercizio Esempio in classe
 * Programma che permette di calcolare la media aritmetica di 3 numeri
 *
 * @author Fabio Maruca
 * @version 10.09.2025
*/

public class MediaAritmetica {
	public static void main(String[] args) {
		float num1 = 5.5f;
		float num2 = 5.56f;
		float num3 = 5.456f;
		
		float media = (num1 + num2 + num3)/3;
		System.out.println("la media tra " + num1 +", " + num2 + ", " + num3 + " " + "è: " + media);
	}
}
