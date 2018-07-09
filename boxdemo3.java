//constructor intro
import java.util.*;
class box
	{
		double w,h,d;
		box()
		{		
		 w=12.3;
		h=21.5;
		d=20;
		}
		double volume()
		{
			return w*h*d;
		}
	}//boxend
class boxdemo3
	{
	public static void main(String a[])
		{
			box b1=new box();
			box b2=new box();
			double vol=b1.volume();
			double vol2=b2.volume();
			System.out.println("vol1="+vol);
			System.out.println("vol2="+vol2);
		}//main end
	}//class end
