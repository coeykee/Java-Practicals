import java.util.*;
class findlarge
{
	public static void main(String a[])
 	{
	 int n1,n2,n3;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter three numbers:");
	 n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
        int n=(n1>n2 && n1>n3?n1:(n2>n3?n2:n3));
		 System.out.println(n+" is BIGGEST");
        

	}//mainends
}//classends
