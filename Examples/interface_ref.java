/*Implement interface, to create multiple inheritence*/
import java.util.*;
interface AREA
{
	double PI=3.142;
	double compute(double x, double y);
}

class rectangle implements AREA
	{
		public double compute(double x, double y)
		{
			return x*y;
		}
	}//rectangle end
class triangle implements AREA
	{
		public double compute(double x, double y)
		{
			return (x*y)/2;
		}
	}//triangle end
class circle implements AREA
	{
		public double compute(double x, double y)
		{		
			return PI*x*y;
		}	
	}//circle End
class implementing_interface
	{
		public static void main(String a[])
		{
		AREA rect;
		rect=new rectangle();
		System.out.println("\nEnter Length and height of rectangle:");
		Scanner sc=new Scanner(System.in);
		int Length=sc.nextInt();
		int Height=sc.nextInt();
		System.out.println("Area of Rectangle="+rect.compute(Length,Height));
		System.out.println("\nEnter Length and height of triangle:");
		rect=new triangle();
		System.out.println("Area of Triangle="+rect.compute(sc.nextInt(),sc.nextInt()));
		System.out.println("\nEnter Length and height of circle:");
		rect=new circle();
		System.out.println("Area of Circle="+rect.compute(sc.nextInt(),sc.nextInt()));
		}//Main End
	}//Class End
		
