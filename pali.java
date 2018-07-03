import java.util.*;
class pali
{ 
	public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter word:");
	String word=sc.next();
	int flag=0;
	for(int i=0;i<(word.length())/2;i++)
		{
			if(word.charAt(i)==word.charAt((word.length())-(i+1)))
                        flag=1;
			else
			break;
		}
 			
	if(flag==1)
             System.out.println("Entered word:"+word+ " is PALINDROME");
        else
             System.out.println("Entered word:"+word+ " is NOT PALINDROME");
	
	}//mainends
}//classends


