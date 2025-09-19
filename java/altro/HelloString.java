/**
 * Esercizio Esempio in classe
 * Programma che permette di stampare diverse informazioni di una stringa
 *
 * @author Fabio Maruca
 * @version 10.09.2025
*/

public class HelloString {
	public static void main(String[] args) {
		String s = "Ciao Mondo";
		
		int lenght = s.length(); // metodo che ritorna la lunghezza della parola
		char firstChar = s.charAt(0); // ritorna carattere di stringa nella posizione indicata
		boolean isMatch = s.equals("Ciao Mondo"); // confronta il valore di s con Ciao Mondo
		String subString = s.substring(0,8); // Metodo che permette di estrarre una sottostringa da x a y (ultimo non compreso)
		int position = s.indexOf('o'); // restituisce la posizione della prima 'o'
		String rewritted = s.replace('C', 'X'); // sostituisce una lettera (da C a X)
		
		System.out.println(s);
		System.out.println(lenght);
		System.out.println(firstChar);
		System.out.println(isMatch);
		System.out.println(subString);
		System.out.println(position);
		System.out.println(rewritted);
	}
}
