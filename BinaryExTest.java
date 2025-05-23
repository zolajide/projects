/*
* Name: Zainab Olajide
* Date : 5/5/2025
* Assignment : Problem 1 Pt.2 - Homework 11
* Description : Implements custom Binary Format Exception into bin2dec program 
*/
package homework11;
import java.util.*;

class BinaryExTest 
{
		public static void main(String[] args)
		{
			
			String userBinaryString;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a binary string: ");
			userBinaryString = input.nextLine(); 
			try 
			{
				System.out.print("Your number is: " + bin2Dec(userBinaryString));

			}
			catch (BinaryFormatException ex)
			{ 
				System.out.print(ex.getMessage());
			}
			
		}
		
		
		public static int bin2Dec(String binaryString)  throws BinaryFormatException 
		{
			
			int sum = 0; 
			// iterates over string, if characters are not binary #, an exception is thrown  
			for (int i = 0; i < binaryString.length(); i++)
			{
				if(binaryString.charAt(i) != '1' && binaryString.charAt(i) != '0') 
				{
					throw new BinaryFormatException(binaryString);
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
