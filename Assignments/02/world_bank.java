/*Savers account, calculate monthly,annual interest,show current balance,provision to change interest rate */
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
		
