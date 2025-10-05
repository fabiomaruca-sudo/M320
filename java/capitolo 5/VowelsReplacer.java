/**
 * Esercizio Esempio in classe
 * Programma che permette di trovare le vocali
 *
 * @author Fabio Maruca
 * @version 25.09.2025
*/

public class VowelsReplacer {
	public static void main(String[] args) {
		String word = "";
		char oldVowel = 'b';
		char newVowel = 'b';
		try {
			word = args[0];
			oldVowel = args[1].charAt(0);
			newVowel = args[2].charAt(0);
		}catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Immettere una stringa, una vocale da rimpiazzare e una vocale che sostituisce");
			return;
		}

		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String wordLower = word.toLowerCase();

		boolean oldVowelVerifier = false;
		boolean newVowelVerifier = true;
		for (char i : vowels) {
			if (i == oldVowel) {
				oldVowelVerifier = true;
			}

			if (i == oldVowel){
				newVowelVerifier = true;
			}
		}

		if (oldVowelVerifier && newVowelVerifier) {
			System.out.print("The word " + word + " has been changed to ");
			for (char i : wordLower.toCharArray()) {
				if (i == oldVowel) {
					System.out.print(newVowel);
				} else {
					System.out.print(i);
				}
			}
		}
	}
}