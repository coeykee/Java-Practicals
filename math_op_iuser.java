//math operations using class and objects 1. input from user
import java.util.*;
class math
	{
		double n1;
		double n2;
		double add(double A,double B)
		 {
			n1=A;n2=B;
			return n1+n2;}
		double mult(double multiplicant,double multiplier)
		 {
			n1=multiplicant;n2=multiplier;
			return n1*n2;}
		double sub(double A,double B)
		 {	
			n1=A;n2=B;
			return n1-n2;}
		double div(double A, double divisor)
		 {
			n1=A;n2=divisor;
			return n1/n2;}
	}//classends

class math_op_iuser
	{
	 public static void main(String a[])
		{
			math o1=new math();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers:");
			o1.n1=sc.nextDouble();
			o1.n2=sc.nextDouble();
			System.out.println("Now enter what operation you want to do \n1.Addition\n2.Multplication\n3.Substraction\n4.Division\t ( enter 0 to exit)");
			int choice=sc.nextInt();
  			switch(choice)
			{
			case 1: 
			 {
			//System.out.println("n1="+o1.n1+"\nn2="+o1.n2);
				System.out.println("Addition="+o1.add(o1.n1,o1.n2));
				break;
			 }
			case 2:
			 {
				System.out.println("Multiplication="+o1.mult(o1.n1,o1.n2));
				break;
			 }
			case 3:
			 {
				System.out.println("Subsraction="+o1.sub(o1.n1,o1.n2));
				break;
			 }
			case 4:
			 {
				System.out.println("Division="+o1.div(o1.n1,o1.n2));
				break;
			 }
			default:
			 {	System.out.println("Enter valid choice!");
				break;
			 }
			}


		}//mainends
}//classends
