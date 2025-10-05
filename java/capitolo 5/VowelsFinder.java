/**
 * Esercizio Esempio in classe
 * Programma che permette di trovare le vocali
 *
 * @author Fabio Maruca
 * @version 25.09.2025
*/

public class VowelsFinder {
	public static void main(String[] args) {
		String word = "";
		try {
			word = args[0];
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Immettere una stringa");
			return;
		}

		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String wordLower = word.toLowerCase();
		boolean primaLettera = false;
		boolean primavoc = true;
		
		for (char i : wordLower.toCharArray()) {
			for (char vowel : vowels) {
				if (primaLettera == false) {
					primaLettera = true;
					System.out.print(word + " contains the following vowels: ");
				}
				if (primavoc && i == vowel) {
					System.out.print(i);
					primavoc = false;
				}else if (i == vowel && !primavoc) {
					System.out.print(", " + i);
				}
			}
		}
	}
}