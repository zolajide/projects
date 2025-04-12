package Homework9;
/*
* Description : Creates queue class
*/
/*   UML Diagram 
 *  - elements: int[]  ; stores int values in the queue
 *  - size: int        ; stores # of elements in the queue
 *  
 *  + Queue()       ; constructs a Queue object, default capacity of 8 
 *  + enqueue(v: int)  ; adds v into the queue
 *  + dequeue(): int   ; removes and returns the element from the queue 
 *  + empty(): boolean ; returns true if queue is empty
 *  + getSize(): int   ; returns the size of the queue
 *   */

public class Queue {
	
	// declarations
	private int [] elements;
	private int size;
	
	//+ Queue()
	public Queue() {
		elements = new int[8];	
		size = 0;
	}
	// + enqueue(v: int)
	public void enqueue(int v) {

		if(size == elements.length) {
			int[] newelements = new int[size*2];
			
			for (int j = 0; j < size; j++) {
				newelements[j] = elements[j]; 
			}
			elements = newelements;
		}
			
		elements[size] = v;
		size ++;
			
		}

	// + dequeue(): int
	public int dequeue() {
		int current = elements[0];
		for(int i = 0; i < size - 1; i ++) {
				elements[i] = elements[i + 1];
		}
			elements[size - 1] = 0;
			size--;
	
		return current;
	}
	// + empty(): boolean
	public boolean empty() {
		int sum = 0; 
		for (int i = 0; i < 8; i++) {
			sum += elements[i];
		}
		if (sum != 0)
			return false;
		return true;
	}
	
	public int getSize() {
		int total = 0;
		for (int i = 0; i < 8; i ++) {
			if (elements[i] != 0) {
				total += 1;	
			}else{
				continue;
			}
		}
		return total; 
	}

}
