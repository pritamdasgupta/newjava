package Krishnamurty;

import java.util.Scanner;

public class krishnamurty {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = sc.nextInt();
		int n = i,f = 1,sum= 0,p;

		while(n > 0) {
			p = n%10;
			for (int r=0;r<=p;r++) {
				f = f*r;
			}
			sum = sum +f;
			n = n/10;
		}
		if(sum == n) {
			System.out.println("The number is a Krisnamurty number");
		}
		else
			System.out.println("The number is not a Krishnamurty number");
	}
}
