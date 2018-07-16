/*Returning object as parameter & consructor overloading*/
import java.util.*;
class box
{
	double width;
	double height;
	double depth;

	public box() {}
	public box(box ob)
	 {
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	 }

	public box(double len)
	 {
		width=height=depth=len;
	 }

 	public box(double W, double H, double D)
	 {
 		width=W;
		height=H;
		depth=D;
	 }

  	double volume()
	 {
 		return width*height*depth;
	 }
}

class ob_as_para
{ 
	public static void main(String a[])
	 {
 		box b1=new box();
		box b2=new box(b1);
		box b3=new box(10.5,20.5,30);
		box b4=new box(11.5);
		System.out.println("Volume1="+b1.volume());
		System.out.println("Volume2="+b2.volume());
		System.out.println("Volume3="+b3.volume());
		System.out.println("Volume4="+b4.volume());
	 }//Main Ends
}//Class Ends
