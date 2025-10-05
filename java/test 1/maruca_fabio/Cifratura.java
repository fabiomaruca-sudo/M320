/**
 * Verifica Java Esercizio 1
 * Programma che permette di cifrare una parola
 *
 * @author Fabio Maruca
 * @version 01.10.2025
*/

public class Cifratura {
	public static void main(String[] args) {
		if (args.length < 3) { // controlla se sono stati inseriti tutti gli argomenti
			System.out.println("Inserire una stringa e due lettere come argomenti!");
			return;
		}
		
		String parola = args[0]; // parola
		String lettera = args[1]; // lettera da cambiare
		String sostituta = args[1]; // lettera che sostituisce
		
		int pos = parola.indexOf(lettera);

		if (pos == -1) {
			System.out.println("lettera non trovata nella parola!");
			return;
		}else {
			System.out.print("La parola " + parola + " è stata codificata in ");
			for ( String i : parola ) { // per ogni lettera della stringa
				if (lettera.equals(i)) {
					i = sostituta;
				}
				System.out.print(i);
			}
		}
	}
}