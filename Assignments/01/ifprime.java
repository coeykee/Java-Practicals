import java.util.*;
class ifprime
{
	public static void main(String a[])
	{
		int num,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numer to check if its prime:");
		num=sc.nextInt();
		for(int i=2;i<(num/2);i++){
		if(num%i==0)
		 {
		  System.out.println(num+" is Not PRIME!");
		  break;
		 }
		else
                 flag=1;
		 }
	        if(flag==1)
		System.out.println("Yes, "num+" is PRIME!");
        }//mainenDS
}//CLASSENDSD
		
