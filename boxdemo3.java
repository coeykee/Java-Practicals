//constructor intro | Default and parameterised constructor
import java.util.*;
class box
	{
		double w,h,d;
		//constructor
		box()
		{		
		 w=12.3;
		 h=21.5;
		 d=20;
		}
 
		//parameterised
		box(double X,double Y,double Z)
		{
			w=X;
			h=Y;
			d=Z;
		}

		double volume()
		{
			return w*h*d;
		}
	}//box end

class boxdemo3
	{
	public static void main(String a[])
		{
			box b1=new box();
			box b2=new box(25.0,56.1,10.0);
			double vol=b1.volume();
			double vol2=b2.volume();
			System.out.println("vol1="+vol);
			System.out.println("vol2="+vol2);
		}//Main End
	}//Class End
