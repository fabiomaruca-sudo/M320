/**
 * Verifica Java Esercizio 3
 * Programma che permette di creare un Istogramma
 *
 * @author Fabio Maruca
 * @version 01.10.2025
*/

public class Istogramma {
	public static void main(String[] args) {
		if (args.length < 1) { // controlla se sono stati inseriti tutti gli argomenti
			System.out.println("Inserire almeno 1 valore");
			return;
		}
		
		int valori[] = new int[args.length];
		int contatore = 0;
		
		for ( String i : args ) {
			int val = (int)Integer.parseInt(args[contatore]);
			if (val > 7) {
				contatore++;
				continue;
			}
			valori[contatore] = val; 
			contatore++;
		}
		

		for ( int valore : valori ) {
			for (int i = 0; i < valore; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}