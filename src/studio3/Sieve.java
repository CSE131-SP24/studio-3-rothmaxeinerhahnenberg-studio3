package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what is the greatest number you want to test?");
		int max = in.nextInt();
		boolean[] arrayPrime = new boolean[max+1];
		
		for (int i=0; i<=max; i++)
		{
			arrayPrime[i] = true;
		}
		
		
		for (int i=2; i<max+1; i++) {
			if (arrayPrime[i]==true) { //Only runs when finds prime.
				for (int j=2; j<i; j++) {
					if (i%j ==0 && i!=j) {
						arrayPrime[i] = false;
					}
				}
			}
		}
		
		
		for (int i=2; i<=max; i++)
		{
			if (arrayPrime[i]) {
				System.out.print(i+" ");
			}
			
		}
			
		
			
	}

}
