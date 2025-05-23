/*
* Name: Zainab Olajide
* Date : 4/28/2025
* Description :  program that creates an array with 100 random integers, 
* prompts for index and display corresponding element. throws exception if out of bounds
*/
package homework10;
import java.util.*;
public class NumberFormatEx {

	public static void main(String[] args)
	{
		
		String userBinaryString;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		userBinaryString = input.nextLine(); 

		System.out.print("Your number is: " + bin2Dec(userBinaryString));
	}
	
	
	public static int bin2Dec(String binaryString)  throws NumberFormatException
	{
		
		int sum = 0; 
		// iterates over string, if characters are not binary #, an exception is thrown  
		for (int i = 0; i < binaryString.length(); i++)
		{
			if(binaryString.charAt(i) != '1' && binaryString.charAt(i) != '0') 
			{
				throw new NumberFormatException();
			}		
		}
		// iterates over characters, converting them to integer, and performing conversion operation
		for (int j = 0; j < binaryString.length(); j++) 
		{
			Character binaryChar = binaryString.charAt(j);
			
			int binaryInt = Character.getNumericValue(binaryChar);
			
			sum += (binaryInt * (Math.pow(2, j)));
		}
		return sum; 

	}
	

}
