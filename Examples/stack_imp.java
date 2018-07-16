//implementing STACK USING ARRAY
import java.util.*;
class stack_imp
	{
	int stack[];
	int STRT=0,TOP=0;
	public static void main(String a[])
	 {
        System.out.println("Choose operation \n0.exit\n1.PUSH \n2.POP \n3.PRINT");

		Scanner sc=new Scanner(System.in);
                int choice=sc.nextInt();
		switch(choice)
		{
		 case 0:
			break;
		 case 1:
			{
			 if(stack[TOP]==100)
				{
  				System.out.println("Overflow!");break;}
			 else
			 {
				System.out.println("Enter Element:");
				int newele=sc.nextInt();
				PUSH(newele);
				break;
			 }
			}
		case 2:
			{
			 if(stack[STRT]==stack[TOP])
				{
					System.out.println("Can't POP!");
					break;
				}
			 else
				{		
					POP();
					break;
				}
			}
		case 3:
                     
     			{
			System.out.println("Stack elements are:");
			print();
			break;
			}
		default:
			{
			 System.out.println("Invalid choice");
			}

		}
		
		}//mainends
void PUSH(int newele)
{
	stack[TOP]=newele;
	TOP++;
	System.out.println(newele+" element added");
}		
void POP()
			{
				TOP--;
				System.out.println(stack[TOP]+" element deleted!");
			}
void print()
			{
				for(int i=STRT;i<TOP;i++)
					{
						System.out.print(stack[i]+"\t");
					}
			        System.out.println("Stack Printed!");
			}
}//classends
