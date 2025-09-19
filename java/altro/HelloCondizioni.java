/**
 * Esercizio Esempio in classe
 * Programma che permette di usare condizioni
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

public class HelloCondizioni {
	public static void main(String[] args) {
		float punteggio = Float.parseFloat(args[0]);
		String animale = args[1];
	
		if (punteggio >= 90) {
			System.out.println("Il tuo voto è ottimo");
		}else if (punteggio >= 80) {
			System.out.println("Il tuo voto è buono");
		}else if (punteggio >= 70) {
			System.out.println("Il tuo voto è discreto");
		}else if (punteggio >= 60) {
			System.out.println("Il tuo voto è sufficiente");
		}else {
			System.out.println("Il tuo voto è insufficente");
		}
		
		if (animale.equals("Cane")) {
			System.out.println("Bau Bau");
		}
	}
}