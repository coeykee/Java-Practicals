//intro to classes and object
import java.util.*;
class box
	{
		double width;
		double height;
		double depth;
	}
class boxdemo
	{
	public static void main(String a[])
		{
			box b1=new box();
			b1.width=12.05;
			b1.height=45.4;
			b1.depth=12.5;
			double vol=b1.width*b1.height*b1.depth;
			System.out.println("vol="+vol);
		}//Main End
	}//Class End
