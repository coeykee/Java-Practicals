/*Passing information to methode*/
class box 
 {
	double width;
	double height;
	double depth;
	
	double volume()
		{
			return width*height*depth;
		}
	void setDim(double W,double H, double D)
		{
			width=W;
			height=H;
			depth=D;
		}
 }

class boxdemo2
 {
	public static void main(String a[])
	{
		box b1=new box();
		b1.setDim(10.2,12.5,13.2);
		System.out.println("Volume of box="+b1.volume());
	}//Main End
}//Class End
