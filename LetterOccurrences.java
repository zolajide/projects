/*
* Name: Zainab Olajide
* Date : 5/5/2025
* Assignment : Problem 2  - Homework 11
* Description :  Displays the occurrence of each letter in a file and the three most frequent characters 
*/
package homework11;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException; 
public class LetterOccurrences 
{

	public static void main(String[] args) 
	{
			String filename;
			String data = ""; 
			
			
			Scanner userinput = new Scanner(System.in);
			System.out.print("Enter a file name: ");
	
			filename = userinput.nextLine();
			File userfile = new File(filename);

			System.out.println("Looking for file at: " + userfile.getAbsolutePath());

			
			try 
			{
				
				Scanner fileinput = new Scanner(userfile);
				while (fileinput.hasNextLine())
				{
					String line = fileinput.nextLine();
					 data += (line + " "); 
				}
				
				fileinput.close();
				int [] occur =  DisplayOccurrences(data);
				for (int i = 0; i < occur.length; i ++)
				{
					System.out.println((char) (i + 'a') + " occurs "  + occur[i] + " times.");
					
				}
				char [] freq = FindOccurrences(data);
				System.out.print("The 3 most frequent characters are: " + freq[0] + ", " + freq[1] + ", " + freq[2]);
			
			}
			catch (FileNotFoundException ex)
			{
				System.out.print(userfile.getAbsolutePath());
				System.out.print("File not found: " + ex.getMessage() );
			}
			
		
			
			
	}
	public static int[] DisplayOccurrences(String data)
	{
		int [] occurrences = new int[26];
		data = data.toLowerCase(); 
		for(int i = 0; i < data.length(); i ++)
		{
			
			char current = data.charAt(i);
			
			if (current >= 'a' && current <= 'z')
			{
			
				int index = current - 'a';
				occurrences[index]++;
			}
		}
		return occurrences; 
	}
	public static char[] FindOccurrences(String data)
	{
		int [] occurrences = new int[26];
		data = data.toLowerCase(); 
		for(int i = 0; i < data.length(); i ++)
		{
			
			char current = data.charAt(i);
			
			if (current >= 'a' && current <= 'z')
			{
			
				int index = current - 'a';
				occurrences[index]++;
			}
		}
		
		char [] frequent = new char [3];
		
		for (int j = 0; j < 3; j ++)
		{
			int max = -1;
			int maxIndex = -1;
			for (int i = 0; i < occurrences.length; i ++)
			{
				if (occurrences[i] > max)
				{
					max = occurrences[i];
					maxIndex = i; 
				}
			}
			frequent[j] = (char)(maxIndex + 'a');
			occurrences[maxIndex] = 0;
		}
	
		return frequent; 
	}

			
}
