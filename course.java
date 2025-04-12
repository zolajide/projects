/*
* Name: Zainab Olajide
* Date : 4/5/2025
*/
package Homework9;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents; 
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
			students[numberOfStudents] = student; 
			numberOfStudents++;
			if (numberOfStudents > 100) {
				String[] newstudents = new String[200];
				for(int j = 0; j < 100; j ++) {
					newstudents[j] = students[j];
					

				}
				students = newstudents; 
			}
		}
		
		
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		
		for (int i = 0; i < numberOfStudents ; i ++) {
			if(student.equals(students[i])) {
				for (int j = i; j < numberOfStudents - 1; j ++) {
					students[j] = students[j + 1];
				}
				students[numberOfStudents - 1] = null; 
				numberOfStudents--;
				break; 
			}
		}
		
	}
	public void clear(String student) {
		
		for (int i = 0; i < 10; i ++) {
			students[i] = null; 
		}
		numberOfStudents = 0;
	}
}
