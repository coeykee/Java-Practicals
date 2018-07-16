import java.util.*;
class palin
{ 
	public static void main(String a[]){

	char word[];
	int flag=0;
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter word:");
	int i=0,l=0;
	while(word[i]=='\n')
         {
           word[i]=sc.nextChar();
	   i++;
	   l=i-1;
	 }
     for(int j=0;j<l/2;j++)
        {
		for(int k=l;k>l/2;k--)
                  { if(word[j]==word[k])
			 flag=1;
		 }
	}
     if(flag==1)
             System.out.println("Entered word:"+word+ "is PALINDROME");
	}//mainends
}//classends

//failed
