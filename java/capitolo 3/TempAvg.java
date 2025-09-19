/**
 * Esercizio Esempio in classe
 * Programma che permette di fare la media di 6 temperature
 *
 * @author Fabio Maruca
 * @version 17.09.2025
*/

public class TempAvg {
	public static void main(String[] args) {
		double temp1 = Double.parseDouble(args[0]);
		double temp2 = Double.parseDouble(args[1]);
		double temp3 = Double.parseDouble(args[2]);
		double temp4 = Double.parseDouble(args[3]);
		double temp5 = Double.parseDouble(args[4]);
		double temp6 = Double.parseDouble(args[5]);
		
		String tempAvg = String.format("%.2f", (temp1 + temp2 + temp3 + temp4 + temp5 + temp6) / 6.0);

		
		System.out.println("temp1 = " + temp1 + " °C");
		System.out.println("temp2 = " + temp2 + " °C");
		System.out.println("temp3 = " + temp3 + " °C");
		System.out.println("temp4 = " + temp4 + " °C");
		System.out.println("temp5 = " + temp5 + " °C");
		System.out.println("temp6 = " + temp6 + " °C");
		System.out.println("tempAvg = " + tempAvg + " °C");
		
	}
}