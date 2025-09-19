
public class SwapValue {
	public static void main(String[] args) {
		int varA = 5;
		int varB = 10;
		
		System.out.println("Before the swap");
		System.out.println("var A = " + varA + " and varB = " + varB );
		
		System.out.println("After the swap");
		
		int swap = varA;
		varA = varB;
		varB = swap;
		System.out.println("var A = " + varA + " and varB = " + varB );
	}
}