/**
 * Esercizio Esempio in classe
 * Programma che permette di fare medie tra 4 note
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

import java.lang.Math;
public class ModuleGrade {
	public static void main(String[] args) {
		double grade1 = Double.parseDouble(args[0]);
		double grade2 = Double.parseDouble(args[1]);
		double grade3 = Double.parseDouble(args[2]);
		double grade4 = Double.parseDouble(args[3]);

		double moduleGrade = (grade1 * 0.15 + grade2 * 0.2 + grade3 * 0.25 + grade4 * 0.4);
		String media = String.format("%.2f", moduleGrade);
		
		System.out.println("grade1 = " + grade1);
		System.out.println("grade2 = " + grade2);
		System.out.println("grade3 = " + grade3);
		System.out.println("grade4 = " + grade4);
		System.out.println("moduleGrade = " + media);
	}
}