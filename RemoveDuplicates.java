/*
* Name: Zainab Olajide
* Date : 4/28/2025
* Assignment : Problem 1 - Homework 10
* Description :  a test program and method that removes the duplicate elements
from an ArrayList of integers, printing out the result 
*/
package homework10;
import java.util.*;
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		// initializes, fills, and prompts user for array
		ArrayList<Integer> userArr = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: \n");
		for(int i = 0; i < 10; i ++) {
			
			userArr.add(input.nextInt());
		}
		
	
		
		removeDuplicates(userArr);
		//prints out new list 
		for(Integer element: userArr) {
			
			System.out.print(element + " ");
		}
		
		
	}
	
	

	public static void removeDuplicates(ArrayList<Integer>list) {
		// new list to keep track of unique elements 
		ArrayList<Integer> occurrences = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
		
			Integer element = list.get(i);
			// if the element has not been counted, add it to occurrences 
			if (!(occurrences.contains(element))) {
				occurrences.add(element);
				
			}else{
				// if duplicate, remove from list
				list.remove(i);
				i --; //adjusts index 
			}
			
		}
		
	
			
		

	}
	
	

}
			
		
			
			
			
			
			
			
			


