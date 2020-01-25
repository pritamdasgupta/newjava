package Swap;

public class Swap {

	public static void main (String [] args) {
		int a=10, b=20;

		b = a + b - (a = b);
		
		System.out.println("After swapping values of a and b are"  +a   + b);
	}

}
