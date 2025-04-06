/*
* Name: Zainab Olajide
* Date: 3/12/2025
* Description :  checks whether a matrix is a Markov matrix
*/
import java.util.*;
public class MarkovMatrix
{
	public static void main(String[] args)
	{
		//declarations
		double[][] matrix = new double[3][3];


		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix of double values");
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[0].length; column++)
			{
				matrix[row][column] = input.nextDouble();
			}
		}

		//output

		boolean answer = isMarkovMatrix(matrix);
		if(answer){
			System.out.print("This 3x3 matrix is a markov matrix!");
		}else{
			System.out.print("The 3x3 matrix is not a markov matrix.");
		}
	}




	//processing
	public static Boolean isMarkovMatrix(double[][] m)
	{
		boolean isPos = false;
		boolean isOne = false;
		double total = 0.0;
		for(int row = 0; row < 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				total += m[row][column];

				if (m[row][column] > 0)
				{
				isPos = true;
				}
			}
		}
		total = total/3;
		
		if (total == 1)
		{
			isOne = true;
		}

		if (isPos == true && isOne == true)
		{
			return true;
		}
		return false;
	}
}
