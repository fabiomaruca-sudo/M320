/**
 * Verifica Java Esercizio 2
 * Programma che permette di controllare le Divisibilità
 *
 * @author Fabio Maruca
 * @version 01.10.2025
*/

public class Divisibilita {
	public static void main(String[] args) {
		if (args.length < 2) { // controlla se sono stati inseriti tutti gli argomenti
			System.out.println("Inserire almeno 2 numeri validi");
			return;
		}
		
		int divisore = Integer.parseInt(args[args.length-1]);
		int numeri[] = new int[args.length];
		int contatore = 0;
		
		for ( String i : args ) {
			numeri[contatore] = Integer.parseInt(args[contatore]); 
			contatore++;
		}
		
		int contatore2 = 0;
		for ( int valore : numeri ) {
			if (contatore2 == numeri.length-1) {
				return;
			}				
			else if (valore % divisore == 0) {
				System.out.println(valore + " -> Sì");
			}else {
				System.out.println(valore + " -> No");
			}
			contatore2++;
		}
		
	}
}