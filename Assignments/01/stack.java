/*implementing stack*/
import java.util.*;
class stack
{
 int MAX=5;
 int array[]=new int[MAX];
 int top;
 int neww;
 
 stack()
 {
  top=-1;
  neww=0;
  
 }
 
 void push(int ele)
 {
  neww=ele;
  top++;
  array[top]=neww;
  top++;
  System.out.println(neww+" element added!");
  
 }
 
 void pop()
 {
  neww=array[top];
  top--;
  System.out.println(neww+" element deleted!");
  
 }

 void display()
 {
  System.out.println("Elements:");
  for (int i=0;i<top;i++)
   {
    System.out.print(array[i]+" ");
    
   }
   
 }
 
 
 public static void main(String a[])
 {
  stack st=new stack();
  System.out.println("Enter choice # 1.push 2.pop 3.display (0 for exit)");
  Scanner sc=new Scanner(System.in);
  int ch=sc.nextInt();
  do{
  switch(ch)
  {
   case 1:
   {if(st.top<st.MAX)
     { System.out.println("Enter element:");
       int ele=sc.nextInt();
       st.push(ele);
       break;
      }
     else
     {
      System.out.println("Overflow!");
     }
   }
   
   case 2:
   {if(st.top!=-1)
     {
      st.pop();
      break;
     }
    else
    {
     System.out.println("Whoahh empty Stack!");
     break;
    }
   }
   
   case 3:
   {
   st.display();
   break;
   }
   
   default:
   {
    System.out.println("Invalid Choice");
   }
  }
   System.out.print("#");ch=sc.nextInt();}while(ch!=0);
   
   
 }
 
 }
  
  
  
  
 
