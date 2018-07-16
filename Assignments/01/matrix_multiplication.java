//multiply two matrix
import java.util.*;
class matrix_multiplication
{
	public static void main (String n[])
		{
			System.out.println("Enter 2 matrices:");
			Scanner sc=new Scanner(System.in);
			int a[][]=new int[2][2];
			int b[][]=new int[2][2];
			int c[][]=new int[2][2];
			
			System.out.println("\nEnter 1st Matrix:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					a[i][j]=sc.nextInt();
			}
			
			System.out.println("\nEnter 2nd Matrix:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					b[i][j]=sc.nextInt();
			}

			//multiplication block
		
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{	for(int k=0;k<2;k++)
						{
						c[i][j]+=(a[i][j]*b[k][j]);
						}
				}
			}
                        System.out.println("\nMultiplication:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					System.out.print("  "+c[i][j]);
				System.out.println("\n");
			}

			
				
		}//Main End
}//Class End
			
			
