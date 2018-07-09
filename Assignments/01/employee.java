

/*Get info of employee,display monthly & yearly salary with increament,use class*/
import java.util.*;
class employee
{
 String name;
 String last_name;
 double mont_salary;
 double incre;
 
 employee()
 {
 	name="";
 	last_name="";
 	mont_salary=0.0;
 	incre=10;
 	
 }
 
 void set()
  {
   System.out.println("\nEnter Employee deatails:\n");
   Scanner sc=new Scanner(System.in);
   System.out.println("First name:");
   name=sc.next();
   System.out.println("Last name:");
   last_name=sc.next();
   System.out.println("Monthly Salary:");
   mont_salary=sc.nextDouble();
   System.out.println("Yearly Bonus % :");
   incre=sc.nextDouble();
   
  }
  
 void get()
  {
   System.out.println("\nEmployee Details:\n");
   System.out.println("First name:"+name);
   System.out.println("Last name:"+last_name);
   System.out.println("Monthly Salary:"+mont_salary);
   System.out.println("Increment :"+incre+"%");
   System.out.println("Yearly salary:"+mont_salary*12);
   double s=(mont_salary*12)+((mont_salary*12)*incre/100);
   System.out.println("Yearly salary with "+incre +"% increment:"+s);
   
 
 }
 
public static void main(String a[])
{
 employee e1=new employee();
 employee e2=new employee();
 e1.set();
 e2.set();
 e1.get();
 e2.get();
 
 }
 
 }
   
  	
 
