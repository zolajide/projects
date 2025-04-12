package Homework9;
/*
* Name: Zainab Olajide
* Description : Approximates e
*/
import java.math.*;

public class ApproxE {
		
	public static void main(String[] args) {
		
		for (int i = 100; i <= 1000; i += 100) {
			
			double sum = 1.0; 

			
			for (int j = 1; j <= i; j++) {
				BigInteger fact = BigInteger.ONE; 
				
				for(int k = 1; k <= j; k++) {
				
					fact = fact.multiply(BigInteger.valueOf(k));
					
				}
					
					double fracfac = (1.0/fact.doubleValue());
					
					sum += fracfac;
				
				
		
				
			}
			System.out.print("The e value for i = " + i + " is: " + sum + "\n");
			
		}
	}



}
