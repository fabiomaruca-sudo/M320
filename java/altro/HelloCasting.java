/**
 * Esercizio Esempio in classe
 * Programma che permette di convertire dei numeri
 *
 * @author Fabio Maruca
 * @version 10.09.2025
*/

public class HelloCasting {
	public static void main(String[] args) {
		int a = 5;
		long b = a; //cast implicito
		
		long c = 130;
		int d = (int)c; //cast esplicito, mi posso aspettare una perdita di valori
		
		short e = 328;
		byte f = (byte) e;
		System.out.println(f);
		
		String s = "15.56";
		float num = Float.parseFloat(s);
		System.out.println(num);
	}
}
