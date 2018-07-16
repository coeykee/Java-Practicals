import java.util.*;
class facto
{
	public static void main(String a[])
		{
		 int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number & get factorial:");
		 n=sc.nextInt();
		for( int i=(n-1);i>=1;i--)
		  n=n*i;
		System.out.println("factorial is "+n);
		}//mainends
}classends
