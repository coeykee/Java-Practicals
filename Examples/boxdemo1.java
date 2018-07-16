//intro to methods in class
class box
	{
		double w;
		double h;
		double d;
		void vol()
			{
				System.out.println("Volume="+w*h*d);
			}
	}//box End

class boxdemo1
	{
	 public static void main(String a[])
		{
			box b1=new box();
			b1.w=10.5;
			b1.h=21.5;
			b1.d=20;
			b1.vol();
		}//Main end
}//Class End
