import java.util.Scanner;
import Arithmatics.*;
class UseMathPackage{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		DoAddition a=new DoAddition();
		DoSubstraction s=new DoSubstraction();
		DoMultiplication m=new DoMultiplication();
		DoDivision d=new DoDivision();
	System.out.println("Enter two integers:");
	int A=sc.nextInt();
	int B=sc.nextInt();
	a.add(A,B);
	s.sub(A,B);
	m.mul(A,B);
	d.div(A,B);

}

}
