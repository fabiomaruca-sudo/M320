/**
 * Esercizio Esempio in classe
 * Programma che permette di visualizzare il codice criptato
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

public class Encryption {
	public static void main(String[] args) {
		String inputCode = args[0];
		
		char prima = 'a';
		char terza = 'a';
		char ultima = 'a';
		char penultima = 'a';
		int pos = 1;
		
		for (char lettera : inputCode.toCharArray()) { // prende ogni lettera dell'input e fa controlli di posizione
			System.out.println(lettera);
			if (pos == 1) {
				prima = lettera;
			}else if (pos == 3) {
				terza = lettera;
			}else if (pos == inputCode.length()) {
				ultima = lettera;
			}else if (pos == inputCode.length()-1) {
				penultima = lettera;
			}
			pos++;
		}
		System.out.println("inputCode = " + inputCode);
		System.out.println("encryptedCode = " + prima + terza + ultima + penultima);
	}
}