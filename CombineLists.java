/*
* Name: Zainab Olajide
* Date : 4/28/2025
* Description :  a method that returns the union of two ArrayList of
integers
*/
package homework10;
import java.util.*;
public class CombineLists {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer>list2){
		
		ArrayList<Integer> combined = new ArrayList<>(list1);

		for (Integer element: list2) {
			
			if(!(combined.contains(element))) {
			
				combined.add(element);
			}
		}
		
		
		return combined; 
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> userlist1 = new ArrayList<>();
		ArrayList<Integer> userlist2 = new ArrayList<>();		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list 1 (5 numbers): ");
		//input 5 numbers into list1 
		for (int i = 0; i < 5; i ++) {
			
			userlist1.add(input.nextInt());
			
		}
		//inputs 5 numbers into list2
		System.out.print("Enter list 2 (5 numbers): ");
		for (int i = 0; i < 5; i ++) {
			
			userlist2.add(input.nextInt());
			
		}
		
		ArrayList<Integer> combinedlist = new ArrayList<>();
		combinedlist = union(userlist1, userlist2);
		// prints elements of combined list 
		for (Integer element: combinedlist) {
			System.out.print(element + " ");
		}
		
		

	}
}

