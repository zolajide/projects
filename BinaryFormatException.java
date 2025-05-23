/*
* Name: Zainab Olajide
* Date : 5/5/2025
* Assignment : Problem 1 Pt.1 - Homework 11
* Description : Creates custom Binary Format Exception 
*/

package homework11;

 class BinaryFormatException extends Exception 
 {
	private String userString;


	public BinaryFormatException(String userString)
	{
		 super("Invalid binary string: " + userString);     // allows exception to inherit constructors 
		 this.userString = userString; 
	}
	
	public String getuserString()
	{
		return userString; 
	}
	
	
}

