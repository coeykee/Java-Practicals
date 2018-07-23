/*2. Create class SavingsAccount. Use a static variable annualInterestRate to store the annual
interest rate for all account holders. Each object of the class contains a private instance
variable savingsBalance indicating the amount the saver currently has on deposit. Provide
method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12this interest should be added to
savingsBalance. Provide a static method modifyInterestRate that sets the
annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount
objects, saver1 and saver2, with balances of Rs 2000.00 and Rs 3000.00, respectively. Set
annualInterestRate to 4%, then calculate the monthly interest and print the new balances
for both savers. Then set the annualInterestRate to 5%, calculate the next month's
interest and print the new balances for both savers.
*/

import java.util.*;
class bankacc
 {
	static int annualInterestRate=4;
	private double savingsBalance;
	double MonthlyInterest;
	bankacc(double B)
	{
 		savingsBalance=B;
		
	}
		
	
	public void calculateMonthlyInterest()
	{
		MonthlyInterest=(savingsBalance*annualInterestRate/100)/12;
	}

	public static void modifyInterestRate(int chngedRate)
	{
 		annualInterestRate=chngedRate;
	}

	public void getBalance()
	{
  	 System.out.printf("\nA\\C Bal: %.2f\n",savingsBalance); calculateMonthlyInterest();
	 System.out.println("Interest Rate:"+annualInterestRate+"%");
	 System.out.printf("Monthly Interest: %.2f\n",MonthlyInterest);
		savingsBalance=savingsBalance+MonthlyInterest;
	 System.out.printf("A\\c Bal + Interest: %.2f\n",savingsBalance);
	}
}

class world_bank
{
	public static void main(String a[])
	{
		bankacc saver1=new bankacc(4000);
		bankacc saver2=new bankacc(5000);
		System.out.println("\n\nSaver1 INFO:");
		saver1.getBalance();
		System.out.println("\n\nSaver2 INFO:");
		saver2.getBalance();
		bankacc.modifyInterestRate(5);
		System.out.println("\n\nSaver1 INFO:");
		saver1.getBalance();
		System.out.println("\n\nSaver2 INFO:");
		saver2.getBalance();
	}//MEnd
}//CEnd
		
