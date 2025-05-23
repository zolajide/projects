/*
* Name: Zainab Olajide
* Date : 4/28/2025
* Assignment : Problem 3 - Homework 10
* Description :  program that creates an array with 100 random integers, 
* prompts for index and display corresponding element. throws exception if out of bounds
*/
package homework10;
import java.util.*;
public class ArrayIndexOutofBounds 
{
	public static void main(String[] args) 
	{
		int array[] = new int[100];
		// fills array with  100 random values
		for (int i = 0; i < 100; i ++)
		{
				array[i] = (int)(Math.random() *100);
		}
		//prompts user for index, throws exception if index is out of bounds
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter index: ");
			int userindex = input.nextInt();
			System.out.print(array[userindex]);
		}
		catch (ArrayIndexOutOfBoundsException ex) 
		{
			
			System.out.println("Out of bounds");
		
		}
		
		
	}
	

}
