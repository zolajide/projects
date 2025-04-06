/*
* Name: Zainab Olajide
* Date: 3/12/2025
* Description : Designs a class named Account 
*/



import java.util.*;
public class Account
{
	//declarations
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	public Account()
	{
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0.045;
		this.dateCreated = new Date();
	}

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public Date getdateCreated()
	{
		return dateCreated;
	}

	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest(double getMonthlyInterestRate)
	{
		return balance * getMonthlyInterestRate;
	}
	public void withdraw(double a)
	{
		if (a <= balance) {
        		this.balance -= a;  
			
			System.out.println("Withdrawing " + a + " dollars from your account....");

    		} else {
        		System.out.println("Insufficient balance");
    		}
	}
	public void deposit(double a)
	{
		this.balance += a;
		System.out.println("Depositing " + a + " dollars into your account....");
	}0-


	public static void main(String[] args)
	{
		Account myAccount = new Account();
		myAccount.setId(1122);
		myAccount.setBalance(20000.0);
		
		
		System.out.println("Your acccount id number is: " + myAccount.getId());
		System.out.println("Your account balance is: " + myAccount.getBalance());
		

		myAccount.withdraw(2500.0);

		myAccount.deposit(3000.0);

		System.out.println("Your account was created on... " + myAccount.getdateCreated());
		System.out.println("Your monthly interest is..." +  myAccount.getMonthlyInterest(0.045));
	}



	
	
}
